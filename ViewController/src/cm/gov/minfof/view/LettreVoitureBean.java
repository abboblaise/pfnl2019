package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import cm.gov.minfof.model.entityviewobject.PermisViewRowImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletRowImpl;

import cm.gov.minfof.model.entityviewobject.typeDocViewFinalRowImpl;

import java.math.BigDecimal;

import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

import org.apache.myfaces.trinidad.event.DisclosureEvent;
import org.apache.myfaces.trinidad.event.SelectionEvent;

public class LettreVoitureBean {
    ShowJqNotification notifObj = new ShowJqNotification();

    public LettreVoitureBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /*   public void creerLettreVoitureListener(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.CreateInsert.execute}", Object.class, ActionEvent.class, actionEvent);
        executemethode("Commit");
    } */

    public String creerLettreVoiture() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void onLettreVoitureQuery(QueryEvent queryEvent) {
        BindingContext bctx = BindingContext.getCurrent();
        DCBindingContainer bindings = (DCBindingContainer) bctx.getCurrentBindingsEntry();

        //access the method bindings to set the bind variables on the ViewCriteria
        OperationBinding rangeStartOperationBinding = bindings.getOperationBinding("setdateDebut");
        OperationBinding rangeEndOperationBinding = bindings.getOperationBinding("setdateFin");

        // get the start date and end date from the temporary valiables
        AttributeBinding attr = (AttributeBinding) bindings.getControlBinding("dateDebut1");
        Timestamp sd = (Timestamp) attr.getInputValue();
        attr = (AttributeBinding) bindings.getControlBinding("dateFin1");
        Timestamp ed = (Timestamp) attr.getInputValue();

        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("LettrevoitureView1Iterator");
        ViewObjectImpl ttVO = (ViewObjectImpl) iterIB.getViewObject();
        ViewCriteria vc = ttVO.getViewCriteria("LettrevoitureViewCriteria");
        VariableValueManager vvm_vc = vc.ensureVariableManager();
        vvm_vc.setVariableValue("dateDebut", sd);
        vvm_vc.setVariableValue("dateFin", ed);
        ttVO.setApplyViewCriteriaNames(new String[] { "LettrevoitureViewCriteria" });

        invokeMethodExpression("#{bindings.LettrevoitureView1Query.processQuery}", Object.class, QueryEvent.class,
                               queryEvent);
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

    public BindingContainer getBindingContainer() {
        BindingContext bindingContext = BindingContext.getCurrent();
        return bindingContext.getCurrentBindingsEntry();
    }

    public Object executemethode(String mthod) {
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String supprimerLettre() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Lettre de voiture supprimée avec succès");
        return null;
    }

    public void onDeleteLettre(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimerLettre();
        }
    }

