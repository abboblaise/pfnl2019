package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

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
    
    public Object executemethode(String mthod){
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

    public String enregistrePays() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomPays = notifObj.getValueOfField("PaysView1Iterator", "Nompays");
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le pays <b>"+ nomPays +" </b>a été enregistré avec succès");
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
        notifObj.showNoticeMessageAction("Suppresssion effectuée! Le pays <b>"+ nomPays +" </b>a été supprimé avec succès");
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
