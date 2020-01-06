package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 29 12:51:35 WAT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class typeDocViewFinalRowImpl extends ViewRowImpl {
    public static final int ENTITY_TYPEDOCUMENT = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idtypedocument,
        Libelletypedocument;
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
    public static final int IDTYPEDOCUMENT = AttributesEnum.Idtypedocument.index();
    public static final int LIBELLETYPEDOCUMENT = AttributesEnum.Libelletypedocument.index();

    /**
     * This is the default constructor (do not remove).
     */
    public typeDocViewFinalRowImpl() {
    }

    /**
     * Gets TypeDocument entity object.
     * @return the TypeDocument
     */
    public EntityImpl getTypeDocument() {
        return (EntityImpl) getEntity(ENTITY_TYPEDOCUMENT);
    }

    /**
     * Gets the attribute value for idtypedocument using the alias name Idtypedocument.
     * @return the idtypedocument
     */
    public BigDecimal getIdtypedocument() {
        return (BigDecimal) getAttributeInternal(IDTYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for idtypedocument using the alias name Idtypedocument.
     * @param value value to set the idtypedocument
     */
    public void setIdtypedocument(BigDecimal value) {
        setAttributeInternal(IDTYPEDOCUMENT, value);
    }

    /**
     * Gets the attribute value for libelletypedocument using the alias name Libelletypedocument.
     * @return the libelletypedocument
     */
    public String getLibelletypedocument() {
        return (String) getAttributeInternal(LIBELLETYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for libelletypedocument using the alias name Libelletypedocument.
     * @param value value to set the libelletypedocument
     */
    public void setLibelletypedocument(String value) {
        setAttributeInternal(LIBELLETYPEDOCUMENT, value);
    }
}

