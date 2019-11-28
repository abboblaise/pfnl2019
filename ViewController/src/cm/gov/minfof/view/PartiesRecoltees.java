package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PartiesRecoltees {
    ShowJqNotification notifObj = new ShowJqNotification();
    public PartiesRecoltees() {
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

    public String enregPartiesRecoltees() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomPartie = notifObj.getValueOfField("PartiesRecolteesView1Iterator", "Nompartierecoltee");
        notifObj.showNoticeMessageAction("Enregistrement effectué! La partie <b>"+ nomPartie +" </b>a été enregistrée avec succès");
        return null;
    }

    public String supprimePartieRecoltees() {
        String nomPartie = notifObj.getValueOfField("PartiesRecolteesView1Iterator", "Nompartierecoltee");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La partie <b>"+ nomPartie +" </b>a été supprimée avec succès");
        return null;
    }

    public String creerPartiesRecoltees() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimePartieRecoltees();
        }
    }

    public String annulerPartiesRecoltees() {
        notifObj.annulerParent("PartiesRecolteesView1Iterator");
        return null;
    }
}
