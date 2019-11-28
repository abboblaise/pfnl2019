package cm.gov.minfof.model.entity;

import java.math.BigDecimal;


public class UserData {
    private BigDecimal idutilisateur;
    private String loginuser;
    private String Passworduser;
    private String nonuser;
    private String telephone;
    private String email;
    private int niveauintervention;
    private BigDecimal idregion;
    private BigDecimal iddepartement;
    private BigDecimal idgroupe;
    private Boolean estadmin ;
    private Boolean saisieexport;
    private Boolean saisietransit;
    private Boolean saisiecollecte;
    private Boolean estinfo;
    private Boolean estuser;
    private Boolean estcent;
    private Boolean estdep;
    private Boolean estreg;
    private String pagesdugroupe;
    private Boolean pconnect;


    public void setPassworduser(String Passworduser) {
        this.Passworduser = Passworduser;
    }

    public String getPassworduser() {
        return Passworduser;
    }

    public void setPconnect(Boolean pconnect) {
        this.pconnect = pconnect;
    }

    public Boolean getPconnect() {
        return pconnect;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSaisieexport(Boolean saisieexport) {
        this.saisieexport = saisieexport;
    }

    public Boolean getSaisieexport() {
        return saisieexport;
    }

    public void setSaisietransit(Boolean saisietransit) {
        this.saisietransit = saisietransit;
    }

    public Boolean getSaisietransit() {
        return saisietransit;
    }

    public void setSaisiecollecte(Boolean saisiecollecte) {
        this.saisiecollecte = saisiecollecte;
    }

    public Boolean getSaisiecollecte() {
        return saisiecollecte;
    }


    public void setEstinfo(Boolean estinfo) {
        this.estinfo = estinfo;
    }

    public Boolean getEstinfo() {
        return estinfo;
    }

    public void setEstuser(Boolean estuser) {
        this.estuser = estuser;
    }

    public Boolean getEstuser() {
        return estuser;
    }

    public void setEstcent(Boolean estcent) {
        this.estcent = estcent;
    }

    public Boolean getEstcent() {
        return estcent;
    }

    public void setEstdep(Boolean estdep) {
        this.estdep = estdep;
    }

    public Boolean getEstdep() {
        return estdep;
    }

    public void setEstreg(Boolean estreg) {
        this.estreg = estreg;
    }

    public Boolean getEstreg() {
        return estreg;
    }

    public void setIdutilisateur(BigDecimal idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public void setEstadmin(Boolean estadmin) {
        this.estadmin = estadmin;
    }

    public Boolean getEstadmin() {
        return estadmin;
    }

    public BigDecimal getIdutilisateur() {
        return idutilisateur;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setNonuser(String nonuser) {
        this.nonuser = nonuser;
    }

    public String getNonuser() {
        return nonuser;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNiveauintervention(int niveauintervention) {
        this.niveauintervention = niveauintervention;
    }

    public int getNiveauintervention() {
        return niveauintervention;
    }

    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
    }

    public BigDecimal getIdregion() {
        return idregion;
    }

    public void setIddepartement(BigDecimal iddepartement) {
        this.iddepartement = iddepartement;
    }

    public BigDecimal getIddepartement() {
        return iddepartement;
    }

    public void setIdgroupe(BigDecimal idgroupe) {
        this.idgroupe = idgroupe;
    }

    public BigDecimal getIdgroupe() {
        return idgroupe;
    }


    public void setPagesdugroupe(String pagesdugroupe) {
        this.pagesdugroupe = pagesdugroupe;
    }

    public String getPagesdugroupe() {
        return pagesdugroupe;
    }
    
    
}
