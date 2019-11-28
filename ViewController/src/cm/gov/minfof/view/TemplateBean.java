package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class TemplateBean implements Serializable {
    @SuppressWarnings("compatibility:-4001901986269197753")
    private static final long serialVersionUID = 1L;

    public TemplateBean() {
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
}
