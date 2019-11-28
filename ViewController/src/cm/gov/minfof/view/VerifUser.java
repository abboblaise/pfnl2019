package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.UserData;

import com.bea.staxb.runtime.BindingContext;

import javax.faces.application.NavigationHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import javax.servlet.http.HttpSession;

import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;

import oracle.adfdt.model.objects.Bindings;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class VerifUser implements PhaseListener {
    //@Override
    public void afterPhase(PhaseEvent phaseEvent) {
        // TODO Implement this method
        System.out.println("design time = " + ADFContext.getCurrent().isDesignTime());
        if (!ADFContext.getCurrent().isDesignTime()) {
            FacesContext fc = phaseEvent.getFacesContext();

            HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
            UserData u = (UserData) session.getAttribute("user");
            boolean loginpage = fc.getViewRoot()
                                  .getViewId()
                                  .lastIndexOf("login") > -1 ? true : false;
            if (!loginpage && u == null) {
                NavigationHandler nh = fc.getApplication().getNavigationHandler();
                nh.handleNavigation(fc, null, "logout");
            } else {
                String viewId = fc.getViewRoot().getViewId();
                //System.out.println("view id = "+ viewId);
                //System.out.println("nom user = : "+u.getNonuser());
                String vid = viewId.substring(1);
                //System.out.println("vid = "+ vid);
                //if (!vid.equalsIgnoreCase("login.jsf")){
                if ((u != null) && (!vid.equals("page_modifpwd.jsf"))) {
                    if (u.getPconnect()) {
                        NavigationHandler nh = fc.getApplication().getNavigationHandler();
                        nh.handleNavigation(fc, null, "topwd");
                    }
                    String lespages = u.getPagesdugroupe();
                    if (vid.endsWith(".jsf")) {
                        if (lespages.lastIndexOf(vid) == -1) {
                            NavigationHandler nh = fc.getApplication().getNavigationHandler();
                            nh.handleNavigation(fc, null, "toindex");
                        }
                    }
                }
            }


        }


    }

    //@Override
    public void beforePhase(PhaseEvent phaseEvent) {
        // TODO Implement this method


    }

    //@Override
    public PhaseId getPhaseId() {
        // TODO Implement this method
        return PhaseId.RESTORE_VIEW;
    }
}
