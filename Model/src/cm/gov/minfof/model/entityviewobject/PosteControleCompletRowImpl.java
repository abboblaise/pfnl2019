package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 22 12:17:51 WAT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PosteControleCompletRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Codeposte,
        Intituleposte,
        Codecommune,
        Nomcommune,
        Codedepartement,
        Nomdepartement,
        Nomcheflieu,
        Coderegion,
        Nomregion,
        Cheflieuregion,
        Idregions,
        Iddepartements;
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


    public static final int CODEPOSTE = AttributesEnum.Codeposte.index();
    public static final int INTITULEPOSTE = AttributesEnum.Intituleposte.index();
    public static final int CODECOMMUNE = AttributesEnum.Codecommune.index();
    public static final int NOMCOMMUNE = AttributesEnum.Nomcommune.index();
    public static final int CODEDEPARTEMENT = AttributesEnum.Codedepartement.index();
    public static final int NOMDEPARTEMENT = AttributesEnum.Nomdepartement.index();
    public static final int NOMCHEFLIEU = AttributesEnum.Nomcheflieu.index();
    public static final int CODEREGION = AttributesEnum.Coderegion.index();
    public static final int NOMREGION = AttributesEnum.Nomregion.index();
    public static final int CHEFLIEUREGION = AttributesEnum.Cheflieuregion.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PosteControleCompletRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Codeposte.
     * @return the Codeposte
     */
    public String getCodeposte() {
        return (String) getAttributeInternal(CODEPOSTE);
    }

    /**
     * Gets the attribute value for the calculated attribute Intituleposte.
     * @return the Intituleposte
     */
    public String getIntituleposte() {
        return (String) getAttributeInternal(INTITULEPOSTE);
    }

    /**
     * Gets the attribute value for the calculated attribute Codecommune.
     * @return the Codecommune
     */
    public String getCodecommune() {
        return (String) getAttributeInternal(CODECOMMUNE);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomcommune.
     * @return the Nomcommune
     */
    public String getNomcommune() {
        return (String) getAttributeInternal(NOMCOMMUNE);
    }

    /**
     * Gets the attribute value for the calculated attribute Codedepartement.
     * @return the Codedepartement
     */
    public String getCodedepartement() {
        return (String) getAttributeInternal(CODEDEPARTEMENT);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomdepartement.
     * @return the Nomdepartement
     */
    public String getNomdepartement() {
        return (String) getAttributeInternal(NOMDEPARTEMENT);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomcheflieu.
     * @return the Nomcheflieu
     */
    public String getNomcheflieu() {
        return (String) getAttributeInternal(NOMCHEFLIEU);
    }

    /**
     * Gets the attribute value for the calculated attribute Coderegion.
     * @return the Coderegion
     */
    public String getCoderegion() {
        return (String) getAttributeInternal(CODEREGION);
    }

    /**
     * Gets the attribute value for the calculated attribute Nomregion.
     * @return the Nomregion
     */
    public String getNomregion() {
        return (String) getAttributeInternal(NOMREGION);
    }

    /**
     * Gets the attribute value for the calculated attribute Cheflieuregion.
     * @return the Cheflieuregion
     */
    public String getCheflieuregion() {
        return (String) getAttributeInternal(CHEFLIEUREGION);
    }

    /**
     * Gets the attribute value for the calculated attribute Idregions.
     * @return the Idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Gets the attribute value for the calculated attribute Iddepartements.
     * @return the Iddepartements
     */
    public BigDecimal getIddepartements() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTS);
    }
}

