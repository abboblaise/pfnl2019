package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 04 14:14:43 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailscollectepfnlImpl extends EntityImpl {
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
        nomprovenance,
        Detailscollectepfnl,
        IdcollectepfnlDetailscollectepfnl,
        Detailscollectepfnl1,
        IddestinationDetailscollectepfnl,
        Detailscollectepfnl3,
        IdunitemesureDetailscollectepfnl,
        Detailscollectepfnl4,
        IdorigineDetailscollectepfnl,
        Detailscollectepfnl5,
        IdpartieproduitpfnlDetailscollectepfnl,
        Detailscollectepfnl6,
        IdpermissionnaireDetailscollectepfnl,
        Collectepfnl,
        Originespnfls,
        Unitemesure,
        Departement,
        Permissionnairespnfl,
        PartiesProduitsPfnl,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2,
        LettreVoiturePc3,
        LettreVoiturePc4,
        LettreVoiturePc5,
        LettreVoiturePc6,
        LettreVoiturePc7,
        LettreVoiturePc8,
        TypeDocument,
        TypeDocument1,
        TypeDocument2,
        TypeDocument3,
        TypeDocument4,
        TypeDocument5;
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
    public static final int NOMPROVENANCE = AttributesEnum.nomprovenance.index();
    public static final int DETAILSCOLLECTEPFNL = AttributesEnum.Detailscollectepfnl.index();
    public static final int IDCOLLECTEPFNLDETAILSCOLLECTEPFNL =
        AttributesEnum.IdcollectepfnlDetailscollectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL1 = AttributesEnum.Detailscollectepfnl1.index();
    public static final int IDDESTINATIONDETAILSCOLLECTEPFNL = AttributesEnum.IddestinationDetailscollectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL3 = AttributesEnum.Detailscollectepfnl3.index();
    public static final int IDUNITEMESUREDETAILSCOLLECTEPFNL = AttributesEnum.IdunitemesureDetailscollectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL4 = AttributesEnum.Detailscollectepfnl4.index();
    public static final int IDORIGINEDETAILSCOLLECTEPFNL = AttributesEnum.IdorigineDetailscollectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL5 = AttributesEnum.Detailscollectepfnl5.index();
    public static final int IDPARTIEPRODUITPFNLDETAILSCOLLECTEPFNL =
        AttributesEnum.IdpartieproduitpfnlDetailscollectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL6 = AttributesEnum.Detailscollectepfnl6.index();
    public static final int IDPERMISSIONNAIREDETAILSCOLLECTEPFNL =
        AttributesEnum.IdpermissionnaireDetailscollectepfnl.index();
    public static final int COLLECTEPFNL = AttributesEnum.Collectepfnl.index();
    public static final int ORIGINESPNFLS = AttributesEnum.Originespnfls.index();
    public static final int UNITEMESURE = AttributesEnum.Unitemesure.index();
    public static final int DEPARTEMENT = AttributesEnum.Departement.index();
    public static final int PERMISSIONNAIRESPNFL = AttributesEnum.Permissionnairespnfl.index();
    public static final int PARTIESPRODUITSPFNL = AttributesEnum.PartiesProduitsPfnl.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();
    public static final int LETTREVOITUREPC3 = AttributesEnum.LettreVoiturePc3.index();
    public static final int LETTREVOITUREPC4 = AttributesEnum.LettreVoiturePc4.index();
    public static final int LETTREVOITUREPC5 = AttributesEnum.LettreVoiturePc5.index();
    public static final int LETTREVOITUREPC6 = AttributesEnum.LettreVoiturePc6.index();
    public static final int LETTREVOITUREPC7 = AttributesEnum.LettreVoiturePc7.index();
    public static final int LETTREVOITUREPC8 = AttributesEnum.LettreVoiturePc8.index();
    public static final int TYPEDOCUMENT = AttributesEnum.TypeDocument.index();
    public static final int TYPEDOCUMENT1 = AttributesEnum.TypeDocument1.index();
    public static final int TYPEDOCUMENT2 = AttributesEnum.TypeDocument2.index();
    public static final int TYPEDOCUMENT3 = AttributesEnum.TypeDocument3.index();
    public static final int TYPEDOCUMENT4 = AttributesEnum.TypeDocument4.index();
    public static final int TYPEDOCUMENT5 = AttributesEnum.TypeDocument5.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailscollectepfnlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Detailscollectepfnl");
    }


    /**
     * Gets the attribute value for Iddetailscollectepfnl, using the alias name Iddetailscollectepfnl.
     * @return the value of Iddetailscollectepfnl
     */
    public BigDecimal getIddetailscollectepfnl() {
        return (BigDecimal) getAttributeInternal(IDDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddetailscollectepfnl.
     * @param value value to set the Iddetailscollectepfnl
     */
    public void setIddetailscollectepfnl(BigDecimal value) {
        setAttributeInternal(IDDETAILSCOLLECTEPFNL, value);
    }

    /**
     * Gets the attribute value for Idpermissionnaire, using the alias name Idpermissionnaire.
     * @return the value of Idpermissionnaire
     */
    public BigDecimal getIdpermissionnaire() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermissionnaire.
     * @param value value to set the Idpermissionnaire
     */
    public void setIdpermissionnaire(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRE, value);
    }

    /**
     * Gets the attribute value for Idorigine, using the alias name Idorigine.
     * @return the value of Idorigine
     */
    public BigDecimal getIdorigine() {
        return (BigDecimal) getAttributeInternal(IDORIGINE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idorigine.
     * @param value value to set the Idorigine
     */
    public void setIdorigine(BigDecimal value) {
        setAttributeInternal(IDORIGINE, value);
    }

    /**
     * Gets the attribute value for Quantite, using the alias name Quantite.
     * @return the value of Quantite
     */
    public Float getQuantite() {
        return (Float) getAttributeInternal(QUANTITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantite.
     * @param value value to set the Quantite
     */
    public void setQuantite(Float value) {
        setAttributeInternal(QUANTITE, value);
    }

    /**
     * Gets the attribute value for Idunitemesure, using the alias name Idunitemesure.
     * @return the value of Idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idunitemesure.
     * @param value value to set the Idunitemesure
     */
    public void setIdunitemesure(BigDecimal value) {
        setAttributeInternal(IDUNITEMESURE, value);
    }


    /**
     * Gets the attribute value for Iddestination, using the alias name Iddestination.
     * @return the value of Iddestination
     */
    public BigDecimal getIddestination() {
        return (BigDecimal) getAttributeInternal(IDDESTINATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddestination.
     * @param value value to set the Iddestination
     */
    public void setIddestination(BigDecimal value) {
        setAttributeInternal(IDDESTINATION, value);
    }

    /**
     * Gets the attribute value for Idpartieproduitpfnl, using the alias name Idpartieproduitpfnl.
     * @return the value of Idpartieproduitpfnl
     */
    public BigDecimal getIdpartieproduitpfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIEPRODUITPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpartieproduitpfnl.
     * @param value value to set the Idpartieproduitpfnl
     */
    public void setIdpartieproduitpfnl(BigDecimal value) {
        setAttributeInternal(IDPARTIEPRODUITPFNL, value);
    }

    /**
     * Gets the attribute value for Idcollectepfnl, using the alias name Idcollectepfnl.
     * @return the value of Idcollectepfnl
     */
    public BigDecimal getIdcollectepfnl() {
        return (BigDecimal) getAttributeInternal(IDCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcollectepfnl.
     * @param value value to set the Idcollectepfnl
     */
    public void setIdcollectepfnl(BigDecimal value) {
        setAttributeInternal(IDCOLLECTEPFNL, value);
    }

    /**
     * Gets the attribute value for Idprovenance, using the alias name Idprovenance.
     * @return the value of Idprovenance
     */
    public BigDecimal getIdprovenance() {
        return (BigDecimal) getAttributeInternal(IDPROVENANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idprovenance.
     * @param value value to set the Idprovenance
     */
    public void setIdprovenance(BigDecimal value) {
        setAttributeInternal(IDPROVENANCE, value);
    }

    /**
     * Gets the attribute value for Nomacteur, using the alias name Nomacteur.
     * @return the value of Nomacteur
     */
    public String getNomacteur() {
        return (String) getAttributeInternal(NOMACTEUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomacteur.
     * @param value value to set the Nomacteur
     */
    public void setNomacteur(String value) {
        setAttributeInternal(NOMACTEUR, value);
    }

    /**
     * Gets the attribute value for Typeacteur, using the alias name Typeacteur.
     * @return the value of Typeacteur
     */
    public Integer getTypeacteur() {
        return (Integer) getAttributeInternal(TYPEACTEUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Typeacteur.
     * @param value value to set the Typeacteur
     */
    public void setTypeacteur(Integer value) {
        setAttributeInternal(TYPEACTEUR, value);
    }

    /**
     * Gets the attribute value for iddepartemental, using the alias name iddepartemental.
     * @return the value of iddepartemental
     */
    public BigDecimal getiddepartemental() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        UserData ud = (UserData) session.getAttribute("user");
        //System.out.println("Id département"+ud.getIddepartement());
        return ud.getIddepartement();
        //return (BigDecimal) getAttributeInternal(IDDEPARTEMENTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for iddepartemental.
     * @param value value to set the iddepartemental
     */
    public void setiddepartemental(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENTAL, value);
    }

    /**
     * Gets the attribute value for idregonal, using the alias name idregonal.
     * @return the value of idregonal
     */
    public BigDecimal getidregonal() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        UserData ud = (UserData) session.getAttribute("user");
        return ud.getIdregion();
        //return (BigDecimal) getAttributeInternal(IDREGONAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for idregonal.
     * @param value value to set the idregonal
     */
    public void setidregonal(BigDecimal value) {
        setAttributeInternal(IDREGONAL, value);
    }

    /**
     * Gets the attribute value for nomprovenance, using the alias name nomprovenance.
     * @return the value of nomprovenance
     */
    public String getnomprovenance() {
        return (String) getAttributeInternal(NOMPROVENANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for nomprovenance.
     * @param value value to set the nomprovenance
     */
    public void setnomprovenance(String value) {
        setAttributeInternal(NOMPROVENANCE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIdcollectepfnlDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDCOLLECTEPFNLDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIdcollectepfnlDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDCOLLECTEPFNLDETAILSCOLLECTEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl1() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL1);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIddestinationDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDDESTINATIONDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIddestinationDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDDESTINATIONDETAILSCOLLECTEPFNL, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl3() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL3);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIdunitemesureDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDUNITEMESUREDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIdunitemesureDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDUNITEMESUREDETAILSCOLLECTEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl4() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL4);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIdorigineDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDORIGINEDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIdorigineDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDORIGINEDETAILSCOLLECTEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl5() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL5);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIdpartieproduitpfnlDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDPARTIEPRODUITPFNLDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIdpartieproduitpfnlDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDPARTIEPRODUITPFNLDETAILSCOLLECTEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl6() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL6);
    }

    /**
     * @return the associated entity DetailscollectepfnlImpl.
     */
    public DetailscollectepfnlImpl getIdpermissionnaireDetailscollectepfnl() {
        return (DetailscollectepfnlImpl) getAttributeInternal(IDPERMISSIONNAIREDETAILSCOLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailscollectepfnlImpl.
     */
    public void setIdpermissionnaireDetailscollectepfnl(DetailscollectepfnlImpl value) {
        setAttributeInternal(IDPERMISSIONNAIREDETAILSCOLLECTEPFNL, value);
    }

    /**
     * @return the associated entity CollectepfnlImpl.
     */
    public CollectepfnlImpl getCollectepfnl() {
        return (CollectepfnlImpl) getAttributeInternal(COLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity CollectepfnlImpl.
     */
    public void setCollectepfnl(CollectepfnlImpl value) {
        setAttributeInternal(COLLECTEPFNL, value);
    }

    /**
     * @return the associated entity OriginespnflsImpl.
     */
    public OriginespnflsImpl getOriginespnfls() {
        return (OriginespnflsImpl) getAttributeInternal(ORIGINESPNFLS);
    }

    /**
     * Sets <code>value</code> as the associated entity OriginespnflsImpl.
     */
    public void setOriginespnfls(OriginespnflsImpl value) {
        setAttributeInternal(ORIGINESPNFLS, value);
    }

    /**
     * @return the associated entity UnitemesureImpl.
     */
    public UnitemesureImpl getUnitemesure() {
        return (UnitemesureImpl) getAttributeInternal(UNITEMESURE);
    }

    /**
     * Sets <code>value</code> as the associated entity UnitemesureImpl.
     */
    public void setUnitemesure(UnitemesureImpl value) {
        setAttributeInternal(UNITEMESURE, value);
    }

    /**
     * @return the associated entity DepartementImpl.
     */
    public DepartementImpl getDepartement() {
        return (DepartementImpl) getAttributeInternal(DEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the associated entity DepartementImpl.
     */
    public void setDepartement(DepartementImpl value) {
        setAttributeInternal(DEPARTEMENT, value);
    }

    /**
     * @return the associated entity PermissionnairespnflImpl.
     */
    public PermissionnairespnflImpl getPermissionnairespnfl() {
        return (PermissionnairespnflImpl) getAttributeInternal(PERMISSIONNAIRESPNFL);
    }

    /**
     * Sets <code>value</code> as the associated entity PermissionnairespnflImpl.
     */
    public void setPermissionnairespnfl(PermissionnairespnflImpl value) {
        setAttributeInternal(PERMISSIONNAIRESPNFL, value);
    }

    /**
     * @return the associated entity PartiesProduitsPfnlImpl.
     */
    public PartiesProduitsPfnlImpl getPartiesProduitsPfnl() {
        return (PartiesProduitsPfnlImpl) getAttributeInternal(PARTIESPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity PartiesProduitsPfnlImpl.
     */
    public void setPartiesProduitsPfnl(PartiesProduitsPfnlImpl value) {
        setAttributeInternal(PARTIESPRODUITSPFNL, value);
    }


    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc1() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC1);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc1(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC1, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc2() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC2);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc2(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC2, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc3() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC3);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc3(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC3, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc4() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC4);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc4(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC4, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc5() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC5);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc5(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC5, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc6() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC6);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc7() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC7);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc8() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC8);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument1() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument1(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument2() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT2);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument2(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT2, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument3() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT3);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument3(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT3, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument4() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT4);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument4(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT4, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument5() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT5);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument5(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT5, value);
    }


    /**
     * @param iddetailscollectepfnl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal iddetailscollectepfnl) {
        return new Key(new Object[] { iddetailscollectepfnl });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
         super.doDML(operation, e);
        /*      if (operation == DML_INSERT) {
       BigDecimal id = getLastId("getLastIdCollectePfnl1");
       setIdcollectepfnl(id);
        } */
    }
    
    public BigDecimal getLastId(String viewName) {
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

