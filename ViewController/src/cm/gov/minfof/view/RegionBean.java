package cm.gov.minfof.view;

import java.math.BigDecimal;

import java.util.ResourceBundle;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;
import javax.faces.event.ActionEvent;

import oracle.adf.model.binding.DCIteratorBinding;

public class RegionBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public RegionBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String enregistreRegion() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomRegion = notifObj.getValueOfField("RegionView1Iterator", "Nomregion");
        notifObj.showNoticeMessageAction("Enregistrement effectué! La région <b>"+ nomRegion +" </b>a été enregistrée avec succès");
        return null;
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

    public String supprimeRegion() {
        String nomRegion = notifObj.getValueOfField("RegionView1Iterator", "Nomregion");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! La région <b>"+ nomRegion +" </b>a été supprimée avec succès");
        return null;
    }

    public String creerInserer() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
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

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimeRegion();
        }
    }

    public String annulerRegion() {
        notifObj.annulerParent("RegionView1Iterator");
        return null;
    }
}
