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
// ---    Wed Aug 10 23:03:19 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OriginespnflsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idoriginespnfls,
        Nomsource,
        Originepnfl,
        Detailscollectepfnl,
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


    public static final int IDORIGINESPNFLS = AttributesEnum.Idoriginespnfls.index();
    public static final int NOMSOURCE = AttributesEnum.Nomsource.index();
    public static final int ORIGINEPNFL = AttributesEnum.Originepnfl.index();
    public static final int DETAILSCOLLECTEPFNL = AttributesEnum.Detailscollectepfnl.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OriginespnflsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Originespnfls");
    }


    /**
     * Gets the attribute value for Idoriginespnfls, using the alias name Idoriginespnfls.
     * @return the value of Idoriginespnfls
     */
    public BigDecimal getIdoriginespnfls() {
        return (BigDecimal) getAttributeInternal(IDORIGINESPNFLS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idoriginespnfls.
     * @param value value to set the Idoriginespnfls
     */
    public void setIdoriginespnfls(BigDecimal value) {
        setAttributeInternal(IDORIGINESPNFLS, value);
    }

    /**
     * Gets the attribute value for Nomsource, using the alias name Nomsource.
     * @return the value of Nomsource
     */
    public String getNomsource() {
        return (String) getAttributeInternal(NOMSOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomsource.
     * @param value value to set the Nomsource
     */
    public void setNomsource(String value) {
        setAttributeInternal(NOMSOURCE, value);
    }

    /**
     * Gets the attribute value for Originepnfl, using the alias name Originepnfl.
     * @return the value of Originepnfl
     */
    public Integer getOriginepnfl() {
        return (Integer) getAttributeInternal(ORIGINEPNFL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Originepnfl.
     * @param value value to set the Originepnfl
     */
    public void setOriginepnfl(Integer value) {
        setAttributeInternal(ORIGINEPNFL, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL);
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
     * @param idoriginespnfls key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idoriginespnfls) {
        return new Key(new Object[] { idoriginespnfls });
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
}

