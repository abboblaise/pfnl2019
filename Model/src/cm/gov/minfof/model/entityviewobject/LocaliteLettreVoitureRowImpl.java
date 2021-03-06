package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 15 05:40:58 WAT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LocaliteLettreVoitureRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcommune,
        Idlocalite,
        Nomlocalite,
        Iddepartements,
        Idregions,
        Nomdepartement,
        Nomregion;
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

    public static final int IDCOMMUNE = AttributesEnum.Idcommune.index();
    public static final int IDLOCALITE = AttributesEnum.Idlocalite.index();
    public static final int NOMLOCALITE = AttributesEnum.Nomlocalite.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int NOMDEPARTEMENT = AttributesEnum.Nomdepartement.index();
    public static final int NOMREGION = AttributesEnum.Nomregion.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LocaliteLettreVoitureRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Idcommune.
     * @return the Idcommune
     */
    public BigDecimal getIdcommune() {
        return (BigDecimal) getAttributeInternal(IDCOMMUNE);
    }

    /**
     * Gets the attribute value for the calculated attribute Idlocalite.
     * @return the Idlocalite
     */
    public BigDecimal getIdlocalite() {
        return (BigDecimal) getAttributeInternal(IDLOCALITE);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomlocalite.
     * @return the Nomlocalite
     */
    public String getNomlocalite() {
        return (String) getAttributeInternal(NOMLOCALITE);
    }

    /**
     * Gets the attribute value for the calculated attribute Iddepartements.
     * @return the Iddepartements
     */
    public BigDecimal getIddepartements() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTS);
    }

    /**
     * Gets the attribute value for the calculated attribute Idregions.
     * @return the Idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomdepartement.
     * @return the Nomdepartement
     */
    public String getNomdepartement() {
        return (String) getAttributeInternal(NOMDEPARTEMENT);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomregion.
     * @return the Nomregion
     */
    public String getNomregion() {
        return (String) getAttributeInternal(NOMREGION);
    }
}

