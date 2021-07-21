package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 27 13:19:27 WAT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class lesPostesControlesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpostecontrole,
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
    public static final int IDPOSTECONTROLE = AttributesEnum.Idpostecontrole.index();
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
    public lesPostesControlesImpl() {
    }

    /**
     * Gets the attribute value for Idpostecontrole, using the alias name Idpostecontrole.
     * @return the value of Idpostecontrole
     */
    public BigDecimal getIdpostecontrole() {
        return (BigDecimal) getAttributeInternal(IDPOSTECONTROLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpostecontrole.
     * @param value value to set the Idpostecontrole
     */
    public void setIdpostecontrole(BigDecimal value) {
        setAttributeInternal(IDPOSTECONTROLE, value);
    }

    /**
     * Gets the attribute value for Codeposte, using the alias name Codeposte.
     * @return the value of Codeposte
     */
    public String getCodeposte() {
        return (String) getAttributeInternal(CODEPOSTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codeposte.
     * @param value value to set the Codeposte
     */
    public void setCodeposte(String value) {
        setAttributeInternal(CODEPOSTE, value);
    }

    /**
     * Gets the attribute value for Intituleposte, using the alias name Intituleposte.
     * @return the value of Intituleposte
     */
    public String getIntituleposte() {
        return (String) getAttributeInternal(INTITULEPOSTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Intituleposte.
     * @param value value to set the Intituleposte
     */
    public void setIntituleposte(String value) {
        setAttributeInternal(INTITULEPOSTE, value);
    }

    /**
     * Gets the attribute value for Codecommune, using the alias name Codecommune.
     * @return the value of Codecommune
     */
    public String getCodecommune() {
        return (String) getAttributeInternal(CODECOMMUNE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codecommune.
     * @param value value to set the Codecommune
     */
    public void setCodecommune(String value) {
        setAttributeInternal(CODECOMMUNE, value);
    }

    /**
     * Gets the attribute value for Nomcommune, using the alias name Nomcommune.
     * @return the value of Nomcommune
     */
    public String getNomcommune() {
        return (String) getAttributeInternal(NOMCOMMUNE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomcommune.
     * @param value value to set the Nomcommune
     */
    public void setNomcommune(String value) {
        setAttributeInternal(NOMCOMMUNE, value);
    }

    /**
     * Gets the attribute value for Codedepartement, using the alias name Codedepartement.
     * @return the value of Codedepartement
     */
    public String getCodedepartement() {
        return (String) getAttributeInternal(CODEDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codedepartement.
     * @param value value to set the Codedepartement
     */
    public void setCodedepartement(String value) {
        setAttributeInternal(CODEDEPARTEMENT, value);
    }

    /**
     * Gets the attribute value for Nomdepartement, using the alias name Nomdepartement.
     * @return the value of Nomdepartement
     */
    public String getNomdepartement() {
        return (String) getAttributeInternal(NOMDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomdepartement.
     * @param value value to set the Nomdepartement
     */
    public void setNomdepartement(String value) {
        setAttributeInternal(NOMDEPARTEMENT, value);
    }

    /**
     * Gets the attribute value for Nomcheflieu, using the alias name Nomcheflieu.
     * @return the value of Nomcheflieu
     */
    public String getNomcheflieu() {
        return (String) getAttributeInternal(NOMCHEFLIEU);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomcheflieu.
     * @param value value to set the Nomcheflieu
     */
    public void setNomcheflieu(String value) {
        setAttributeInternal(NOMCHEFLIEU, value);
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
     * @param idpostecontrole key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idpostecontrole) {
        return new Key(new Object[] { idpostecontrole });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.lesPostesControles");
    }
}

