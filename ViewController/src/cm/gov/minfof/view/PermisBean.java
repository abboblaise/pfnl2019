package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.PartiesProduitsPfnlViewRowImpl;
import cm.gov.minfof.model.entityviewobject.PermisViewRowImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletRowImpl;

import cm.gov.minfof.model.entityviewobject.typeDocViewFinalRowImpl;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.math.BigDecimal;

import java.util.Iterator;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.util.ResetUtils;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

import org.apache.myfaces.trinidad.event.DisclosureEvent;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class PermisBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    private boolean observation;
    private boolean departement;
    private boolean region;
    private boolean quotas;
    private boolean uniteMesure;
    private boolean dateDebutVisible;
    private boolean dateFinVisible;
    private boolean dateDebutObligatoire;
    private boolean dateFinObligatoire;
    
/*    private boolean departementObligatoire;
    private boolean regionObligatoire;
    private boolean quotasObligatoire;
    private boolean uniteMesureObligatoire; */
    

    public PermisBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public BindingContainer getBindingContainer() {
        BindingContext bindingContext = BindingContext.getCurrent();
        return bindingContext.getCurrentBindingsEntry();
    }

    public Object executemethode(String mthod) {
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String CreerPermis() {
        System.out.println("Je crée un nouveau permis");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de g??n??rer les ids facilement
       // masquerDesChamps();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("Erreur " + operationBinding.getErrors());
            return null;
        }
        return null;
    }

    public String CreerDetailPermis() {
        //executemethode("Commit");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de g??n??rer les ids facilement
        masquerDesChamps();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String EnregistrePermis() {
        System.out.println("Je suis plutot ici");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String SupprimePermis() {
        String numPermis = notifObj.getValueOfField("PermisView1Iterator", "Numeropermis");
        File f = new File(notifObj.getValueOfField("PermisView1Iterator", "Cheminfichier"));
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        try {
            f.delete();
        } catch (Exception e) {
        }
        notifObj.showNoticeMessageAction("Suppression effectué! Le permis <b>" + numPermis +
                                         " </b>a été supprimé avec succès");
        return null;
    }

    public String supprimerDetailsPermis1() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        masquerDesChamps();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La ligne a été supprimée avec succès");
        return null;
    }

    public String creerDetailsPermis1() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de g??n??rer les ids facilement
        masquerDesChamps();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void onPermisQuery(QueryEvent queryEvent) {
        System.out.println("Je suis dans la méthode onPermisQuery");
        BindingContext bctx = BindingContext.getCurrent();
        DCBindingContainer bindings = (DCBindingContainer) bctx.getCurrentBindingsEntry();

        //access the method bindings to set the bind variables on the ViewCriteria
        OperationBinding rangeStartOperationBinding = bindings.getOperationBinding("setDebut");
        OperationBinding rangeEndOperationBinding = bindings.getOperationBinding("setFin");

        // get the start date and end date from the temporary valiables
        AttributeBinding attr = (AttributeBinding) bindings.getControlBinding("debut1");
        Timestamp sd = (Timestamp) attr.getInputValue();
        attr = (AttributeBinding) bindings.getControlBinding("fin1");
        Timestamp ed = (Timestamp) attr.getInputValue();

        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("PermisView1Iterator");
        ViewObjectImpl ttVO = (ViewObjectImpl) iterIB.getViewObject();
        ViewCriteria vc = ttVO.getViewCriteria("PermisViewCriteria");
        VariableValueManager vvm_vc = vc.ensureVariableManager();
        vvm_vc.setVariableValue("Debut", sd);
        vvm_vc.setVariableValue("Fin", ed);
        ttVO.setApplyViewCriteriaNames(new String[] { "PermisViewCriteria" });

        invokeMethodExpression("#{bindings.PermisView1Query.processQuery}", Object.class, QueryEvent.class, queryEvent);
    }

    public Object invokeMethodExpression(String expr, Class returnType, Class[] argTypes, Object[] args) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elctx = fc.getELContext();
        ExpressionFactory elFactory = fc.getApplication().getExpressionFactory();
        MethodExpression methodExpr = elFactory.createMethodExpression(elctx, expr, returnType, argTypes);
        return methodExpr.invoke(elctx, args);
    }

    public Object invokeMethodExpression(String expr, Class returnType, Class argType, Object argument) {
        return invokeMethodExpression(expr, returnType, new Class[] { argType }, new Object[] { argument });
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            SupprimePermis();
        }
    }

    public void onDetailPermis1(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimerDetailsPermis1();
        }
    }

    public String enregistrePermis() {
        System.out.println("Vous avez appuyez sur enregistrer");

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("Il y a des erreurs");
            for (int i = 0; i < operationBinding.getErrors().size(); i++) {
                System.out.println("erreur = " + operationBinding.getErrors().get(i));
            }

            return null;
        }
        masquerDesChamps();
        masquerLesChampsDates(null);
        String numPermis = notifObj.getValueOfField("PermisView1Iterator", "Numeropermis");
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le permis <b>" + numPermis +
                                         " </b>a été enregistré avec succès");
        return null;
    }

    private String numeroPermis() {
        String numPermis = "";
        return numPermis;
    }

    /**Method to upload file to actual path on Server*/
    private String uploadFile(UploadedFile file) {
        UploadedFile myfile = file;
        String path = null;
        if (myfile == null) {
        } else {
            // All uploaded files will be stored in below path
            path = myfile.getFilename();
            int lastIndex = path.lastIndexOf(".");
            int lenght = path.length();
            System.out.println("lastIndex = " + lastIndex + " length = " + lenght);
            String nomSansExtension = path.substring(0, lastIndex);
            System.out.println("Sans extension = " + nomSansExtension);
            String numPermis = notifObj.getValueOfField("PermisView1Iterator", "Numeropermis");
            System.out.println("numero permis = " + numPermis);
            if (numPermis == null) {
                FacesContext fc = FacesContext.getCurrentInstance();
                UIViewRoot root = fc.getViewRoot();
                RichInputText numPermisInputText = (RichInputText) findComponent(root, "it1");
                numPermis = numPermisInputText.getValue().toString();
            }
            String vraiChaine = path.replaceFirst(nomSansExtension, numPermis);
            nomSansExtension.concat(path.substring(lastIndex));
            System.out.println("vraie chaine = " + vraiChaine);
            path = vraiChaine;

            InputStream inputStream = null;
            try {
                FileOutputStream out = new FileOutputStream(path);
                inputStream = myfile.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead = 0;
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();
                File f = new File(path);
                System.out.println("chemin absolu = " + f.getAbsolutePath());
                out.close();
            } catch (Exception ex) {
                // handle exception
                ex.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        //Returns the path where file is stored
        return path;
    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
        return createParam;

    }

    public void uploadFileVCE(ValueChangeEvent valueChangeEvent) {
        if (valueChangeEvent.getNewValue() != null) {
            //Get File Object from VC Event
            UploadedFile fileVal = (UploadedFile) valueChangeEvent.getNewValue();
            //Upload File to path- Return actual server path
            String path = uploadFile(fileVal);
            System.out.println(fileVal.getContentType());
            //Method to insert data in table to keep track of uploaded files
            /*    OperationBinding ob = executeOperation("setFileData");
            ob.getParamsMap().put("Nomfichier", fileVal.getFilename());
            ob.getParamsMap().put("Cheminfichier", path);
            ob.getParamsMap().put("Typefichier", fileVal.getContentType());
            ob.execute(); */
            System.out.println("Nomfichier = " + fileVal.getFilename());
            System.out.println("Cheminfichier = " + path);
            System.out.println("Typefichier = " + fileVal.getContentType());

            FacesContext fc = FacesContext.getCurrentInstance();
            UIViewRoot root = fc.getViewRoot();

            FacesContext context = FacesContext.getCurrentInstance();
            Application application = context.getApplication();
            ValueBinding binding = application.createValueBinding("it9");
            System.out.println("binding = " + binding);

            RichInputText nomFichierInputText = (RichInputText) findComponent(root, "it9");
            RichInputText cheminFichierInputText = (RichInputText) findComponent(root, "it10");
            System.out.println("nomFichierInputText = " + nomFichierInputText);
            nomFichierInputText.setValue(fileVal.getFilename());
            cheminFichierInputText.setValue(path);
            // Reset inputFile component after upload
            //  ResetUtils.reset(valueChangeEvent.getComponent());
        }
    }


    private static UIComponent getUIComponentOfId(UIComponent root, String id) {
        if (root.getId().equals(id)) {
            return root;
        }
        if (root.getChildCount() > 0) {
            for (UIComponent subUiComponent : root.getChildren()) {
                UIComponent returnComponent = getUIComponentOfId(subUiComponent, id);
                if (returnComponent != null) {
                    return returnComponent;
                }
            }
        }
        return null;
    }

    private UIComponent findComponent(UIComponent base, String id) {

        if (id.equals(base.getId())) {
            return base;
        }
        UIComponent children = null;
        UIComponent result = null;
        Iterator childrens = base.getFacetsAndChildren();
        while (childrens.hasNext() && (result == null)) {
            children = (UIComponent) childrens.next();
            if (id.equals(children.getId())) {
                result = children;
                break;
            }
            result = findComponent(children, id);
            if (result != null) {
                break;
            }
        }
        return result;
    }


    public void downloadFileListener(FacesContext facesContext, OutputStream outputStream) throws IOException {
        String pathFichier = notifObj.getValueOfField("PermisView1Iterator", "Cheminfichier");
        File filed = new File(pathFichier);
        FileInputStream fis;
        byte[] b;
        try {
            fis = new FileInputStream(filed);

            int n;
            while ((n = fis.available()) > 0) {
                b = new byte[n];
                int result = fis.read(b);
                outputStream.write(b, 0, b.length);
                if (result == -1)
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputStream.flush();
    }


    public String annulerPermis() {
        notifObj.annulerParent("PermisView1Iterator");
        return null;
    }

    public String annulerDetailsPermis() {
        notifObj.annulerParentEtDetails("PermisView1Iterator", "DetailpermisView6Iterator");
        return null;
    }

    public void changedUnitMesure(ValueChangeEvent valueChangeEvent) {
        System.out.println("Je suis ici et je marche");
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        filtrerLesPartiesProduitsParId(bd);
        masquerDesChamps();
        
        /*   DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        ViewObject vue = am.findViewObject("UniteMesureWithPartieProduitPfnl1");
        ViewCriteriaManager vcm = vue.getViewCriteriaManager();
        ViewCriteria vcr = vcm.getViewCriteria("UniteMesureWithPartieProduitPfnlCriteria");
        VariableValueManager vvm = vcr.ensureVariableManager();
        vvm.setVariableValue("idpartieproduitpfnlbind", v.toString());
        vue.applyViewCriteria(vcr);
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        System.out.println("valeur = " + bd.longValue());
        vue.executeQuery(); */
    }
    
    private void chargerLesProduits(BigDecimal typeDocument)
    {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLibelleProduitComplet1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        
        String requete = "SELECT \n" + 
        "    CONCAT(produitspfnl.nomcommercial,'(',\n" + 
        "    partiesrecoltees.nompartierecoltee,')') as Libelle, \n" + 
        "    partiesproduitspfnl.idpartiesproduitspfnl as Idpartiesproduitspfnl,\n" + 
        "    categorieunitemesure.idcategorieunitemesure as Idcategorieunitemesure\n" + 
        "FROM \n" + 
        "    produitspfnl, \n" + 
        "    partiesrecoltees, \n" + 
        "    partiesproduitspfnl,\n" + 
        "    unitemesure,\n" + 
        "    categorieunitemesure,\n" + 
        "    categorieproduit\n" + 
        "WHERE \n" + 
        "    produitspfnl.idproduitspfnl = partiesproduitspfnl.idproduitspfnl AND \n" + 
        "    partiesrecoltees.idpartiesrecoltees = partiesproduitspfnl.idpartiesrecoltees AND\n" + 
        "    partiesproduitspfnl.idunitemesure = unitemesure.idunitemesure AND\n" + 
        "    categorieunitemesure.idcategorieunitemesure = unitemesure.idcategorie AND\n" + 
        "    categorieproduit.idcategorieproduit=produitspfnl.idcategorie";
        
        if (typeDocument.longValue() == 1 || typeDocument.longValue() == 2)
        {
            
        }
        
        if (typeDocument.longValue() == 3)
        {
            requete = "SELECT \n" + 
            "    CONCAT(produitspfnl.nomcommercial,'(',\n" + 
            "    partiesrecoltees.nompartierecoltee,')') as Libelle, \n" + 
            "    partiesproduitspfnl.idpartiesproduitspfnl as Idpartiesproduitspfnl,\n" + 
            "    categorieunitemesure.idcategorieunitemesure as Idcategorieunitemesure\n" + 
            "FROM \n" + 
            "    produitspfnl, \n" + 
            "    partiesrecoltees, \n" + 
            "    partiesproduitspfnl,\n" + 
            "    unitemesure,\n" + 
            "    categorieunitemesure,\n" + 
            "    categorieproduit\n" + 
            "WHERE \n" + 
            "    produitspfnl.idproduitspfnl = partiesproduitspfnl.idproduitspfnl AND \n" + 
            "    partiesrecoltees.idpartiesrecoltees = partiesproduitspfnl.idpartiesrecoltees AND\n" + 
            "    partiesproduitspfnl.idunitemesure = unitemesure.idunitemesure AND\n" + 
            "    categorieunitemesure.idcategorieunitemesure = unitemesure.idcategorie AND\n" + 
            "    categorieproduit.idcategorieproduit=produitspfnl.idcategorie AND\n" + 
            "    categorieproduit.quotas=0";
        }
        
        System.out.println("EXECUTION " + typeDocument.longValue());
        vo.remove();
      //  vo.setQuery(requete);
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("getLibelleProduitComplet1", requete, "cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl");
        vo.executeQuery();
        vo.clearCache();
        System.out.println("FIN DE L'EXECUTION");
    }
    
    public void filtrerLesPartiesProduitsParId(BigDecimal bd)
    {
        System.out.println("Entree dans la methode filtrerLesPartiesProduitsParId");
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("UniteMesureWithPartieProduitPfnl1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        System.out.println("vo name = " + vo.getName() + "vo = " + vo);
        
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        ViewObject vue = am.findViewObject("UniteMesureWithPartieProduitPfnl1");
        
        boolean egalite = vo == vue;
        System.out.println("Egalite = " + egalite);
        
        String requete;
        
        if (bd == null)
        {
            requete = "select distinct idunitemesure as Idunitemesure, libelleunitemesure as Libelleunitemesure, idcategorie as Idcategorie, \n" + 
        "  arrondi as Arrondi, ordregrandeur as Ordregrandeur, ratio as Ratio, actif as Actif\n" + 
        "from unitemesure";
        }
        else
        {
            requete = "select idunitemesure as Idunitemesure, libelleunitemesure as Libelleunitemesure, idcategorie as Idcategorie, \n" + 
        "  arrondi as Arrondi, ordregrandeur as Ordregrandeur, ratio as Ratio, actif as Actif\n" + 
        "from unitemesure where unitemesure.idcategorie in (\n" + 
        "select unitemesure.idcategorie from unitemesure, partiesproduitspfnl\n" + 
        "where partiesproduitspfnl.idunitemesure=unitemesure.idunitemesure and partiesproduitspfnl.idpartiesproduitspfnl="+ bd.toString() +")";
        }
        vo.remove();
        //vo.executeEmptyRowSet();
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("UniteMesureWithPartieProduitPfnl1", requete);
        
        vo.executeQuery();

        
 /*       vo.applyViewCriteria(null);
        vo.executeQuery();
        ViewCriteria vc = vo.getViewCriteria("UniteMesureWithPartieProduitPfnlCriteria");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("idpartieproduitpfnlbind", bd);
        vo.executeQuery();
        System.out.println("Après l'execution avec bd = " + bd.longValue());
        
             while (vo.hasNext()) {
            System.out.println("entree dans la condition hasNext");
            Row r = vo.next();
            System.out.println("row = " + r + " idcategorie = " + r.getAttribute("idcategorie"));
            
        }*/
        System.out.println("Fin de l'execution");
    }
    
    public BigDecimal getIdPartieProduitPfnlCourant()
    {
        // Get the binding
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();

        // Get the sepecific list binding
        JUCtrlListBinding listBinding = (JUCtrlListBinding) bindings.get("Idpartieproduitpfnl");

        // Get the value which is currently selected
        Object selectedValue = listBinding.getSelectedValue();
        ViewRowImpl viewRow = (ViewRowImpl) selectedValue;
        Object idResultat = viewRow.getAttribute(("Idpartiesproduitspfnl"));
        BigDecimal bd = new BigDecimal(idResultat.toString());
        return bd;
    }
    
    public BigDecimal getIdTypeDocumentCourant()
    {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        JUCtrlListBinding listBinding = (JUCtrlListBinding) bindings.get("Idtypedocument");
        Object selectedValue = listBinding.getSelectedValue();
        typeDocViewFinalRowImpl viewRow = (typeDocViewFinalRowImpl) selectedValue;
        Object idResultat = viewRow.getAttribute(("Idtypedocument"));
        BigDecimal bd = new BigDecimal(idResultat.toString());
        return bd;
    }
    
    private void masquerLesChampsDates(BigDecimal idTypeDocCourant)
    {
        if(idTypeDocCourant == null)
            idTypeDocCourant = getIdTypeDocumentCourant();  
        System.out.println("Type document = " + idTypeDocCourant.longValue());
        if(idTypeDocCourant.longValue() == 1 || idTypeDocCourant.longValue() == 2)
        {
            dateDebutObligatoire = true;
            dateDebutVisible = true;
            dateFinVisible = true;
            dateFinObligatoire = true;
        }
        
        if(idTypeDocCourant.longValue() == 3)
        {
            dateDebutObligatoire = false;
            dateDebutVisible = true;
            dateFinVisible = false;
            dateFinObligatoire = false;
        }
        
    }
    
    private void masquerDesChamps(){
        BigDecimal idTypeDocCourant = getIdTypeDocumentCourant();
        chargerLesProduits(idTypeDocCourant);
        if(idTypeDocCourant.longValue() == 1)
        {
            observation = true;
            departement = false;
            region = true;
            quotas = true;
            uniteMesure = true;
        }
        
        if(idTypeDocCourant.longValue() == 2)
        {
            observation = true;
            departement = true;
            region = false;
            quotas = true;
            uniteMesure = true;
        }
        
        if(idTypeDocCourant.longValue() == 3)
        {
            observation = true;
            departement = false;
            region = false;
            quotas = false;
            uniteMesure = false;
        }
    }
    
    public void onConsultationTabDisclose(DisclosureEvent disclosureEvent) {
        masquerDesChamps();
        boolean bool = disclosureEvent.isExpanded();

        if (!bool) 
        {
            try 
            {
                BigDecimal bd = getIdPartieProduitPfnlCourant();
                filtrerLesPartiesProduitsParId(bd);
            } catch (NullPointerException ex) {}
        }
        else
        {
            filtrerLesPartiesProduitsParId(null);
        } 
    }
    
    //#####################################################
    
    public void permisSuivant(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Next1.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
            masquerLesChampsDates(null);
        } catch (NullPointerException ex) {}
    }
    
    public void permisPrecedent(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Previous1.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
            masquerLesChampsDates(null);
        } catch (NullPointerException ex) {}
    }
    
    public void permisPremier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.First1.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
            masquerLesChampsDates(null);
        } catch (NullPointerException ex) {}
    }
    
    public void permisDernier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Last1.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
            masquerLesChampsDates(null);
        } catch (NullPointerException ex) {}
    }
    
    //#######################################################

    public void detailPermisSuivant(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Next.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
        } catch (NullPointerException ex) {}
    }
    
    public void detailPermisPrecedent(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Previous.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
        } catch (NullPointerException ex) {}
    }
    
    public void detailPermisPremier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.First.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
        } catch (NullPointerException ex) {}
    }
    
    public void detailPermisDernier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Last.execute}", Object.class, ActionEvent.class, actionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
            masquerDesChamps();
        } catch (NullPointerException ex) {}
    }


    public void setObservation(boolean observation) {
        this.observation = observation;
    }

    public boolean isObservation() {
        return observation;
    }

    public void setDepartement(boolean departement) {
        this.departement = departement;
    }

    public boolean isDepartement() {
        return departement;
    }

    public void setRegion(boolean region) {
        this.region = region;
    }

    public boolean isRegion() {
        return region;
    }

    public void setQuotas(boolean quotas) {
        this.quotas = quotas;
    }

    public boolean isQuotas() {
        return quotas;
    }
    
    public boolean isUniteMesure(){
        return uniteMesure;
    }
    
    public void setUniteMesure(boolean uniteMesure){
        this.uniteMesure = uniteMesure;
    }


    public void setDateDebutVisible(boolean dateDebutVisible) {
        this.dateDebutVisible = dateDebutVisible;
    }

    public boolean isDateDebutVisible() {
        return dateDebutVisible;
    }

    public void setDateFinVisible(boolean dateFinVisible) {
        this.dateFinVisible = dateFinVisible;
    }

    public boolean isDateFinVisible() {
        return dateFinVisible;
    }

    public void setDateDebutObligatoire(boolean dateDebutObligatoire) {
        this.dateDebutObligatoire = dateDebutObligatoire;
    }

    public boolean isDateDebutObligatoire() {
        return dateDebutObligatoire;
    }

    public void setDateFinObligatoire(boolean dateFinObligatoire) {
        this.dateFinObligatoire = dateFinObligatoire;
    }

    public boolean isDateFinObligatoire() {
        return dateFinObligatoire;
    }

    public void changedNomDepartement(ValueChangeEvent valueChangeEvent) {
        masquerDesChamps();
    }

    public void typeDocumentChange(ValueChangeEvent valueChangeEvent) {
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        masquerLesChampsDates(bd);
        chargerLesProduits(bd);
    }
    
    public void makeCurrentPermis(SelectionEvent selectionEvent) {
        invokeMethodExpression("#{bindings.PermisView11.collectionModel.makeCurrent}", Object.class, ActionEvent.class, selectionEvent);
        try 
        {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {}
    }
}
