package cm.gov.minfof.view;

import java.math.BigDecimal;

import java.util.Iterator;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;

public class ExportPfnlBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public ExportPfnlBean() {
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public BindingContainer getBindingContainer() {
    BindingContext bindingContext = BindingContext.getCurrent();
    return bindingContext.getCurrentBindingsEntry();
    }
    
    public Object executemethode(String mthod){
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String creerExport() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
     //   executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregExport() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Enregistrement effectué! L'export a été enregistré avec succès");
        return null;
    }

    public String deleteExport() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! L'export a été supprimé avec succès");
        return null;
    }

    public String creerDetailsExport() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
   //     executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deleteDetailsExport() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La ligne d'export a été supprimée avec succès");
        return null;
    }

    public String annulerExport() {
        notifObj.annulerParent("ExportpfnlView1Iterator");
        return null;
    }

    public void onExportQuery(QueryEvent queryEvent) {
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
        
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("ExportpfnlView1Iterator");
        ViewObjectImpl ttVO =  (ViewObjectImpl)iterIB.getViewObject();  
        ViewCriteria vc = ttVO.getViewCriteria("ExportpfnlViewCriteria");  
        VariableValueManager vvm_vc = vc.ensureVariableManager();         
        vvm_vc.setVariableValue("dateDebut",sd);         
        vvm_vc.setVariableValue("dateFin",ed); 
        ttVO.setApplyViewCriteriaNames(new String[]{"ExportpfnlViewCriteria"});         

        invokeMethodExpression("#{bindings.ExportpfnlView1Query.processQuery}", Object.class, QueryEvent.class,
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

    public void onDeleteExport(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            deleteExport();
        }
    }

    public void onDeleteDetailsExport(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            deleteDetailsExport();
        }
    }
    
    public void chargedetails(){
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getCoParPermisActif1Iterator");
        ViewObjectImpl vo =  (ViewObjectImpl)iterIB.getViewObject();  
        //ViewCriteria vc = vo.createViewCriteria();
        //ViewCriteriaRow vcr=vc.createViewCriteriaRow();
        
        RichSelectOneChoice soc = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc13");
        RichSelectOneChoice idpdt = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc6");
        RichSelectOneChoice unitemesure = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc5");
        RichSelectOneChoice lepays = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc14");
        RichInputText qte = (RichInputText)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "it6");
        
        BigDecimal bd= (BigDecimal)soc.getValue();
        BigDecimal idp = new BigDecimal(12);
        BigDecimal idum = new BigDecimal(7);
        BigDecimal idc = new BigDecimal(0);
        float laqte;
        double ddf;
        
        //vcr.setAttribute("Idcertificatorigine", bd);
        //vc.add(vcr);
        //vo.appendViewCriteria(vc);
        vo.setWhereClause("Idcertificatorigine = "+bd);
        vo.executeQuery();
        System.out.println("id certificat: "+bd);
        if(vo.hasNext()){
            Row rr1 = vo.next();
            idp=(BigDecimal)rr1.getAttribute("Idpartieproduitpfnl");
            idpdt.setValueExpression("value",getValueExpression(idp.toString()));
            
            idum=(BigDecimal)rr1.getAttribute("Idunitemesure");
            unitemesure.setValueExpression("value",getValueExpression(idum.toString()));
            
            laqte = Float.valueOf(rr1.getAttribute("Quantite").toString());
            //laqte = (float) rr1.getAttribute("Quantite");
            qte.setValueExpression("value",getValueExpression(rr1.getAttribute("Quantite").toString()));
            System.out.println("les données : "+idp+" "+idum+" "+laqte);
            
        }
        vo.setWhereClause(null);
        vo.executeQuery();
        
    }
    
    private ValueExpression getValueExpression(String name) {  
     FacesContext facesCtx = FacesContext.getCurrentInstance();  
     Application app = facesCtx.getApplication();  
     ExpressionFactory elFactory = app.getExpressionFactory();  
     ELContext elContext = facesCtx.getELContext();  
     return  elFactory.createValueExpression(elContext, name, Object.class);  
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

    public void chargechamps(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        charge2();
    }

    public String charge2() {
        // Add event code here...
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("CertificatorigineView1Iterator");
        ViewObjectImpl vo =  (ViewObjectImpl)iterIB.getViewObject();  
        //ViewCriteria vc = vo.createViewCriteria();
        //ViewCriteriaRow vcr=vc.createViewCriteriaRow();
        
        RichInputComboboxListOfValues soc = (RichInputComboboxListOfValues)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "numeroco1Id");
        //RichSelectOneChoice soc = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc13");
        RichSelectOneChoice idpdt = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc6");
        RichSelectOneChoice unitemesure = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc5");
        RichSelectOneChoice lepays = (RichSelectOneChoice)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "soc14");
        RichInputText qte = (RichInputText)findComponent(FacesContext.getCurrentInstance().getViewRoot(), "it6");
        
        System.out.println("soc ="+ soc.getValue());
        //BigDecimal bd= (BigDecimal)soc.getValue();
        String bd= soc.getValue().toString();
        BigDecimal idp = new BigDecimal(0);
        BigDecimal idum = new BigDecimal(0);
        BigDecimal idc = new BigDecimal(0);
        float laqte;
        double ddf;
        
        //vcr.setAttribute("Idcertificatorigine", bd);
        //vc.add(vcr);
        //vo.appendViewCriteria(vc);
     //   vo.setWhereClause("Idcertificatorigine = "+bd);
     vo.setWhereClause("Numeroco = '"+bd+"'");
        vo.executeQuery();
        System.out.println("id certificat: "+bd);
        if(vo.hasNext()){
            Row rr1 = vo.next();
            idp=(BigDecimal)rr1.getAttribute("Idpartieproduitpfnl");
            idpdt.setValue(idp);
            
            idc=(BigDecimal)rr1.getAttribute("Idpays");
            lepays.setValue(idc);
            
            idum=(BigDecimal)rr1.getAttribute("Idunitemesure");
            unitemesure.setValue(idum);
            
            laqte = Float.valueOf(rr1.getAttribute("Quantite").toString());
            //laqte = (float) rr1.getAttribute("Quantite");
            qte.setValue(laqte);
            System.out.println("les données : "+idp+" "+idum+" "+laqte);
            
        }
        vo.setWhereClause(null);
        vo.executeQuery();
        return null;
    }

    public String rafraichirGraphe() {
        System.out.println("je suis entré");
        DCIteratorBinding multiCritereIter = (DCIteratorBinding) getBindings().get("ExportMultiCritere1Iterator");
        DCIteratorBinding collecteCompileeIter = (DCIteratorBinding) getBindings().get("CompilExportDestination1Iterator");
        ViewCriteria multiCritereVC;
        
        ApplicationModule appModule = multiCritereIter.getViewObject().getApplicationModule();
        ViewObject vo = appModule.findViewObject("ExportMultiCritere1");
        ViewCriteria critere = vo.getViewCriteriaManager().getViewCriteria("ExportMultiCritereCriteria");
        
        multiCritereVC = multiCritereIter.getViewCriteria();
        System.out.println("criteria = " + multiCritereVC.getName());
        collecteCompileeIter.getViewObject().applyViewCriteria(critere);
        collecteCompileeIter.executeQuery();
        System.out.println("je suis sorti");
        
        return null;
    }

    public String annulerDetailsExport() {
        notifObj.annulerParentEtDetails("ExportpfnlView1Iterator", "DetailsexportpfnlView12Iterator");
        return null;
    }
}
