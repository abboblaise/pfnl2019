package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import java.math.BigDecimal;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;

public class lettreVoiturePcBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public lettreVoiturePcBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

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
    
    public Object executemethode(String mthod){
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
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
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
        
        DCIteratorBinding multiCritereIter = (DCIteratorBinding) getBindings().get("LettreVoitureMultiCritere1Iterator");
        DCIteratorBinding lettreCompileeDepartIter = (DCIteratorBinding) getBindings().get("CompilLettreVoiture1Iterator");
        DCIteratorBinding lettreCompileeDestIter = (DCIteratorBinding) getBindings().get("CompilLettreVoitureDestination1Iterator");
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
    
    public String chargelocalite(){
        System.out.println("Entrée dans la procédure");
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        UserData ud = (UserData) session.getAttribute("user");
        
        System.out.println("Niveu intervention : "+ud.getNiveauintervention());
        System.out.println("Ideregion:"+ud.getIdregion()+"\n iddeartement: "+ud.getIddepartement());
        
        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLocaliteUser1Iterator");
        ViewObjectImpl vo =  (ViewObjectImpl)iterIB.getViewObject();  
        if (ud.getNiveauintervention() == 2)
        vo.setWhereClause("Idregions="+ud.getIdregion());
        
        if (ud.getNiveauintervention() == 3)
        vo.setWhereClause("Iddepartements="+ud.getIddepartement());
        
        vo.executeQuery();
        while (vo.hasNext()){
            Row rr1 = vo.next();
            System.out.println("nom localité : "+rr1.getAttribute("Nomlocalite"));
        }
        vo.setWhereClause(null);
        vo.executeQuery();
        System.out.println("Prcédure exécutée");
        return null;
    }

    public void valuechangepermis(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        //chargelocalite();
        
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
}
