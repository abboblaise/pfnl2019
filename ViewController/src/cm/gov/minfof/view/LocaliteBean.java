package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class LocaliteBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public LocaliteBean() {
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

    public String CreerLocalite() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de g??n??rer les ids facilement
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String EnregistreLocalite() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomLocalite = notifObj.getValueOfField("LocaliteView1Iterator", "Nomlocalite");
        notifObj.showNoticeMessageAction("Enregistrement effectué! La localité <b>"+ nomLocalite +" </b>a été enregistrée avec succès");
        return null;
    }

    public String SupprimerLocalite() {
        String nomLocalite = notifObj.getValueOfField("LocaliteView1Iterator", "Nomlocalite");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La localité <b>"+ nomLocalite +" </b>a été supprimée avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            SupprimerLocalite();
        }
    }

    public String annulerLocalite() {
        notifObj.annulerParent("LocaliteView1Iterator");
        return null;
    }
}
