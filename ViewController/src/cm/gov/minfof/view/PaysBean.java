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

public class PaysBean {
    ShowJqNotification notifObj = new ShowJqNotification();

    public PaysBean() {
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

    public String creerPays() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de générer les ids facilement
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
    public String enregistrePays() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");

        ADFContext adfCtx = ADFContext.getCurrent();
        Map appScope = adfCtx.getApplicationScope();
        BigDecimal lastId = new BigDecimal(0);

        Object idEnCours = getExpressionValue("#{bindings.Idpays.inputValue}");

        BigDecimal v = new BigDecimal(5);
        if (idEnCours instanceof BigDecimal)
            v = (BigDecimal) idEnCours;


        /********** FIN ENREGISTREMENT DU DETAIL **********/

        if (idEnCours == null || v.toString().equals("-1")) {
            Object dernierId = appScope.get("idpaysbean");
            if (dernierId == null) {
                //Je vais mettre à jour la liste qui compte les id
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastIdPays1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();

                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);

                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("idpaysbean", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("idpaysbean", lastId);
            }

            setExpressionValue("#{bindings.Idpays.inputValue}", lastId);
        }

        operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomPays = notifObj.getValueOfField("PaysView1Iterator", "Nompays");
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le pays <b>" + nomPays +
                                         " </b>a été enregistré avec succès");
        return null;
    }

    public String supprimePays() {
        String nomPays = notifObj.getValueOfField("PaysView1Iterator", "Nompays");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppresssion effectuée! Le pays <b>" + nomPays +
                                         " </b>a été supprimé avec succès");
        return null;
    }

    public String creer() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Create");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void onDeletePays(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimePays();
        }
    }

    public String annulerPays() {
        notifObj.annulerParent("PaysView1Iterator");
        return null;
    }
}
