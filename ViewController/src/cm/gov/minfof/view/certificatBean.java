package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class certificatBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public certificatBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String PremierCertificat() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("First");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
    
    public Object executemethode(String mthod){
        BindingContainer bds = getBindings();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String EnregCertificat() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le certificat a été enregistré avec succès");
        return null;
    }

    public String Supprimersertificat() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectué! Le certificat a été supprimé avec succès");
        return null;
    }

    public String CreerCertificat() {
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
            Supprimersertificat();
        }
    }

    public String annulerCertificat() {
        notifObj.annulerParentEtDetails("PermisView1Iterator", "CertificatorigineView2Iterator");
        return null;
    }
}
