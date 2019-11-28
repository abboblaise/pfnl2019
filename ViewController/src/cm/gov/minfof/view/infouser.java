package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class infouser  {
    private UserData _usr;

    
    public infouser() {
        FacesContext fc = FacesContext.getCurrentInstance();

        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        _usr = (UserData) session.getAttribute("user");
        _usr.setEstadmin(false);
        
        System.out.println("Nom user "+_usr.getNonuser());
    }
    
    
    public void setUsr(UserData _usr) {
        this._usr = _usr;
    }

    public UserData getUsr() {
        return _usr;
    }
}
