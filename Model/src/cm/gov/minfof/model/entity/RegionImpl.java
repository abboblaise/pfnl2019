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
import java.math.BigDecimal;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 05 12:21:08 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegionImpl extends EntityImpl {
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
    
    
    public BigDecimal getLastId(String viewName)
    {
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext())
        {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT)
        {
            BigDecimal id = getLastId("getLastIdRegions1");
            setIdregions(id);
        }
        super.doDML(operation, e);
    }

    @Override
    public void beforeCommit(TransactionEvent transactionEvent) {
        super.beforeCommit(transactionEvent);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idregions,
        Nomregion,
        Coderegion,
        Descriptionregions,
        Cheflieuregion,
        Abreviationregion,
        Departement,
        Commune,
        Vehicule,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2,
        Collectepfnl;
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


    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int NOMREGION = AttributesEnum.Nomregion.index();
    public static final int CODEREGION = AttributesEnum.Coderegion.index();
    public static final int DESCRIPTIONREGIONS = AttributesEnum.Descriptionregions.index();
    public static final int CHEFLIEUREGION = AttributesEnum.Cheflieuregion.index();
    public static final int ABREVIATIONREGION = AttributesEnum.Abreviationregion.index();
    public static final int DEPARTEMENT = AttributesEnum.Departement.index();
    public static final int COMMUNE = AttributesEnum.Commune.index();
    public static final int VEHICULE = AttributesEnum.Vehicule.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();
    public static final int COLLECTEPFNL = AttributesEnum.Collectepfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RegionImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Region");
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
     * Gets the attribute value for Nomregion, using the alias name Nomregion.
     * @return the value of Nomregion
     */
    public String getNomregion() {
        return (String) getAttributeInternal(NOMREGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomregion.
     * @param value value to set the Nomregion
     */
    public void setNomregion(String value) {
        setAttributeInternal(NOMREGION, value);
    }

    /**
     * Gets the attribute value for Coderegion, using the alias name Coderegion.
     * @return the value of Coderegion
     */
    public String getCoderegion() {
        return (String) getAttributeInternal(CODEREGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Coderegion.
     * @param value value to set the Coderegion
     */
    public void setCoderegion(String value) {
        setAttributeInternal(CODEREGION, value);
    }

    /**
     * Gets the attribute value for Descriptionregions, using the alias name Descriptionregions.
     * @return the value of Descriptionregions
     */
    public String getDescriptionregions() {
        return (String) getAttributeInternal(DESCRIPTIONREGIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Descriptionregions.
     * @param value value to set the Descriptionregions
     */
    public void setDescriptionregions(String value) {
        setAttributeInternal(DESCRIPTIONREGIONS, value);
    }

    /**
     * Gets the attribute value for Cheflieuregion, using the alias name Cheflieuregion.
     * @return the value of Cheflieuregion
     */
    public String getCheflieuregion() {
        return (String) getAttributeInternal(CHEFLIEUREGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cheflieuregion.
     * @param value value to set the Cheflieuregion
     */
    public void setCheflieuregion(String value) {
        setAttributeInternal(CHEFLIEUREGION, value);
    }

    /**
     * Gets the attribute value for Abreviationregion, using the alias name Abreviationregion.
     * @return the value of Abreviationregion
     */
    public String getAbreviationregion() {
        return (String) getAttributeInternal(ABREVIATIONREGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Abreviationregion.
     * @param value value to set the Abreviationregion
     */
    public void setAbreviationregion(String value) {
        setAttributeInternal(ABREVIATIONREGION, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartement() {
        return (RowIterator) getAttributeInternal(DEPARTEMENT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCommune() {
        return (RowIterator) getAttributeInternal(COMMUNE);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getVehicule() {
        return (RowIterator) getAttributeInternal(VEHICULE);
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
     * @param idregions key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idregions) {
        return new Key(new Object[] { idregions });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }
}

