package cm.gov.minfof.model.entityviewobject;


import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 05 16:57:07 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getLastIdRegionsRowImpl extends ViewRowImpl {
  //  @Override
    public BigDecimal getSelectobjects0() {
        //this.getIdmax();
        return null;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idmax;
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


    public static final int IDMAX = AttributesEnum.Idmax.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getLastIdRegionsRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Idmax.
     * @return the Idmax
     */
    public BigDecimal getIdmax() {
        return (BigDecimal) getAttributeInternal(IDMAX);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Idmax.
     * @param value value to set the  Idmax
     */
    public void setIdmax(BigDecimal value) {
        setAttributeInternal(IDMAX, value);
    }

}