    public String supprimerDetailsLettre() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Ligne de lettre de voiture supprimée avec succès");
        return null;
    }

    public void onDeleteDetailsLettre(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimerDetailsLettre();
        }
    }

    public String enregistrerLettre() {
        System.out.println("entree dans la methode enregsitre des lettres de voiture");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        DCBindingContainer bindings1 = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings1.getDataControl().getApplicationModule();
        ADFContext adfCtx = ADFContext.getCurrent();
        Map appScope = adfCtx.getApplicationScope();
        BigDecimal lastId = new BigDecimal(0);
        
        System.out.println("Avant le getExpressionValue");
        Object idEnCours = getExpressionValue("#{bindings.Idlettrevoiture1.inputValue}");

        System.out.println("Après le getExpressionValue");
        System.out.println("id en cours " + idEnCours);
        BigDecimal v = new BigDecimal(5);
        if (idEnCours instanceof BigDecimal)
            v = (BigDecimal) idEnCours;
        
        /********** ENREGISTREMENT DU DETAIL **********/
        Object idEnCoursDetails = getExpressionValue("#{bindings.Iddetailslettrevoiture.inputValue}");
        BigDecimal v1 = new BigDecimal(5);
        if (idEnCoursDetails instanceof BigDecimal)
            v1 = (BigDecimal) idEnCoursDetails;
        
        if (idEnCoursDetails == null || v1.toString().equals("-1")) {
            Object dernierId = appScope.get("iddetaillettrevoiture");
            if (dernierId == null) {
                //Je vais mettre à jour la liste qui compte les id
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastidDetailslettrevoiture1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();
                
                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);
                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("iddetaillettrevoiture", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("iddetaillettrevoiture", lastId);
            }
            
            setExpressionValue("#{bindings.Iddetailslettrevoiture.inputValue}", lastId);
            bindings = getBindings();
        }
        /********** FIN ENREGISTREMENT DU DETAIL **********/
        
        if (idEnCours == null || v.toString().equals("-1")) {
            System.out.println("idEnCours est nul ou vaut -1");
            Object dernierId = appScope.get("idlettrevoiture");
            if (dernierId == null) {
                System.out.println("dernierId vaut null");
                //Je vais mettre à jour la liste qui compte les id
                System.out.println("Avant getLastidLettrevoiture1Iterator");
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastidLettrevoiture1Iterator");
                System.out.println("Après getLastidLettrevoiture1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();
                System.out.println("Après l'exécution de la requete");
                
                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);
                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("idlettrevoiture", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("idlettrevoiture", lastId);
            }

            setExpressionValue("#{bindings.Idlettrevoiture1.inputValue}", lastId);
            bindings = getBindings();
        }
        operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Enregistrement effectué! Lettre de voiture enregistrée avec succès");
        return null;
    }

    public String creerDetailLV() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String refreshGraph() {

        DCIteratorBinding multiCritereIter =
            (DCIteratorBinding) getBindings().get("LettreVoitureMultiCritere1Iterator");
        DCIteratorBinding lettreCompileeDepartIter =
            (DCIteratorBinding) getBindings().get("CompilLettreVoiture1Iterator");
        DCIteratorBinding lettreCompileeDestIter =
            (DCIteratorBinding) getBindings().get("CompilLettreVoitureDestination1Iterator");
        ViewCriteria multiCritereVC;

        ApplicationModule appModule = multiCritereIter.getViewObject().getApplicationModule();
        ViewObject vo = appModule.findViewObject("LettreVoitureMultiCritere1");
        ViewCriteria critere = vo.getViewCriteriaManager().getViewCriteria("LettreVoitureMultiCritereCriteria");

        lettreCompileeDepartIter.getViewObject().applyViewCriteria(critere);
        lettreCompileeDestIter.getViewObject().applyViewCriteria(critere);
        lettreCompileeDepartIter.executeQuery();
        lettreCompileeDestIter.executeQuery();
        return null;
    }

    public String chargelocalite() {
        System.out.println("Entrée dans la procédure");
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        UserData ud = (UserData) session.getAttribute("user");

        System.out.println("Niveu intervention : " + ud.getNiveauintervention());
        System.out.println("Ideregion:" + ud.getIdregion() + "\n iddeartement: " + ud.getIddepartement());

        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLocaliteUser1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        if (ud.getNiveauintervention() == 2)
            vo.setWhereClause("Idregions=" + ud.getIdregion());

        if (ud.getNiveauintervention() == 3)
            vo.setWhereClause("Iddepartements=" + ud.getIddepartement());

        vo.executeQuery();
        while (vo.hasNext()) {
            Row rr1 = vo.next();
            System.out.println("nom localité : " + rr1.getAttribute("Nomlocalite"));
        }
        vo.setWhereClause(null);
        vo.executeQuery();
        System.out.println("Prcédure exécutée");
        return null;
    }

    public void valuechangepermis(ValueChangeEvent valueChangeEvent) {
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());

        BigDecimal idTypeDocument = getIdTypeDocumentCourant();
        System.out.println("id_permis = " + bd.longValue() + " id_type_doc = " + idTypeDocument.longValue());
        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        String requeteLocalite;

        if (idTypeDocument.longValue() == 1) {
            requeteLocalite =
                "select communes.idcommunes as Idcommune, localite.idlocalite as Idlocalite, localite.nomlocalite as Nomlocalite, departements.iddepartements as Iddepartements, regions.idregions as Idregions\n" +
                "from regions, departements, communes, localite, postecontrole\n" +
                "where (regions.idregions in (select detailpermis.idregions \n" +
                "                                                       from permis, detailpermis \n" +
                "                                                       where detailpermis.idpermis=permis.idpermis and permis.idpermis=" +
                bd.toString() + ") and \n" + "               departements.idregions=regions.idregions and \n" +
                "               communes.iddepartements=departements.iddepartements and\n" +
                "        localite.idpostecontrole=postecontrole.idpostecontrole and communes.idcommunes=postecontrole.idcommune)";

        } else {
            requeteLocalite =
                "select communes.idcommunes as Idcommune, localite.idlocalite as Idlocalite, localite.nomlocalite as Nomlocalite, departements.iddepartements as Iddepartements, regions.idregions as Idregions\n" +
                "from regions, departements, communes, localite, postecontrole\n" +
                "where (regions.idregions in (select detailpermis.idregions \n" +
                "                                                       from permis, detailpermis \n" +
                "                                                       where detailpermis.idpermis=permis.idpermis and permis.idpermis=" +
                bd.toString() + ") and \n" + "               departements.idregions=regions.idregions and \n" +
                "               communes.iddepartements=departements.iddepartements and\n" +
                "        localite.idpostecontrole=postecontrole.idpostecontrole and communes.idcommunes=postecontrole.idcommune)";

        }

        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("LocaliteLettreVoiture1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        vo.remove();
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("LocaliteLettreVoiture1", requeteLocalite);
        vo.executeQuery();
    }

    public String annulerDetailsLettre() {
        System.out.println("Je suis ici!");
        notifObj.annulerParentEtDetails("LettrevoitureView1Iterator", "DetailslettrevoitureView5Iterator");
        return null;
    }

    public String annulerLettreVoiture() {
        notifObj.annulerParent("LettrevoitureView1Iterator");
        return null;
    }

    public void typeDocChange(ValueChangeEvent valueChangeEvent) {
        System.out.println("Je suis ici et je marche");
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        BigDecimal idPer = new BigDecimal("1");


        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("permisActifView1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        System.out.println("vo name = " + vo.getName() + " vo = " + vo);

        DCIteratorBinding iterIBLocalite = (DCIteratorBinding) getBindings().get("LocaliteLettreVoiture1Iterator");
        ViewObjectImpl voLocalite = (ViewObjectImpl) iterIB.getViewObject();

        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        /*

        ViewObjectImpl vue = (ViewObjectImpl) am.findViewObject("permisActifView1");*/
        String requete = "";
        String requeteLocalite = "";
        if (bd.longValue() == 1 || bd.longValue() == 2) {

            requete =
                "SELECT   \n" + "    permis.idpermis as Idpermis,   \n" +
                "    permis.numeropermis as Numeropermis,   \n" + "    permis.datedelivrance as Datedelivrance,   \n" +
                "    permis.datefin as Datefin,   \n" + "    permis.idpermissionnaire as Idpermissionnaire,   \n" +
                "    permissionnairespnfl.Nomouraisonsociale as Nomouraisonsociale,\n" +
                "    permis.idtypedocument Idtypedocument\n" + "FROM  \n" + "    permis,  \n" +
                "    permissionnairespnfl  \n" +
                "where (permissionnairespnfl.IDPermissionnairesPNFL = permis.idpermissionnaire  \n" +
                "and permis.idtypedocument=" + bd.toString() + ")";

        } else {
            requete =
                "SELECT   \n" + "    permis.idpermis as Idpermis,   \n" +
                "    permis.numeropermis as Numeropermis,   \n" + "    permis.datedelivrance as Datedelivrance,   \n" +
                "    permis.datefin as Datefin,   \n" + "    permis.idpermissionnaire as Idpermissionnaire,   \n" +
                "    permissionnairespnfl.Nomouraisonsociale as Nomouraisonsociale,\n" +
                "    permis.idtypedocument as Idtypedocument\n" + "FROM  \n" + "    permis,  \n" +
                "    permissionnairespnfl  \n" +
                "where (permissionnairespnfl.IDPermissionnairesPNFL = permis.idpermissionnaire  \n" +
                " and permis.idtypedocument=" + bd.toString() + ")";
        }

        vo.remove();
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("permisActifView1", requete);
        vo.executeQuery();
        System.out.println("requete = " + requete);
    }

    public void lettrePremier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.First.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd1 = getIdTypeDocumentCourant();
            filtrerLesDocumentsParIdType(bd1);

            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void lettreDernier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Last.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd1 = getIdTypeDocumentCourant();
            filtrerLesDocumentsParIdType(bd1);

            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void lettreSuivant(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Next.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd1 = getIdTypeDocumentCourant();
            filtrerLesDocumentsParIdType(bd1);

            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    public static void setExpressionValue(String expression, Object newValue) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);

        //Check that the input newValue can be cast to the property type
        //expected by the managed bean.
        //If the managed Bean expects a primitive we rely on Auto-Unboxing
        Class bindClass = valueExp.getType(elContext);
        if (bindClass.isPrimitive() || bindClass.isInstance(newValue)) {
            valueExp.setValue(elContext, newValue);
        }
    }

    public void lettrePrecedent(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Previous.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd1 = getIdTypeDocumentCourant();
            filtrerLesDocumentsParIdType(bd1);

            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public BigDecimal getIdTypeDocumentCourant() {
        // Get the binding
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();

        // Get the sepecific list binding
        JUCtrlListBinding listBinding = (JUCtrlListBinding) bindings.get("Idtypedocument1");

        // Get the value which is currently selected
        Object selectedValue = listBinding.getSelectedValue();
        System.out.println("selectedValue = " + selectedValue);
        typeDocViewFinalRowImpl viewRow = (typeDocViewFinalRowImpl) selectedValue;
        System.out.println("viewRow ligne 355 = " + viewRow);
        Object idResultat = viewRow.getAttribute(("Idtypedocument"));
        BigDecimal bd = new BigDecimal(idResultat.toString());
        return bd;
    }

    public void permisChange(ValueChangeEvent valueChangeEvent) {
        System.out.println("Le permis a changé");
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        //    BigDecimal idType = getIdTypeDocumentCourant();
    }

    public void partieProduitChange(ValueChangeEvent valueChangeEvent) {
        Object v = valueChangeEvent.getNewValue();
        System.out.println("v= " + v);
        BigDecimal bd = new BigDecimal(v.toString());
        filtrerLesPartiesProduitsParId(bd);
    }

    public void filtrerLesDocumentsParIdType(BigDecimal bd) {
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("permisActifView1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        System.out.println("vo name = " + vo.getName() + " vo = " + vo);

        DCIteratorBinding iterIBLocalite = (DCIteratorBinding) getBindings().get("LocaliteLettreVoiture1Iterator");
        ViewObjectImpl voLocalite = (ViewObjectImpl) iterIB.getViewObject();

        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();
        /*

        ViewObjectImpl vue = (ViewObjectImpl) am.findViewObject("permisActifView1");*/
        String requete = "";
        String requeteLocalite = "";

        if (bd == null)
            requete =
                "SELECT   \n" + "    permis.idpermis as Idpermis,   \n" +
                "    permis.numeropermis as Numeropermis,   \n" + "    permis.datedelivrance as Datedelivrance,   \n" +
                "    permis.datefin as Datefin,   \n" + "    permis.idpermissionnaire as Idpermissionnaire,   \n" +
                "    permissionnairespnfl.Nomouraisonsociale as Nomouraisonsociale,\n" +
                "    permis.idtypedocument Idtypedocument\n" + "FROM  \n" + "    permis,  \n" +
                "    permissionnairespnfl  \n" +
                "where (permissionnairespnfl.IDPermissionnairesPNFL = permis.idpermissionnaire)";

        else if (bd.longValue() == 1 || bd.longValue() == 2) {

            requete =
                "SELECT   \n" + "    permis.idpermis as Idpermis,   \n" +
                "    permis.numeropermis as Numeropermis,   \n" + "    permis.datedelivrance as Datedelivrance,   \n" +
                "    permis.datefin as Datefin,   \n" + "    permis.idpermissionnaire as Idpermissionnaire,   \n" +
                "    permissionnairespnfl.Nomouraisonsociale as Nomouraisonsociale,\n" +
                "    permis.idtypedocument Idtypedocument\n" + "FROM  \n" + "    permis,  \n" +
                "    permissionnairespnfl  \n" +
                "where (permissionnairespnfl.IDPermissionnairesPNFL = permis.idpermissionnaire  \n" +
                "and permis.idtypedocument=" + bd.toString() + ")";

        } else if (bd.longValue() == 3) {
            requete =
                "SELECT   \n" + "    permis.idpermis as Idpermis,   \n" +
                "    permis.numeropermis as Numeropermis,   \n" + "    permis.datedelivrance as Datedelivrance,   \n" +
                "    permis.datefin as Datefin,   \n" + "    permis.idpermissionnaire as Idpermissionnaire,   \n" +
                "    permissionnairespnfl.Nomouraisonsociale as Nomouraisonsociale,\n" +
                "    permis.idtypedocument as Idtypedocument\n" + "FROM  \n" + "    permis,  \n" +
                "    permissionnairespnfl  \n" +
                "where (permissionnairespnfl.IDPermissionnairesPNFL = permis.idpermissionnaire  \n" +
                " and permis.idtypedocument=" + bd.toString() + ")";
        }

        vo.remove();
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("permisActifView1", requete);
        vo.executeQuery();
        System.out.println("requete = " + requete);
    }

    public void filtrerLesPartiesProduitsParId(BigDecimal bd) {
        System.out.println("Entree dans la methode filtrerLesPartiesProduitsParId");
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("UniteMesureWithPartieProduitPfnl1Iterator");
        ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
        System.out.println("vo name = " + vo.getName() + "vo = " + vo);

        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bindings.getDataControl().getApplicationModule();

        String requete;

        if (bd == null) {
            requete =
                "select distinct idunitemesure as Idunitemesure, libelleunitemesure as Libelleunitemesure, idcategorie as Idcategorie, \n" +
                "  arrondi as Arrondi, ordregrandeur as Ordregrandeur, ratio as Ratio, actif as Actif\n" +
                "from unitemesure";
        } else {
            requete =
                "select idunitemesure as Idunitemesure, libelleunitemesure as Libelleunitemesure, idcategorie as Idcategorie, \n" +
                "  arrondi as Arrondi, ordregrandeur as Ordregrandeur, ratio as Ratio, actif as Actif\n" +
                "from unitemesure where unitemesure.idcategorie in (\n" +
                "select unitemesure.idcategorie from unitemesure, partiesproduitspfnl\n" +
                "where partiesproduitspfnl.idunitemesure=unitemesure.idunitemesure and partiesproduitspfnl.idpartiesproduitspfnl=" +
                bd.toString() + ")";
        }
        vo.remove();
        vo = (ViewObjectImpl) am.createViewObjectFromQueryStmt("UniteMesureWithPartieProduitPfnl1", requete);
        vo.executeQuery();
        System.out.println("Fin de l'execution");
    }

    public BigDecimal getIdPartieProduitPfnlCourant() {
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

    public void onConsultationParentTabDisclose(DisclosureEvent disclosureEvent) {
        boolean bool = disclosureEvent.isExpanded();
        System.out.println("bool = " + bool);
        if (!bool) {
            try {
                BigDecimal bd = getIdTypeDocumentCourant();
                System.out.println("Je vais filtrer par type de document = " + bd.longValue());
                filtrerLesDocumentsParIdType(bd);
            } catch (NullPointerException ex) {
            }
        } else {
            System.out.println("Je vais filtrer par type de document = " + "null");
            filtrerLesDocumentsParIdType(null);
        }
    }

    public void onConsultationTabDisclose(DisclosureEvent disclosureEvent) {
        System.out.println("Je suis dans la methode qui va faire les derniers filtres");
        boolean bool = disclosureEvent.isExpanded();

        System.out.println("bool = " + bool);

        if (!bool) {
            try {
                BigDecimal bd = getIdPartieProduitPfnlCourant();
                filtrerLesPartiesProduitsParId(bd);
            } catch (NullPointerException ex) {
            }
        } else {
            filtrerLesPartiesProduitsParId(null);
        }
    }

    public void detailLettrePremier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.First1.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void detailLettreDernier(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Last1.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void detailLettreSuivant(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Next1.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void detailLettrePrecedent(ActionEvent actionEvent) {
        invokeMethodExpression("#{bindings.Previous1.execute}", Object.class, ActionEvent.class, actionEvent);
        try {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public void makeCurrentLettre(SelectionEvent selectionEvent) {
        invokeMethodExpression("#{bindings.LettrevoitureView1.collectionModel.makeCurrent}", Object.class,
                               ActionEvent.class, selectionEvent);
        try {
            BigDecimal bd = getIdPartieProduitPfnlCourant();
            filtrerLesPartiesProduitsParId(bd);
        } catch (NullPointerException ex) {
        }
    }

    public static Object getExpressionValue(String expression) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);
        Class bindClass = valueExp.getType(elContext);
        return valueExp.getValue(elContext);
    }
}
