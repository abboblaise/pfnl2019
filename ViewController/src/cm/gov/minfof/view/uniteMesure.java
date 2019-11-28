package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class uniteMesure {
    ShowJqNotification notifObj = new ShowJqNotification();
    public uniteMesure() {
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

    public String creerUniteMesure() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregistrerUniteMesure() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomUnite = notifObj.getValueOfField("UnitemesureView1Iterator", "Libelleunitemesure");
        notifObj.showNoticeMessageAction("Enregistrement effectué! L'unité de mesure <b>"+ nomUnite +" </b>a été enregistrée avec succès");
        return null;
    }

    public String supprimer() {
        String nomUnite = notifObj.getValueOfField("UnitemesureView1Iterator", "Libelleunitemesure");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! L'unité de mesure <b>"+ nomUnite +" </b>a été supprimée avec succès");
        return null;
    }

    public void onDeleteUnite(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimer();
        }
    }

    public String annulerUnite() {
        notifObj.annulerParent("UnitemesureView1Iterator");
        return null;
    }
}
