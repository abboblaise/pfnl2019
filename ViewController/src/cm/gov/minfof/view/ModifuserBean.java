package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import cm.gov.minfof.model.entityviewobject.UtilisateurViewRowImpl;

import java.io.IOException;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.validator.ValidatorException;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;

import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class ModifuserBean {
    private String ancienpwd;
    private String confirmepwd;  
    private Boolean mpwd;
    
    public ModifuserBean() {
        mpwd=false;
    }


    public void setMpwd(Boolean mpwd) {
        this.mpwd = mpwd;
    }

    public Boolean getMpwd() {
        return mpwd;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void setAncienpwd(String ancienpwd) {
        this.ancienpwd = ancienpwd;
    }

    public String getAncienpwd() {
        return ancienpwd;
    }

    public void setConfirmepwd(String confirmepwd) {
        this.confirmepwd = confirmepwd;
    }

    public String getConfirmepwd() {
        return confirmepwd;
    }

    public String Deconnecter() {
        // Add event code here...
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
        //UserData u1 = (UserData) session.getAttribute("user");
        //System.out.println(u1.getLoginuser()+" "+u1.getNonuser()+" "+u1.getIdgroupe()+" "+u1.getNiveauintervention());
        UserData u = null;
        
        ctx.getExternalContext().getSessionMap().put("user",u);
        
        
        try {
            session.invalidate();
            ctx.getExternalContext().redirect("login.jsf");
            ctx.responseComplete();
        } catch (IOException e) {
            ctx.responseComplete();
        }
        return null;
    }

    public String EnregModif() throws IOException {
        //System.out.println("Entrée dans le commit");
        BindingContainer bindings = getBindings();
        /* DCIteratorBinding userpIter = (DCIteratorBinding) getBindings().get("UtilisateurView8Iterator");
        userpIter.getCurrentRow().setAttribute("Premiereconnexion", false);*/
        
        RichSelectBooleanCheckbox cb = (RichSelectBooleanCheckbox) findComponent(FacesContext.getCurrentInstance().getViewRoot(),"sbc1");
        boolean bb = (Boolean)cb.getValue();
        if (bb){
            OperationBinding operationBinding = bindings.getOperationBinding("changepwd");
            
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                return null;
            }
           // FacesContext fc = FacesContext.getCurrentInstance();
           // fc.getExternalContext().redirect("index.jsf");
            Deconnecter(); //pour renvoyer directement à la page de connexion
            return null;
        }
        return null;
    }
    
    public void Valideapwd(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        // Add event code here...
        String fieldVal = (String)object;
        RichOutputText it = (RichOutputText)uIComponent.findComponent("ot1");
        String pswd = it.getValue().toString();
        RichSelectBooleanCheckbox cb = (RichSelectBooleanCheckbox)uIComponent.findComponent("sbc1");
        boolean bb = (Boolean)cb.getValue();
        if (bb){
            //System.out.println("pwd = "+pswd);
            if(!pswd.equalsIgnoreCase(fieldVal)){
                FacesMessage message = new FacesMessage("L'ancien mot de passe que vous avez saisi n'est pas le bon");
                throw new ValidatorException(message);
            }
        }
    }

    public void Validepwd(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        // Add event code here...
        String fieldVal = (String)object;
        
        RichInputText it = (RichInputText)uIComponent.findComponent("it2");
        String password1 = (String)it.getValue();
        
        RichSelectBooleanCheckbox cb = (RichSelectBooleanCheckbox)uIComponent.findComponent("sbc1");
        boolean bb = (Boolean)cb.getValue();
        if (bb){
            //System.out.println("pwd = "+password1);
            if(!password1.equalsIgnoreCase(fieldVal)){
                FacesMessage message = new FacesMessage("Les deux mots de passe doivent être identiques");
                throw new ValidatorException(message);
            }
        }
    }
    
    private UIComponent findComponent(UIComponent base, String id) {

            if (id.equals(base.getId())) {
                return base;
            }
            UIComponent children = null;
            UIComponent result = null;
            Iterator childrens = base.getFacetsAndChildren();
            while (childrens.hasNext() && (result == null)) {
                children = (UIComponent) childrens.next();
                if (id.equals(children.getId())) {
                    result = children;
                    break;
                }
                result = findComponent(children, id);
                if (result != null) {
                    break;
                }
            }
            return result;
        }

    public String ModifUsr() throws IOException {
        // Add event code here...
        //System.out.println("Entrée dans le commit");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("modifuser");
        
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getExternalContext().redirect("index.jsf");
        return null;
    }
}
