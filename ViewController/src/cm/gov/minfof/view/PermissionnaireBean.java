package cm.gov.minfof.view;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.validator.ValidatorException;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.commons.validator.routines.EmailValidator;

public class PermissionnaireBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public PermissionnaireBean() {
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

    public String creerPermissionnaire() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
     //   executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregistrerPermissionnaire() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String raisonSociale = notifObj.getValueOfField("PermissionnairespnflView1Iterator", "Nomouraisonsociale");
        notifObj.showNoticeMessageAction("Enregistrement effectué! L'acteur <b>"+ raisonSociale +" </b>a été enregistré avec succès");
        annulerPermissionnaire();
        return null;
    }

    public String supprimerPermissionnaire() {
        String raisonSociale = notifObj.getValueOfField("PermissionnairespnflView1Iterator", "Nomouraisonsociale");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! L'acteur <b>"+ raisonSociale +" </b>a été supprimé avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimerPermissionnaire();
        }
    }

    public void Validemail(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        String lemail = (String)object;
        System.out.println("lemail = " + lemail);
        if(!lemail.equals("") && !lemail.equals(null)){
            EmailValidator emailValidator = EmailValidator.getInstance();
            if(!emailValidator.isValid(lemail)){
                FacesMessage message = new FacesMessage("l'adresse email n'est pas au format valide");
                throw new ValidatorException(message);
            }
        }

    }

    public String annulerPermissionnaire() {
        notifObj.annulerParent("PermissionnairespnflView1Iterator");
        return null;
    }
}
