package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 02 12:58:26 WAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailslettrevoitureImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Iddetailslettrevoiture,
        Idlettrevoiture,
        Quantite,
        Observations,
        Idunitemesure,
        Idpartieproduitpfnl,
        Detailslettrevoiture,
        IdunitemesureDetailslettrevoiture,
        Detailslettrevoiture1,
        IdpartieproduitpfnlDetailslettrevoiture,
        Detailslettrevoiture2,
        IdlettrevoitureDetailslettrevoiture,
        Lettrevoiture2,
        Lettrevoiture4,
        Lettrevoiture5,
        Lettrevoiture6,
        Lettrevoiture7,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2,
        LettreVoiturePc3,
        LettreVoiturePc4,
        LettreVoiturePc5,
        TypeDocument,
        TypeDocument1,
        TypeDocument2;
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


    public static final int IDDETAILSLETTREVOITURE = AttributesEnum.Iddetailslettrevoiture.index();
    public static final int IDLETTREVOITURE = AttributesEnum.Idlettrevoiture.index();
    public static final int QUANTITE = AttributesEnum.Quantite.index();
    public static final int OBSERVATIONS = AttributesEnum.Observations.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDPARTIEPRODUITPFNL = AttributesEnum.Idpartieproduitpfnl.index();
    public static final int DETAILSLETTREVOITURE = AttributesEnum.Detailslettrevoiture.index();
    public static final int IDUNITEMESUREDETAILSLETTREVOITURE =
        AttributesEnum.IdunitemesureDetailslettrevoiture.index();
    public static final int DETAILSLETTREVOITURE1 = AttributesEnum.Detailslettrevoiture1.index();
    public static final int IDPARTIEPRODUITPFNLDETAILSLETTREVOITURE =
        AttributesEnum.IdpartieproduitpfnlDetailslettrevoiture.index();
    public static final int DETAILSLETTREVOITURE2 = AttributesEnum.Detailslettrevoiture2.index();
    public static final int IDLETTREVOITUREDETAILSLETTREVOITURE =
        AttributesEnum.IdlettrevoitureDetailslettrevoiture.index();
    public static final int LETTREVOITURE2 = AttributesEnum.Lettrevoiture2.index();
    public static final int LETTREVOITURE4 = AttributesEnum.Lettrevoiture4.index();
    public static final int LETTREVOITURE5 = AttributesEnum.Lettrevoiture5.index();
    public static final int LETTREVOITURE6 = AttributesEnum.Lettrevoiture6.index();
    public static final int LETTREVOITURE7 = AttributesEnum.Lettrevoiture7.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();
    public static final int LETTREVOITUREPC3 = AttributesEnum.LettreVoiturePc3.index();
    public static final int LETTREVOITUREPC4 = AttributesEnum.LettreVoiturePc4.index();
    public static final int LETTREVOITUREPC5 = AttributesEnum.LettreVoiturePc5.index();
    public static final int TYPEDOCUMENT = AttributesEnum.TypeDocument.index();
    public static final int TYPEDOCUMENT1 = AttributesEnum.TypeDocument1.index();
    public static final int TYPEDOCUMENT2 = AttributesEnum.TypeDocument2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailslettrevoitureImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Detailslettrevoiture");
    }


    /**
     * Gets the attribute value for Iddetailslettrevoiture, using the alias name Iddetailslettrevoiture.
     * @return the value of Iddetailslettrevoiture
     */
    public BigDecimal getIddetailslettrevoiture() {
        return (BigDecimal) getAttributeInternal(IDDETAILSLETTREVOITURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddetailslettrevoiture.
     * @param value value to set the Iddetailslettrevoiture
     */
    public void setIddetailslettrevoiture(BigDecimal value) {
        setAttributeInternal(IDDETAILSLETTREVOITURE, value);
    }

    /**
     * Gets the attribute value for Idlettrevoiture, using the alias name Idlettrevoiture.
     * @return the value of Idlettrevoiture
     */
    public BigDecimal getIdlettrevoiture() {
        return (BigDecimal) getAttributeInternal(IDLETTREVOITURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idlettrevoiture.
     * @param value value to set the Idlettrevoiture
     */
    public void setIdlettrevoiture(BigDecimal value) {
        setAttributeInternal(IDLETTREVOITURE, value);
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
     * Gets the attribute value for Observations, using the alias name Observations.
     * @return the value of Observations
     */
    public String getObservations() {
        return (String) getAttributeInternal(OBSERVATIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Observations.
     * @param value value to set the Observations
     */
    public void setObservations(String value) {
        setAttributeInternal(OBSERVATIONS, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailslettrevoiture() {
        return (RowIterator) getAttributeInternal(DETAILSLETTREVOITURE);
    }

    /**
     * @return the associated entity DetailslettrevoitureImpl.
     */
    public DetailslettrevoitureImpl getIdunitemesureDetailslettrevoiture() {
        return (DetailslettrevoitureImpl) getAttributeInternal(IDUNITEMESUREDETAILSLETTREVOITURE);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailslettrevoitureImpl.
     */
    public void setIdunitemesureDetailslettrevoiture(DetailslettrevoitureImpl value) {
        setAttributeInternal(IDUNITEMESUREDETAILSLETTREVOITURE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailslettrevoiture1() {
        return (RowIterator) getAttributeInternal(DETAILSLETTREVOITURE1);
    }

    /**
     * @return the associated entity DetailslettrevoitureImpl.
     */
    public DetailslettrevoitureImpl getIdpartieproduitpfnlDetailslettrevoiture() {
        return (DetailslettrevoitureImpl) getAttributeInternal(IDPARTIEPRODUITPFNLDETAILSLETTREVOITURE);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailslettrevoitureImpl.
     */
    public void setIdpartieproduitpfnlDetailslettrevoiture(DetailslettrevoitureImpl value) {
        setAttributeInternal(IDPARTIEPRODUITPFNLDETAILSLETTREVOITURE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailslettrevoiture2() {
        return (RowIterator) getAttributeInternal(DETAILSLETTREVOITURE2);
    }

    /**
     * @return the associated entity DetailslettrevoitureImpl.
     */
    public DetailslettrevoitureImpl getIdlettrevoitureDetailslettrevoiture() {
        return (DetailslettrevoitureImpl) getAttributeInternal(IDLETTREVOITUREDETAILSLETTREVOITURE);
    }

    /**
     * Sets <code>value</code> as the associated entity DetailslettrevoitureImpl.
     */
    public void setIdlettrevoitureDetailslettrevoiture(DetailslettrevoitureImpl value) {
        setAttributeInternal(IDLETTREVOITUREDETAILSLETTREVOITURE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettrevoiture2() {
        return (RowIterator) getAttributeInternal(LETTREVOITURE2);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettrevoiture4() {
        return (RowIterator) getAttributeInternal(LETTREVOITURE4);
    }

    /**
     * @return the associated entity LettrevoitureImpl.
     */
    public LettrevoitureImpl getLettrevoiture5() {
        return (LettrevoitureImpl) getAttributeInternal(LETTREVOITURE5);
    }

    /**
     * Sets <code>value</code> as the associated entity LettrevoitureImpl.
     */
    public void setLettrevoiture5(LettrevoitureImpl value) {
        setAttributeInternal(LETTREVOITURE5, value);
    }

    /**
     * @return the associated entity LettrevoitureImpl.
     */
    public LettrevoitureImpl getLettrevoiture6() {
        return (LettrevoitureImpl) getAttributeInternal(LETTREVOITURE6);
    }

    /**
     * Sets <code>value</code> as the associated entity LettrevoitureImpl.
     */
    public void setLettrevoiture6(LettrevoitureImpl value) {
        setAttributeInternal(LETTREVOITURE6, value);
    }

    /**
     * @return the associated entity LettrevoitureImpl.
     */
    public LettrevoitureImpl getLettrevoiture7() {
        return (LettrevoitureImpl) getAttributeInternal(LETTREVOITURE7);
    }

    /**
     * Sets <code>value</code> as the associated entity LettrevoitureImpl.
     */
    public void setLettrevoiture7(LettrevoitureImpl value) {
        setAttributeInternal(LETTREVOITURE7, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc3() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC3);
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
     * @param iddetailslettrevoiture key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal iddetailslettrevoiture) {
        return new Key(new Object[] { iddetailslettrevoiture });
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
      /*  if (operation == DML_INSERT) { 
            BigDecimal id = getLastId("getLastidDetailslettrevoiture1");
            setIddetailslettrevoiture(id);
        } */
        super.doDML(operation, e);
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

