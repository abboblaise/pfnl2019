package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

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

    public String enregProduitPfnl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
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
