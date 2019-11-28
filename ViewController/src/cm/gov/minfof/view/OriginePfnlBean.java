package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class OriginePfnlBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public OriginePfnlBean() {
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

    public String creerOriginePfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String supprimeOriginePfnl() {
        String nomSource = notifObj.getValueOfField("OriginespnflsView1Iterator", "Nomsource");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! <b>"+ nomSource +" </b>a été supprimée avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimeOriginePfnl();
        }
    }

    public String enregistreOriginePfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomSource = notifObj.getValueOfField("OriginespnflsView1Iterator", "Nomsource");
        notifObj.showNoticeMessageAction("Enregistrement effectué! <b>"+ nomSource +" </b>a été enregistrée avec succès");
        return null;
    }

    public String annulerOriginePfnl() {
        notifObj.annulerParent("OriginespnflsView1Iterator");
        return null;
    }
}
