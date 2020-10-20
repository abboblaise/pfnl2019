package cm.gov.minfof.view;

import java.math.BigDecimal;

import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;

public class ProduitPfnl3 {
    ShowJqNotification notifObj = new ShowJqNotification();
    public ProduitPfnl3() {
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

    public String creerProduitPfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
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

    @SuppressWarnings("oracle.jdeveloper.java.insufficient-catch-block")
    public String enregProduitPfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        
        
        ADFContext adfCtx = ADFContext.getCurrent();
        Map appScope = adfCtx.getApplicationScope();
        BigDecimal lastId = new BigDecimal(0);

        Object idEnCours = getExpressionValue("#{bindings.Idproduitspfnl.inputValue}");
        
        BigDecimal v = new BigDecimal(5);
        if (idEnCours instanceof BigDecimal)
            v = (BigDecimal) idEnCours;
        
        
        /********** ENREGISTREMENT DU DETAIL **********/
        System.out.println("Debut de l'enregistrement des details");
        Object idEnCoursDetails = getExpressionValue("#{bindings.Idpartiesproduitspfnl.inputValue}");
        BigDecimal v1 = new BigDecimal(5);
        if (idEnCoursDetails instanceof BigDecimal)
            v1 = (BigDecimal) idEnCoursDetails;
        
        if (idEnCoursDetails == null || v1.toString().equals("-1")) {
            Object dernierId = appScope.get("idpartieproduit");
            if (dernierId == null) {
                //Je vais mettre à jour la liste qui compte les id
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastIdartiesProduitsPfnl1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();
                
                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);
                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("idpartieproduit", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("idpartieproduit", lastId);
            }
            
            setExpressionValue("#{bindings.Idpartiesproduitspfnl.inputValue}", lastId);
            bindings = getBindings();
            System.out.println("Fin de l'enregistrement des details");
        }
        /********** FIN ENREGISTREMENT DU DETAIL **********/
        
        if (idEnCours == null || v.toString().equals("-1")) {
            Object dernierId = appScope.get("idproduitbean");
            if (dernierId == null) {
                //Je vais mettre à jour la liste qui compte les id
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastIdProduits1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();

                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);

                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("idproduitbean", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("idproduitbean", lastId);
            }

            setExpressionValue("#{bindings.Idproduitspfnl.inputValue}", lastId);
        }
        
        operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomProduit = notifObj.getValueOfField("ProduitsPfnlView12Iterator", "Nomcommercial");
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le produit <b>"+ nomProduit +" </b>a été enregistré avec succès");
        return null;
    }

    public String supprimeProduitPfnl() {
        String nomProduit = notifObj.getValueOfField("ProduitsPfnlView12Iterator", "Nomcommercial");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Le produit <b>"+ nomProduit +" </b>a été supprimé avec succès");
        return null;
    }

    public String creerPartieProduitPfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String supprimePartieProduitPfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Le sous-produit a été supprimé avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimeProduitPfnl();
        }

    }

    public void onDeletePartieProduitPfnl(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimePartieProduitPfnl();
        }
    }

    public String annulerProduitPfnl() {
        notifObj.annulerParent("ProduitsPfnlView12Iterator");
        return null;
    }

    public String annulerPartiesProduit() {
        notifObj.annulerParentEtDetails("ProduitsPfnlView12Iterator", "PartiesProduitsPfnlView24Iterator");
        return null;
    }
}
