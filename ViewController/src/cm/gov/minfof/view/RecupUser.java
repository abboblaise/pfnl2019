package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class RecupUser {
    private UserData ud;


    public void setUd(UserData ud) {
        this.ud = ud;
    }

    public UserData getUd() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        ud = (UserData) session.getAttribute("user");
        /*System.out.println("ID groupe = "+ud.getIdgroupe());
        System.out.println("ID est admin = "+ud.getEstadmin());
        System.out.println("ID est info = "+ud.getEstinfo());        //ud.setEstadmin(true);*/
        //infouser iu = new infouser();
        //ud=iu.getUsr();
        return ud;
    }
}
