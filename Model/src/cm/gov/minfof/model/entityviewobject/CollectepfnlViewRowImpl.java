package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.CollectepfnlImpl;

import cm.gov.minfof.model.entity.UserData;
import cm.gov.minfof.model.entityviewobject.common.CollectepfnlViewRow;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 22 15:09:41 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CollectepfnlViewRowImpl extends ViewRowImpl implements CollectepfnlViewRow {


    public static final int ENTITY_COLLECTEPFNL = 0;

    @Override
    public String getIdentificateur() {
        // TODO Implement this method
        return null;
    }

    @Override
    public void setIdentificateur(String value) {
        // TODO Implement this method
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcollectepfnl,
        Datecollecte,
        Iddepartement,
        Idlocalite,
        Idposte,
        Idutilisateur,
        iddepartmental,
        idregional,
        Iddepartement1,
        Idlocalite1,
        Idposte1,
        idusr,
        nomdepartement,
        nomlocalite,
        nomposte,
        Idutilisateur1,
        nomuser,
        CollectepfnlView,
        DetailscollectepfnlView,
        DepartementView1,
        LocaliteView1,
        PostecontroleView1,
        UtilisateurView1,
        getLocaliteUser1,
        getPosteUserView1,
        getDepartementUser1,
        getUtilisateur1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IDCOLLECTEPFNL = AttributesEnum.Idcollectepfnl.index();
    public static final int DATECOLLECTE = AttributesEnum.Datecollecte.index();
    public static final int IDDEPARTEMENT = AttributesEnum.Iddepartement.index();
    public static final int IDLOCALITE = AttributesEnum.Idlocalite.index();
    public static final int IDPOSTE = AttributesEnum.Idposte.index();
    public static final int IDUTILISATEUR = AttributesEnum.Idutilisateur.index();
    public static final int IDDEPARTMENTAL = AttributesEnum.iddepartmental.index();
    public static final int IDREGIONAL = AttributesEnum.idregional.index();
    public static final int IDDEPARTEMENT1 = AttributesEnum.Iddepartement1.index();
    public static final int IDLOCALITE1 = AttributesEnum.Idlocalite1.index();
    public static final int IDPOSTE1 = AttributesEnum.Idposte1.index();
    public static final int IDUSR = AttributesEnum.idusr.index();
    public static final int NOMDEPARTEMENT = AttributesEnum.nomdepartement.index();
    public static final int NOMLOCALITE = AttributesEnum.nomlocalite.index();
    public static final int NOMPOSTE = AttributesEnum.nomposte.index();
    public static final int IDUTILISATEUR1 = AttributesEnum.Idutilisateur1.index();
    public static final int NOMUSER = AttributesEnum.nomuser.index();
    public static final int COLLECTEPFNLVIEW = AttributesEnum.CollectepfnlView.index();
    public static final int DETAILSCOLLECTEPFNLVIEW = AttributesEnum.DetailscollectepfnlView.index();
    public static final int DEPARTEMENTVIEW1 = AttributesEnum.DepartementView1.index();
    public static final int LOCALITEVIEW1 = AttributesEnum.LocaliteView1.index();
    public static final int POSTECONTROLEVIEW1 = AttributesEnum.PostecontroleView1.index();
    public static final int UTILISATEURVIEW1 = AttributesEnum.UtilisateurView1.index();
    public static final int GETLOCALITEUSER1 = AttributesEnum.getLocaliteUser1.index();
    public static final int GETPOSTEUSERVIEW1 = AttributesEnum.getPosteUserView1.index();
    public static final int GETDEPARTEMENTUSER1 = AttributesEnum.getDepartementUser1.index();
    public static final int GETUTILISATEUR1 = AttributesEnum.getUtilisateur1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CollectepfnlViewRowImpl() {
    }

    /**
     * Gets Collectepfnl entity object.
     * @return the Collectepfnl
     */
    public CollectepfnlImpl getCollectepfnl() {
        return (CollectepfnlImpl) getEntity(ENTITY_COLLECTEPFNL);
    }

    /**
     * Gets the attribute value for idcollectepfnl using the alias name Idcollectepfnl.
     * @return the idcollectepfnl
     */
    public BigDecimal getIdcollectepfnl() {
        return (BigDecimal) getAttributeInternal(IDCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idcollectepfnl using the alias name Idcollectepfnl.
     * @param value value to set the idcollectepfnl
     */
    public void setIdcollectepfnl(BigDecimal value) {
        setAttributeInternal(IDCOLLECTEPFNL, value);
    }

    /**
     * Gets the attribute value for datecollecte using the alias name Datecollecte.
     * @return the datecollecte
     */
    public Timestamp getDatecollecte() {
        return (Timestamp) getAttributeInternal(DATECOLLECTE);
    }

    /**
     * Sets <code>value</code> as attribute value for datecollecte using the alias name Datecollecte.
     * @param value value to set the datecollecte
     */
    public void setDatecollecte(Timestamp value) {
        setAttributeInternal(DATECOLLECTE, value);
    }


    /**
     * Gets the attribute value for iddepartement using the alias name Iddepartement.
     * @return the iddepartement
     */
    public BigDecimal getIddepartement() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for iddepartement using the alias name Iddepartement.
     * @param value value to set the iddepartement
     */
    public void setIddepartement(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENT, value);
    }


    /**
     * Gets the attribute value for idlocalite using the alias name Idlocalite.
     * @return the idlocalite
     */
    public BigDecimal getIdlocalite() {
        return (BigDecimal) getAttributeInternal(IDLOCALITE);
    }

    /**
     * Sets <code>value</code> as attribute value for idlocalite using the alias name Idlocalite.
     * @param value value to set the idlocalite
     */
    public void setIdlocalite(BigDecimal value) {
        setAttributeInternal(IDLOCALITE, value);
    }

    /**
     * Gets the attribute value for idposte using the alias name Idposte.
     * @return the idposte
     */
    public BigDecimal getIdposte() {
        return (BigDecimal) getAttributeInternal(IDPOSTE);
    }

    /**
     * Sets <code>value</code> as attribute value for idposte using the alias name Idposte.
     * @param value value to set the idposte
     */
    public void setIdposte(BigDecimal value) {
        setAttributeInternal(IDPOSTE, value);
    }

    /**
     * Gets the attribute value for idutilisateur using the alias name Idutilisateur.
     * @return the idutilisateur
     */
    public BigDecimal getIdutilisateur() {
        return (BigDecimal) getAttributeInternal(IDUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as attribute value for idutilisateur using the alias name Idutilisateur.
     * @param value value to set the idutilisateur
     */
    public void setIdutilisateur(BigDecimal value) {
        setAttributeInternal(IDUTILISATEUR, value);
    }

    /**
     * Gets the attribute value for iddepartmental using the alias name iddepartmental.
     * @return the iddepartmental
     */
    public BigDecimal getiddepartmental() {
        return (BigDecimal) getAttributeInternal(IDDEPARTMENTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for iddepartmental using the alias name iddepartmental.
     * @param value value to set the iddepartmental
     */
    public void setiddepartmental(BigDecimal value) {
        setAttributeInternal(IDDEPARTMENTAL, value);
    }

    /**
     * Gets the attribute value for idregional using the alias name idregional.
     * @return the idregional
     */
    public BigDecimal getidregional() {
        return (BigDecimal) getAttributeInternal(IDREGIONAL);
    }

    /**
     * Sets <code>value</code> as attribute value for idregional using the alias name idregional.
     * @param value value to set the idregional
     */
    public void setidregional(BigDecimal value) {
        setAttributeInternal(IDREGIONAL, value);
    }

    /**
     * Gets the attribute value for iddepartement using the alias name Iddepartement1.
     * @return the iddepartement
     */
    public BigDecimal getIddepartement1() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENT1);
    }

    /**
     * Sets <code>value</code> as attribute value for iddepartement using the alias name Iddepartement1.
     * @param value value to set the iddepartement
     */
    public void setIddepartement1(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENT1, value);
    }

    /**
     * Gets the attribute value for idlocalite using the alias name Idlocalite1.
     * @return the idlocalite
     */
    public BigDecimal getIdlocalite1() {
        return (BigDecimal) getAttributeInternal(IDLOCALITE1);
    }

    /**
     * Sets <code>value</code> as attribute value for idlocalite using the alias name Idlocalite1.
     * @param value value to set the idlocalite
     */
    public void setIdlocalite1(BigDecimal value) {
        setAttributeInternal(IDLOCALITE1, value);
    }

    /**
     * Gets the attribute value for idposte using the alias name Idposte1.
     * @return the idposte
     */
    public BigDecimal getIdposte1() {
        return (BigDecimal) getAttributeInternal(IDPOSTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for idposte using the alias name Idposte1.
     * @param value value to set the idposte
     */
    public void setIdposte1(BigDecimal value) {
        setAttributeInternal(IDPOSTE1, value);
    }

    /**
     * Gets the attribute value for idusr using the alias name idusr.
     * @return the idusr
     */
    public BigDecimal getidusr() {
        
        return (BigDecimal) getAttributeInternal(IDUSR);
    }

    /**
     * Sets <code>value</code> as attribute value for idusr using the alias name idusr.
     * @param value value to set the idusr
     */
    public void setidusr(BigDecimal value) {
        setAttributeInternal(IDUSR, value);
    }

    /**
     * Gets the attribute value for nomdepartement using the alias name nomdepartement.
     * @return the nomdepartement
     */
    public String getnomdepartement() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getDepartementView5();
        voimp.setWhereClause("Iddepartements = "+getIddepartement());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Nomdepartement").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NOMDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for nomdepartement using the alias name nomdepartement.
     * @param value value to set the nomdepartement
     */
    public void setnomdepartement(String value) {
        setAttributeInternal(NOMDEPARTEMENT, value);
    }

    /**
     * Gets the attribute value for nomlocalite using the alias name nomlocalite.
     * @return the nomlocalite
     */
    public String getnomlocalite() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getLocaliteView3();
        voimp.setWhereClause("Idlocalite = "+getIdlocalite());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Nomlocalite").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NOMLOCALITE);
    }

    /**
     * Sets <code>value</code> as attribute value for nomlocalite using the alias name nomlocalite.
     * @param value value to set the nomlocalite
     */
    public void setnomlocalite(String value) {
        setAttributeInternal(NOMLOCALITE, value);
    }

    /**
     * Gets the attribute value for nomposte using the alias name nomposte.
     * @return the nomposte
     */
    public String getnomposte() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getPostecontroleView1();
        voimp.setWhereClause("Idpostecontrole = "+getIdposte());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Intituleposte").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NOMPOSTE);
    }

    /**
     * Sets <code>value</code> as attribute value for nomposte using the alias name nomposte.
     * @param value value to set the nomposte
     */
    public void setnomposte(String value) {
        setAttributeInternal(NOMPOSTE, value);
    }

    /**
     * Gets the attribute value for idutilisateur using the alias name Idutilisateur1.
     * @return the idutilisateur
     */
    public BigDecimal getIdutilisateur1() {
        return (BigDecimal) getAttributeInternal(IDUTILISATEUR1);
    }

    /**
     * Sets <code>value</code> as attribute value for idutilisateur using the alias name Idutilisateur1.
     * @param value value to set the idutilisateur
     */
    public void setIdutilisateur1(BigDecimal value) {
        setAttributeInternal(IDUTILISATEUR1, value);
    }

    /**
     * Gets the attribute value for nomuser using the alias name nomuser.
     * @return the nomuser
     */
    public String getnomuser() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getUtilisateurView1();
        voimp.setWhereClause("Idutilisateur = "+getIdutilisateur());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Nomuser").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NOMUSER);
    }

    /**
     * Sets <code>value</code> as attribute value for nomuser using the alias name nomuser.
     * @param value value to set the nomuser
     */
    public void setnomuser(String value) {
        setAttributeInternal(NOMUSER, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CollectepfnlView.
     */
    public RowIterator getCollectepfnlView() {
        return (RowIterator) getAttributeInternal(COLLECTEPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView.
     */
    public RowIterator getDetailscollectepfnlView() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DepartementView1.
     */
    public RowSet getDepartementView1() {
        return (RowSet) getAttributeInternal(DEPARTEMENTVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LocaliteView1.
     */
    public RowSet getLocaliteView1() {
        return (RowSet) getAttributeInternal(LOCALITEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PostecontroleView1.
     */
    public RowSet getPostecontroleView1() {
        return (RowSet) getAttributeInternal(POSTECONTROLEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UtilisateurView1.
     */
    public RowSet getUtilisateurView1() {
        return (RowSet) getAttributeInternal(UTILISATEURVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getLocaliteUser1.
     */
    public RowSet getgetLocaliteUser1() {
        return (RowSet) getAttributeInternal(GETLOCALITEUSER1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getPosteUserView1.
     */
    public RowSet getgetPosteUserView1() {
        return (RowSet) getAttributeInternal(GETPOSTEUSERVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getDepartementUser1.
     */
    public RowSet getgetDepartementUser1() {
        return (RowSet) getAttributeInternal(GETDEPARTEMENTUSER1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getUtilisateur1.
     */
    public RowSet getgetUtilisateur1() {
        return (RowSet) getAttributeInternal(GETUTILISATEUR1);
    }
}

