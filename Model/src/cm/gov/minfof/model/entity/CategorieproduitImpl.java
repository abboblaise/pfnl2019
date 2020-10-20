package cm.gov.minfof.model.entity;

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
// ---    Sun Sep 18 05:18:50 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CategorieproduitImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcategorieproduit,
        Libellecategorie,
        Codecategorie,
        Observation,
        Quotas,
        QuotasTransient,
        ProduitsPfnl,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2;
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


    public static final int IDCATEGORIEPRODUIT = AttributesEnum.Idcategorieproduit.index();
    public static final int LIBELLECATEGORIE = AttributesEnum.Libellecategorie.index();
    public static final int CODECATEGORIE = AttributesEnum.Codecategorie.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int QUOTAS = AttributesEnum.Quotas.index();
    public static final int QUOTASTRANSIENT = AttributesEnum.QuotasTransient.index();
    public static final int PRODUITSPFNL = AttributesEnum.ProduitsPfnl.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CategorieproduitImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Categorieproduit");
    }


    /**
     * Gets the attribute value for Idcategorieproduit, using the alias name Idcategorieproduit.
     * @return the value of Idcategorieproduit
     */
    public BigDecimal getIdcategorieproduit() {
        return (BigDecimal) getAttributeInternal(IDCATEGORIEPRODUIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcategorieproduit.
     * @param value value to set the Idcategorieproduit
     */
    public void setIdcategorieproduit(BigDecimal value) {
        setAttributeInternal(IDCATEGORIEPRODUIT, value);
    }

    /**
     * Gets the attribute value for Libellecategorie, using the alias name Libellecategorie.
     * @return the value of Libellecategorie
     */
    public String getLibellecategorie() {
        return (String) getAttributeInternal(LIBELLECATEGORIE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Libellecategorie.
     * @param value value to set the Libellecategorie
     */
    public void setLibellecategorie(String value) {
        setAttributeInternal(LIBELLECATEGORIE, value);
    }

    /**
     * Gets the attribute value for Codecategorie, using the alias name Codecategorie.
     * @return the value of Codecategorie
     */
    public String getCodecategorie() {
        return (String) getAttributeInternal(CODECATEGORIE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codecategorie.
     * @param value value to set the Codecategorie
     */
    public void setCodecategorie(String value) {
        setAttributeInternal(CODECATEGORIE, value);
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
     * Gets the attribute value for Quotas, using the alias name Quotas.
     * @return the value of Quotas
     */
    public Boolean getQuotas() {
        return (Boolean) getAttributeInternal(QUOTAS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quotas.
     * @param value value to set the Quotas
     */
    public void setQuotas(Boolean value) {
        setAttributeInternal(QUOTAS, value);
    }


    /**
     * Gets the attribute value for QuotasTransient, using the alias name QuotasTransient.
     * @return the value of QuotasTransient
     */
    public Boolean getQuotasTransient() {
        //return (Boolean) getAttributeInternal(QUOTASTRANSIENT);
        return (Boolean) getAttributeInternal(QUOTAS);
    }

    /**
     * Sets <code>value</code> as the attribute value for QuotasTransient.
     * @param value value to set the QuotasTransient
     */
    public void setQuotasTransient(Boolean value) {
        setAttributeInternal(QUOTASTRANSIENT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNL);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc1() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc2() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC2);
    }

    /**
     * @param idcategorieproduit key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idcategorieproduit) {
        return new Key(new Object[] { idcategorieproduit });
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
            System.out.println("entree dans la condition hasNext");
            Row r = vo.next();
            System.out.println("row = " + r);
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

