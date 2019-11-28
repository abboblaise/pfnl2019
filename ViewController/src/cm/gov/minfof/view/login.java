package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.AppModuleImpl;

import cm.gov.minfof.model.entity.CrypteDecrypte;
import cm.gov.minfof.model.entity.UserData;

import java.io.IOException;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class login {
    private String Loginuser;
    private String Passwoduser;
    private RichGridCell gc1;
    private RichGridRow gr1;

    public void setLoginuser(String Loginuser) {
        this.Loginuser = Loginuser;
    }

    public String getLoginuser() {
        return Loginuser;
    }

    public void setPasswoduser(String Passwoduser) {
        this.Passwoduser = Passwoduser;
    }

    public String getPasswoduser() throws IOException {
        /*String str = Passwoduser;
        CrypteDecrypte cd = new CrypteDecrypte();
        Passwoduser=cd.codedecode(str, 2);*/
        
        return Passwoduser;
    }
    private RichPanelGridLayout pgl1;
    private RichForm f1;
    private RichDocument d1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichSpacer s1;
    private RichInputText it2;
    private RichButton b1;

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public String Connexion() throws IOException {
        // Add event code here...
        FacesMessage msg;
                FacesContext ctx = FacesContext.getCurrentInstance();
                String amDef = "cm.gov.minfof.model.entity.AppModule";
                String config = "AppModuleLocal";
                ApplicationModule ami = Configuration.createRootApplicationModule(amDef,config);
                AppModuleImpl am = (AppModuleImpl)ami;
                CrypteDecrypte cd = new CrypteDecrypte();
                String str = cd.codedecode(Passwoduser, 1);
                UserData util = am.findutil(Loginuser, str);
                if (util == null){
                    msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Utilisateur inexistant ou mot de passe incorrect", "");    
                    
                }else{
                    msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Utilisateur trouv? "+util.getNonuser(), "");    
                    ctx.getExternalContext().getSessionMap().put("user", util);
                    
                    ctx.getExternalContext().redirect("index.jsf");
                }
                
                
        ctx.addMessage("", msg);
        return null;
    }
}
