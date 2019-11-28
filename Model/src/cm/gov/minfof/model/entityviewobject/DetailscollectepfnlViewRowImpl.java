package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.DetailscollectepfnlImpl;
import cm.gov.minfof.model.entity.PartiesProduitsPfnlViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 18 01:59:41 CET 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailscollectepfnlViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_DETAILSCOLLECTEPFNL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Iddetailscollectepfnl,
        Idpermissionnaire,
        Idorigine,
        Quantite,
        Idunitemesure,
        Iddestination,
        Idpartieproduitpfnl,
        Idcollectepfnl,
        Idprovenance,
        Nomacteur,
        Typeacteur,
        iddepartemental,
        idregonal,
        Idprovenance1,
        nomprovenance,
        DetailscollectepfnlView1,
        DetailscollectepfnlView3,
        DetailscollectepfnlView4,
        DetailscollectepfnlView5,
        DetailscollectepfnlView6,
        CollectepfnlView,
        PermissionnairespnflView,
        PartiesProduitsPfnlView,
        OriginespnflsView,
        UnitemesureView,
        DepartementView,
        OriginespnflsView1,
        UnitemesureView1,
        DepartementView1,
        PartiesProduitsPfnlView1,
        PermissionnairespnflView1,
        getLibelleProduitComplet1,
        permisActifView1,
        LocaliteView1,
        TypeacteurView1,
        CommuneView1,
        getLocaliteUser1;
        private static AttributesEnum[] vals = null;
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
    public static final int IDDETAILSCOLLECTEPFNL = AttributesEnum.Iddetailscollectepfnl.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int IDORIGINE = AttributesEnum.Idorigine.index();
    public static final int QUANTITE = AttributesEnum.Quantite.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDDESTINATION = AttributesEnum.Iddestination.index();
    public static final int IDPARTIEPRODUITPFNL = AttributesEnum.Idpartieproduitpfnl.index();
    public static final int IDCOLLECTEPFNL = AttributesEnum.Idcollectepfnl.index();
    public static final int IDPROVENANCE = AttributesEnum.Idprovenance.index();
    public static final int NOMACTEUR = AttributesEnum.Nomacteur.index();
    public static final int TYPEACTEUR = AttributesEnum.Typeacteur.index();
    public static final int IDDEPARTEMENTAL = AttributesEnum.iddepartemental.index();
    public static final int IDREGONAL = AttributesEnum.idregonal.index();
    public static final int IDPROVENANCE1 = AttributesEnum.Idprovenance1.index();
    public static final int NOMPROVENANCE = AttributesEnum.nomprovenance.index();
    public static final int DETAILSCOLLECTEPFNLVIEW1 = AttributesEnum.DetailscollectepfnlView1.index();
    public static final int DETAILSCOLLECTEPFNLVIEW3 = AttributesEnum.DetailscollectepfnlView3.index();
    public static final int DETAILSCOLLECTEPFNLVIEW4 = AttributesEnum.DetailscollectepfnlView4.index();
    public static final int DETAILSCOLLECTEPFNLVIEW5 = AttributesEnum.DetailscollectepfnlView5.index();
    public static final int DETAILSCOLLECTEPFNLVIEW6 = AttributesEnum.DetailscollectepfnlView6.index();
    public static final int COLLECTEPFNLVIEW = AttributesEnum.CollectepfnlView.index();
    public static final int PERMISSIONNAIRESPNFLVIEW = AttributesEnum.PermissionnairespnflView.index();
    public static final int PARTIESPRODUITSPFNLVIEW = AttributesEnum.PartiesProduitsPfnlView.index();
    public static final int ORIGINESPNFLSVIEW = AttributesEnum.OriginespnflsView.index();
    public static final int UNITEMESUREVIEW = AttributesEnum.UnitemesureView.index();
    public static final int DEPARTEMENTVIEW = AttributesEnum.DepartementView.index();
    public static final int ORIGINESPNFLSVIEW1 = AttributesEnum.OriginespnflsView1.index();
    public static final int UNITEMESUREVIEW1 = AttributesEnum.UnitemesureView1.index();
    public static final int DEPARTEMENTVIEW1 = AttributesEnum.DepartementView1.index();
    public static final int PARTIESPRODUITSPFNLVIEW1 = AttributesEnum.PartiesProduitsPfnlView1.index();
    public static final int PERMISSIONNAIRESPNFLVIEW1 = AttributesEnum.PermissionnairespnflView1.index();
    public static final int GETLIBELLEPRODUITCOMPLET1 = AttributesEnum.getLibelleProduitComplet1.index();
    public static final int PERMISACTIFVIEW1 = AttributesEnum.permisActifView1.index();
    public static final int LOCALITEVIEW1 = AttributesEnum.LocaliteView1.index();
    public static final int TYPEACTEURVIEW1 = AttributesEnum.TypeacteurView1.index();
    public static final int COMMUNEVIEW1 = AttributesEnum.CommuneView1.index();
    public static final int GETLOCALITEUSER1 = AttributesEnum.getLocaliteUser1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailscollectepfnlViewRowImpl() {
    }

    /**
     * Gets Detailscollectepfnl entity object.
     * @return the Detailscollectepfnl
     */
    public DetailscollectepfnlImpl getDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getEntity(ENTITY_DETAILSCOLLECTEPFNL);
    }

    /**
     * Gets the attribute value for iddetailscollectepfnl using the alias name Iddetailscollectepfnl.
     * @return the iddetailscollectepfnl
     */
    public BigDecimal getIddetailscollectepfnl() {
        return (BigDecimal) getAttributeInternal(IDDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for iddetailscollectepfnl using the alias name Iddetailscollectepfnl.
     * @param value value to set the iddetailscollectepfnl
     */
    public void setIddetailscollectepfnl(BigDecimal value) {
        setAttributeInternal(IDDETAILSCOLLECTEPFNL, value);
    }

    /**
     * Gets the attribute value for idpermissionnaire using the alias name Idpermissionnaire.
     * @return the idpermissionnaire
     */
    public BigDecimal getIdpermissionnaire() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRE);
    }

    /**
     * Sets <code>value</code> as attribute value for idpermissionnaire using the alias name Idpermissionnaire.
     * @param value value to set the idpermissionnaire
     */
    public void setIdpermissionnaire(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRE, value);
    }

    /**
     * Gets the attribute value for idorigine using the alias name Idorigine.
     * @return the idorigine
     */
    public BigDecimal getIdorigine() {
        return (BigDecimal) getAttributeInternal(IDORIGINE);
    }

    /**
     * Sets <code>value</code> as attribute value for idorigine using the alias name Idorigine.
     * @param value value to set the idorigine
     */
    public void setIdorigine(BigDecimal value) {
        setAttributeInternal(IDORIGINE, value);
    }

    /**
     * Gets the attribute value for quantite using the alias name Quantite.
     * @return the quantite
     */
    public Float getQuantite() {
        return (Float) getAttributeInternal(QUANTITE);
    }

    /**
     * Sets <code>value</code> as attribute value for quantite using the alias name Quantite.
     * @param value value to set the quantite
     */
    public void setQuantite(Float value) {
        setAttributeInternal(QUANTITE, value);
    }

    /**
     * Gets the attribute value for idunitemesure using the alias name Idunitemesure.
     * @return the idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as attribute value for idunitemesure using the alias name Idunitemesure.
     * @param value value to set the idunitemesure
     */
    public void setIdunitemesure(BigDecimal value) {
        setAttributeInternal(IDUNITEMESURE, value);
    }

    /**
     * Gets the attribute value for iddestination using the alias name Iddestination.
     * @return the iddestination
     */
    public BigDecimal getIddestination() {
        return (BigDecimal) getAttributeInternal(IDDESTINATION);
    }

    /**
     * Sets <code>value</code> as attribute value for iddestination using the alias name Iddestination.
     * @param value value to set the iddestination
     */
    public void setIddestination(BigDecimal value) {
        setAttributeInternal(IDDESTINATION, value);
    }

    /**
     * Gets the attribute value for idpartieproduitpfnl using the alias name Idpartieproduitpfnl.
     * @return the idpartieproduitpfnl
     */
    public BigDecimal getIdpartieproduitpfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIEPRODUITPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idpartieproduitpfnl using the alias name Idpartieproduitpfnl.
     * @param value value to set the idpartieproduitpfnl
     */
    public void setIdpartieproduitpfnl(BigDecimal value) {
        setAttributeInternal(IDPARTIEPRODUITPFNL, value);
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
     * Gets the attribute value for idprovenance using the alias name Idprovenance.
     * @return the idprovenance
     */
    public BigDecimal getIdprovenance() {
        return (BigDecimal) getAttributeInternal(IDPROVENANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for idprovenance using the alias name Idprovenance.
     * @param value value to set the idprovenance
     */
    public void setIdprovenance(BigDecimal value) {
        setAttributeInternal(IDPROVENANCE, value);
    }

    /**
     * Gets the attribute value for nomacteur using the alias name Nomacteur.
     * @return the nomacteur
     */
    public String getNomacteur() {
        return (String) getAttributeInternal(NOMACTEUR);
    }

    /**
     * Sets <code>value</code> as attribute value for nomacteur using the alias name Nomacteur.
     * @param value value to set the nomacteur
     */
    public void setNomacteur(String value) {
        setAttributeInternal(NOMACTEUR, value);
    }

    /**
     * Gets the attribute value for typeacteur using the alias name Typeacteur.
     * @return the typeacteur
     */
    public Integer getTypeacteur() {
        return (Integer) getAttributeInternal(TYPEACTEUR);
    }

    /**
     * Sets <code>value</code> as attribute value for typeacteur using the alias name Typeacteur.
     * @param value value to set the typeacteur
     */
    public void setTypeacteur(Integer value) {
        setAttributeInternal(TYPEACTEUR, value);
    }

    /**
     * Gets the attribute value for iddepartemental using the alias name iddepartemental.
     * @return the iddepartemental
     */
    public BigDecimal getiddepartemental() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for iddepartemental using the alias name iddepartemental.
     * @param value value to set the iddepartemental
     */
    public void setiddepartemental(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENTAL, value);
    }

    /**
     * Gets the attribute value for idregonal using the alias name idregonal.
     * @return the idregonal
     */
    public BigDecimal getidregonal() {
        return (BigDecimal) getAttributeInternal(IDREGONAL);
    }

    /**
     * Sets <code>value</code> as attribute value for idregonal using the alias name idregonal.
     * @param value value to set the idregonal
     */
    public void setidregonal(BigDecimal value) {
        setAttributeInternal(IDREGONAL, value);
    }

    /**
     * Gets the attribute value for idprovenance using the alias name Idprovenance1.
     * @return the idprovenance
     */
    public BigDecimal getIdprovenance1() {
        return (BigDecimal) getAttributeInternal(IDPROVENANCE1);
    }

    /**
     * Sets <code>value</code> as attribute value for idprovenance using the alias name Idprovenance1.
     * @param value value to set the idprovenance
     */
    public void setIdprovenance1(BigDecimal value) {
        setAttributeInternal(IDPROVENANCE1, value);
    }

    /**
     * Gets the attribute value for nomprovenance using the alias name nomprovenance.
     * @return the nomprovenance
     */
    public String getnomprovenance() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getLocaliteView3();
        voimp.setWhereClause("Idlocalite = "+getIdprovenance());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Nomlocalite").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NOMPROVENANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for nomprovenance using the alias name nomprovenance.
     * @param value value to set the nomprovenance
     */
    public void setnomprovenance(String value) {
        setAttributeInternal(NOMPROVENANCE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView1.
     */
    public RowIterator getDetailscollectepfnlView1() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView3.
     */
    public RowIterator getDetailscollectepfnlView3() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW3);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView4.
     */
    public RowIterator getDetailscollectepfnlView4() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW4);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView5.
     */
    public RowIterator getDetailscollectepfnlView5() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW5);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView6.
     */
    public RowIterator getDetailscollectepfnlView6() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW6);
    }

    /**
     * Gets the associated <code>CollectepfnlViewRowImpl</code> using master-detail link CollectepfnlView.
     */
    public CollectepfnlViewRowImpl getCollectepfnlView() {
        return (CollectepfnlViewRowImpl) getAttributeInternal(COLLECTEPFNLVIEW);
    }

    /**
     * Sets the master-detail link CollectepfnlView between this object and <code>value</code>.
     */
    public void setCollectepfnlView(CollectepfnlViewRowImpl value) {
        setAttributeInternal(COLLECTEPFNLVIEW, value);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link PermissionnairespnflView.
     */
    public ViewRowImpl getPermissionnairespnflView() {
        return (ViewRowImpl) getAttributeInternal(PERMISSIONNAIRESPNFLVIEW);
    }

    /**
     * Sets the master-detail link PermissionnairespnflView between this object and <code>value</code>.
     */
    public void setPermissionnairespnflView(ViewRowImpl value) {
        setAttributeInternal(PERMISSIONNAIRESPNFLVIEW, value);
    }

    /**
     * Gets the associated <code>PartiesProduitsPfnlViewRowImpl</code> using master-detail link PartiesProduitsPfnlView.
     */
    public PartiesProduitsPfnlViewRowImpl getPartiesProduitsPfnlView() {
        return (PartiesProduitsPfnlViewRowImpl) getAttributeInternal(PARTIESPRODUITSPFNLVIEW);
    }

    /**
     * Sets the master-detail link PartiesProduitsPfnlView between this object and <code>value</code>.
     */
    public void setPartiesProduitsPfnlView(PartiesProduitsPfnlViewRowImpl value) {
        setAttributeInternal(PARTIESPRODUITSPFNLVIEW, value);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link OriginespnflsView.
     */
    public ViewRowImpl getOriginespnflsView() {
        return (ViewRowImpl) getAttributeInternal(ORIGINESPNFLSVIEW);
    }

    /**
     * Sets the master-detail link OriginespnflsView between this object and <code>value</code>.
     */
    public void setOriginespnflsView(ViewRowImpl value) {
        setAttributeInternal(ORIGINESPNFLSVIEW, value);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link UnitemesureView.
     */
    public ViewRowImpl getUnitemesureView() {
        return (ViewRowImpl) getAttributeInternal(UNITEMESUREVIEW);
    }

    /**
     * Sets the master-detail link UnitemesureView between this object and <code>value</code>.
     */
    public void setUnitemesureView(ViewRowImpl value) {
        setAttributeInternal(UNITEMESUREVIEW, value);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link DepartementView.
     */
    public ViewRowImpl getDepartementView() {
        return (ViewRowImpl) getAttributeInternal(DEPARTEMENTVIEW);
    }

    /**
     * Sets the master-detail link DepartementView between this object and <code>value</code>.
     */
    public void setDepartementView(ViewRowImpl value) {
        setAttributeInternal(DEPARTEMENTVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OriginespnflsView1.
     */
    public RowSet getOriginespnflsView1() {
        return (RowSet) getAttributeInternal(ORIGINESPNFLSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UnitemesureView1.
     */
    public RowSet getUnitemesureView1() {
        return (RowSet) getAttributeInternal(UNITEMESUREVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DepartementView1.
     */
    public RowSet getDepartementView1() {
        return (RowSet) getAttributeInternal(DEPARTEMENTVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PartiesProduitsPfnlView1.
     */
    public RowSet getPartiesProduitsPfnlView1() {
        return (RowSet) getAttributeInternal(PARTIESPRODUITSPFNLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PermissionnairespnflView1.
     */
    public RowSet getPermissionnairespnflView1() {
        return (RowSet) getAttributeInternal(PERMISSIONNAIRESPNFLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getLibelleProduitComplet1.
     */
    public RowSet getgetLibelleProduitComplet1() {
        return (RowSet) getAttributeInternal(GETLIBELLEPRODUITCOMPLET1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> permisActifView1.
     */
    public RowSet getpermisActifView1() {
        return (RowSet) getAttributeInternal(PERMISACTIFVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LocaliteView1.
     */
    public RowSet getLocaliteView1() {
        return (RowSet) getAttributeInternal(LOCALITEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TypeacteurView1.
     */
    public RowSet getTypeacteurView1() {
        return (RowSet) getAttributeInternal(TYPEACTEURVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CommuneView1.
     */
    public RowSet getCommuneView1() {
        return (RowSet) getAttributeInternal(COMMUNEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getLocaliteUser1.
     */
    public RowSet getgetLocaliteUser1() {
        return (RowSet) getAttributeInternal(GETLOCALITEUSER1);
    }
}

