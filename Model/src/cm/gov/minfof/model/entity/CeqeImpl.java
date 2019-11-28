package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 15 08:25:32 WAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CeqeImpl extends EntityImpl {
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
        if (operation == DML_INSERT)
        {
            BigDecimal id = getLastId("getLastIdCeqe1");
            setIdceqe(id);
        }
        super.doDML(operation, e);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idceqe,
        Numeroceqe,
        Datedelivrance,
        Observation,
        Idpermissionnaire,
        Nomfichier,
        Cheminfichier,
        nomouraisonsociale,
        Idpermis,
        numeropermis,
        Ceqe,
        IdpermissionnaireCeqe;
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


    public static final int IDCEQE = AttributesEnum.Idceqe.index();
    public static final int NUMEROCEQE = AttributesEnum.Numeroceqe.index();
    public static final int DATEDELIVRANCE = AttributesEnum.Datedelivrance.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int NOMFICHIER = AttributesEnum.Nomfichier.index();
    public static final int CHEMINFICHIER = AttributesEnum.Cheminfichier.index();
    public static final int NOMOURAISONSOCIALE = AttributesEnum.nomouraisonsociale.index();
    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int NUMEROPERMIS = AttributesEnum.numeropermis.index();
    public static final int CEQE = AttributesEnum.Ceqe.index();
    public static final int IDPERMISSIONNAIRECEQE = AttributesEnum.IdpermissionnaireCeqe.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CeqeImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Ceqe");
    }


    /**
     * Gets the attribute value for Idceqe, using the alias name Idceqe.
     * @return the value of Idceqe
     */
    public BigDecimal getIdceqe() {
        return (BigDecimal) getAttributeInternal(IDCEQE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idceqe.
     * @param value value to set the Idceqe
     */
    public void setIdceqe(BigDecimal value) {
        setAttributeInternal(IDCEQE, value);
    }

    /**
     * Gets the attribute value for Numeroceqe, using the alias name Numeroceqe.
     * @return the value of Numeroceqe
     */
    public String getNumeroceqe() {
        return (String) getAttributeInternal(NUMEROCEQE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numeroceqe.
     * @param value value to set the Numeroceqe
     */
    public void setNumeroceqe(String value) {
        setAttributeInternal(NUMEROCEQE, value);
    }

    /**
     * Gets the attribute value for Datedelivrance, using the alias name Datedelivrance.
     * @return the value of Datedelivrance
     */
    public Date getDatedelivrance() {
        return (Date) getAttributeInternal(DATEDELIVRANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Datedelivrance.
     * @param value value to set the Datedelivrance
     */
    public void setDatedelivrance(Date value) {
        setAttributeInternal(DATEDELIVRANCE, value);
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
     * Gets the attribute value for Idpermissionnaire, using the alias name Idpermissionnaire.
     * @return the value of Idpermissionnaire
     */
    public BigDecimal getIdpermissionnaire() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermissionnaire.
     * @param value value to set the Idpermissionnaire
     */
    public void setIdpermissionnaire(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRE, value);
    }

    /**
     * Gets the attribute value for Nomfichier, using the alias name Nomfichier.
     * @return the value of Nomfichier
     */
    public String getNomfichier() {
        return (String) getAttributeInternal(NOMFICHIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomfichier.
     * @param value value to set the Nomfichier
     */
    public void setNomfichier(String value) {
        setAttributeInternal(NOMFICHIER, value);
    }

    /**
     * Gets the attribute value for Cheminfichier, using the alias name Cheminfichier.
     * @return the value of Cheminfichier
     */
    public String getCheminfichier() {
        return (String) getAttributeInternal(CHEMINFICHIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cheminfichier.
     * @param value value to set the Cheminfichier
     */
    public void setCheminfichier(String value) {
        setAttributeInternal(CHEMINFICHIER, value);
    }

    /**
     * Gets the attribute value for nomouraisonsociale, using the alias name nomouraisonsociale.
     * @return the value of nomouraisonsociale
     */
    public String getnomouraisonsociale() {
        return (String) getAttributeInternal(NOMOURAISONSOCIALE);
    }

    /**
     * Sets <code>value</code> as the attribute value for nomouraisonsociale.
     * @param value value to set the nomouraisonsociale
     */
    public void setnomouraisonsociale(String value) {
        setAttributeInternal(NOMOURAISONSOCIALE, value);
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
     * Gets the attribute value for numeropermis, using the alias name numeropermis.
     * @return the value of numeropermis
     */
    public String getnumeropermis() {
        return (String) getAttributeInternal(NUMEROPERMIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for numeropermis.
     * @param value value to set the numeropermis
     */
    public void setnumeropermis(String value) {
        setAttributeInternal(NUMEROPERMIS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCeqe() {
        return (RowIterator) getAttributeInternal(CEQE);
    }

    /**
     * @return the associated entity CeqeImpl.
     */
    public CeqeImpl getIdpermissionnaireCeqe() {
        return (CeqeImpl) getAttributeInternal(IDPERMISSIONNAIRECEQE);
    }

    /**
     * Sets <code>value</code> as the associated entity CeqeImpl.
     */
    public void setIdpermissionnaireCeqe(CeqeImpl value) {
        setAttributeInternal(IDPERMISSIONNAIRECEQE, value);
    }


    /**
     * @param idceqe key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idceqe) {
        return new Key(new Object[] { idceqe });
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

