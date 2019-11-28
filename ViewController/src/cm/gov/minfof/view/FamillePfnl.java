package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class FamillePfnl {
    ShowJqNotification notifObj = new ShowJqNotification();
    public FamillePfnl() {
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

    public String enregistreFamillePfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomFamille = notifObj.getValueOfField("FamillePfnlView1Iterator", "Nomfamille");
        notifObj.showNoticeMessageAction("Enregistrement effectué! La famille <b>"+ nomFamille +" </b>a été enregistrée avec succès");
        return null;
    }

    public String supprimeFamillePfnl() {
        String nomFamille = notifObj.getValueOfField("FamillePfnlView1Iterator", "Nomfamille");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La famille <b>"+ nomFamille +" </b>a été supprimée avec succès");
        return null;
    }

    public String creerFamille() {
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
            supprimeFamillePfnl();
        }
    }

    public String annulerFamille() {
        notifObj.annulerParent("FamillePfnlView1Iterator");
        return null;
    }
}
