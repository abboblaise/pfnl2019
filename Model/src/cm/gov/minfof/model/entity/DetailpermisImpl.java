package cm.gov.minfof.model.entity;

import cm.gov.minfof.model.entity.common.Longtext5;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 19 12:31:05 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailpermisImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Iddetailpermis,
        Quantite,
        Idunitemesure,
        Idpermis,
        Observation,
        Idpartieproduitpfnl,
        Idregions,
        Iddepartements,
        nomdudepartement,
        Detailpermis,
        IdpermisDetailpermis,
        Detailpermis1,
        IdpartieproduitpfnlDetailpermis,
        Detailpermis2,
        IdunitemesureDetailpermis,
        Permis,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2,
        LettreVoiturePc3,
        LettreVoiturePc4,
        LettreVoiturePc5,
        LettreVoiturePc6,
        TypeDocument,
        TypeDocument1,
        TypeDocument2,
        TypeDocument3,
        Permis1;
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


    public static final int IDDETAILPERMIS = AttributesEnum.Iddetailpermis.index();
    public static final int QUANTITE = AttributesEnum.Quantite.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int IDPARTIEPRODUITPFNL = AttributesEnum.Idpartieproduitpfnl.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int NOMDUDEPARTEMENT = AttributesEnum.nomdudepartement.index();
    public static final int DETAILPERMIS = AttributesEnum.Detailpermis.index();
    public static final int IDPERMISDETAILPERMIS = AttributesEnum.IdpermisDetailpermis.index();
    public static final int DETAILPERMIS1 = AttributesEnum.Detailpermis1.index();
    public static final int IDPARTIEPRODUITPFNLDETAILPERMIS = AttributesEnum.IdpartieproduitpfnlDetailpermis.index();
    public static final int DETAILPERMIS2 = AttributesEnum.Detailpermis2.index();
    public static final int IDUNITEMESUREDETAILPERMIS = AttributesEnum.IdunitemesureDetailpermis.index();
    public static final int PERMIS = AttributesEnum.Permis.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();
    public static final int LETTREVOITUREPC3 = AttributesEnum.LettreVoiturePc3.index();
    public static final int LETTREVOITUREPC4 = AttributesEnum.LettreVoiturePc4.index();
    public static final int LETTREVOITUREPC5 = AttributesEnum.LettreVoiturePc5.index();
    public static final int LETTREVOITUREPC6 = AttributesEnum.LettreVoiturePc6.index();
    public static final int TYPEDOCUMENT = AttributesEnum.TypeDocument.index();
    public static final int TYPEDOCUMENT1 = AttributesEnum.TypeDocument1.index();
    public static final int TYPEDOCUMENT2 = AttributesEnum.TypeDocument2.index();
    public static final int TYPEDOCUMENT3 = AttributesEnum.TypeDocument3.index();
    public static final int PERMIS1 = AttributesEnum.Permis1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailpermisImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Detailpermis");
    }


    /**
     * Gets the attribute value for Iddetailpermis, using the alias name Iddetailpermis.
     * @return the value of Iddetailpermis
     */
    public BigDecimal getIddetailpermis() {
        return (BigDecimal) getAttributeInternal(IDDETAILPERMIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddetailpermis.
     * @param value value to set the Iddetailpermis
     */
    public void setIddetailpermis(BigDecimal value) {
        setAttributeInternal(IDDETAILPERMIS, value);
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
     * Gets the attribute value for Idpermis, using the alias name Idpermis.
     * @return the value of Idpermis
     */
    public BigDecimal getIdpermis() {
        return (BigDecimal) getAttributeInternal(IDPERMIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermis.
     * @param value value to set the Idpermis
     */
    public void setIdpermis(BigDecimal value) {
        setAttributeInternal(IDPERMIS, value);
    }

    /**
     * Gets the attribute value for Observation, using the alias name Observation.
     * @return the value of Observation
     */
    public String getObservation() {
        return (String) getAttributeInternal(OBSERVATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Observation.
     * @param value value to set the Observation
     */
    public void setObservation(String value) {
        setAttributeInternal(OBSERVATION, value);
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
     * Gets the attribute value for Idregions, using the alias name Idregions.
     * @return the value of Idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idregions.
     * @param value value to set the Idregions
     */
    public void setIdregions(BigDecimal value) {
        setAttributeInternal(IDREGIONS, value);
    }

    /**
     * Gets the attribute value for Iddepartements, using the alias name Iddepartements.
     * @return the value of Iddepartements
     */
    public BigDecimal getIddepartements() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddepartements.
     * @param value value to set the Iddepartements
     */
    public void setIddepartements(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENTS, value);
    }


    /**
     * Gets the attribute value for nomdudepartement, using the alias name nomdudepartement.
     * @return the value of nomdudepartement
     */
    public String getnomdudepartement() {
        return (String) getAttributeInternal(NOMDUDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for nomdudepartement.
     * @param value value to set the nomdudepartement
     */
    public void setnomdudepartement(String value) {
        setAttributeInternal(NOMDUDEPARTEMENT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailpermis() {
        return (RowIterator) getAttributeInternal(DETAILPERMIS);
    }

    /**
     * @return the associated entity DetailpermisImpl.
     */
    public DetailpermisImpl getIdpermisDetailpermis() {
        return (DetailpermisImpl) getAttributeInternal(IDPERMISDETAILPERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailpermisImpl.
     */
    public void setIdpermisDetailpermis(DetailpermisImpl value) {
        setAttributeInternal(IDPERMISDETAILPERMIS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailpermis1() {
        return (RowIterator) getAttributeInternal(DETAILPERMIS1);
    }

    /**
     * @return the associated entity DetailpermisImpl.
     */
    public DetailpermisImpl getIdpartieproduitpfnlDetailpermis() {
        return (DetailpermisImpl) getAttributeInternal(IDPARTIEPRODUITPFNLDETAILPERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailpermisImpl.
     */
    public void setIdpartieproduitpfnlDetailpermis(DetailpermisImpl value) {
        setAttributeInternal(IDPARTIEPRODUITPFNLDETAILPERMIS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailpermis2() {
        return (RowIterator) getAttributeInternal(DETAILPERMIS2);
    }

    /**
     * @return the associated entity DetailpermisImpl.
     */
    public DetailpermisImpl getIdunitemesureDetailpermis() {
        return (DetailpermisImpl) getAttributeInternal(IDUNITEMESUREDETAILPERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailpermisImpl.
     */
    public void setIdunitemesureDetailpermis(DetailpermisImpl value) {
        setAttributeInternal(IDUNITEMESUREDETAILPERMIS, value);
    }

    /**
     * @return the associated entity PermisImpl.
     */
    public PermisImpl getPermis() {
        return (PermisImpl) getAttributeInternal(PERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity PermisImpl.
     */
    public void setPermis(PermisImpl value) {
        setAttributeInternal(PERMIS, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc4() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC4);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc5() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC5);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc6() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC6);
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
     * @return the associated entity PermisImpl.
     */
    public PermisImpl getPermis1() {
        return (PermisImpl) getAttributeInternal(PERMIS1);
    }

    /**
     * Sets <code>value</code> as the associated entity PermisImpl.
     */
    public void setPermis1(PermisImpl value) {
        setAttributeInternal(PERMIS1, value);
    }


    /**
     * @param iddetailpermis key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal iddetailpermis) {
        return new Key(new Object[] { iddetailpermis });
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
        BigDecimal lastId = new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            //System.out.println("entree dans la condition hasNext");
            Row r = vo.next();
            //System.out.println("row = " + r);
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

