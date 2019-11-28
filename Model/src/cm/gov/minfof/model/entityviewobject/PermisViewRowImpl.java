package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.PermisImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 17 23:37:03 WAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PermisViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_PERMIS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpermis,
        Numeropermis,
        Zonecoupe,
        Datedelivrance,
        Datefin,
        Observation,
        Idagrement,
        Idpermissionnaire,
        Typedocument,
        Cheminfichier,
        Nomfichier,
        PermisView,
        PermisView1,
        DetailpermisView,
        PermissionnairespnflView,
        ExportpfnlView,
        CertificatorigineView,
        PermissionnairespnflView1,
        AgrementsView1,
        typeDocumentView1,
        CeqeView1,
        getCeqeParPermissionnaire1;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int NUMEROPERMIS = AttributesEnum.Numeropermis.index();
    public static final int ZONECOUPE = AttributesEnum.Zonecoupe.index();
    public static final int DATEDELIVRANCE = AttributesEnum.Datedelivrance.index();
    public static final int DATEFIN = AttributesEnum.Datefin.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int IDAGREMENT = AttributesEnum.Idagrement.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int TYPEDOCUMENT = AttributesEnum.Typedocument.index();
    public static final int CHEMINFICHIER = AttributesEnum.Cheminfichier.index();
    public static final int NOMFICHIER = AttributesEnum.Nomfichier.index();
    public static final int PERMISVIEW = AttributesEnum.PermisView.index();
    public static final int PERMISVIEW1 = AttributesEnum.PermisView1.index();
    public static final int DETAILPERMISVIEW = AttributesEnum.DetailpermisView.index();
    public static final int PERMISSIONNAIRESPNFLVIEW = AttributesEnum.PermissionnairespnflView.index();
    public static final int EXPORTPFNLVIEW = AttributesEnum.ExportpfnlView.index();
    public static final int CERTIFICATORIGINEVIEW = AttributesEnum.CertificatorigineView.index();
    public static final int PERMISSIONNAIRESPNFLVIEW1 = AttributesEnum.PermissionnairespnflView1.index();
    public static final int AGREMENTSVIEW1 = AttributesEnum.AgrementsView1.index();
    public static final int TYPEDOCUMENTVIEW1 = AttributesEnum.typeDocumentView1.index();
    public static final int CEQEVIEW1 = AttributesEnum.CeqeView1.index();
    public static final int GETCEQEPARPERMISSIONNAIRE1 = AttributesEnum.getCeqeParPermissionnaire1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PermisViewRowImpl() {
    }

    /**
     * Gets Permis entity object.
     * @return the Permis
     */
    public PermisImpl getPermis() {
        return (PermisImpl) getEntity(ENTITY_PERMIS);
    }

    /**
     * Gets the attribute value for idpermis using the alias name Idpermis.
     * @return the idpermis
     */
    public BigDecimal getIdpermis() {
        return (BigDecimal) getAttributeInternal(IDPERMIS);
    }

    /**
     * Sets <code>value</code> as attribute value for idpermis using the alias name Idpermis.
     * @param value value to set the idpermis
     */
    public void setIdpermis(BigDecimal value) {
        setAttributeInternal(IDPERMIS, value);
    }

    /**
     * Gets the attribute value for numeropermis using the alias name Numeropermis.
     * @return the numeropermis
     */
    public String getNumeropermis() {
        return (String) getAttributeInternal(NUMEROPERMIS);
    }

    /**
     * Sets <code>value</code> as attribute value for numeropermis using the alias name Numeropermis.
     * @param value value to set the numeropermis
     */
    public void setNumeropermis(String value) {
        setAttributeInternal(NUMEROPERMIS, value);
    }

    /**
     * Gets the attribute value for zonecoupe using the alias name Zonecoupe.
     * @return the zonecoupe
     */
    public String getZonecoupe() {
        return (String) getAttributeInternal(ZONECOUPE);
    }

    /**
     * Sets <code>value</code> as attribute value for zonecoupe using the alias name Zonecoupe.
     * @param value value to set the zonecoupe
     */
    public void setZonecoupe(String value) {
        setAttributeInternal(ZONECOUPE, value);
    }

    /**
     * Gets the attribute value for datedelivrance using the alias name Datedelivrance.
     * @return the datedelivrance
     */
    public Timestamp getDatedelivrance() {
        return (Timestamp) getAttributeInternal(DATEDELIVRANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for datedelivrance using the alias name Datedelivrance.
     * @param value value to set the datedelivrance
     */
    public void setDatedelivrance(Timestamp value) {
        setAttributeInternal(DATEDELIVRANCE, value);
    }

    /**
     * Gets the attribute value for datefin using the alias name Datefin.
     * @return the datefin
     */
    public Date getDatefin() {
        return (Date) getAttributeInternal(DATEFIN);
    }

    /**
     * Sets <code>value</code> as attribute value for datefin using the alias name Datefin.
     * @param value value to set the datefin
     */
    public void setDatefin(Date value) {
        setAttributeInternal(DATEFIN, value);
    }

    /**
     * Gets the attribute value for observation using the alias name Observation.
     * @return the observation
     */
    public String getObservation() {
        return (String) getAttributeInternal(OBSERVATION);
    }

    /**
     * Sets <code>value</code> as attribute value for observation using the alias name Observation.
     * @param value value to set the observation
     */
    public void setObservation(String value) {
        setAttributeInternal(OBSERVATION, value);
    }

    /**
     * Gets the attribute value for idagrement using the alias name Idagrement.
     * @return the idagrement
     */
    public BigDecimal getIdagrement() {
        return (BigDecimal) getAttributeInternal(IDAGREMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for idagrement using the alias name Idagrement.
     * @param value value to set the idagrement
     */
    public void setIdagrement(BigDecimal value) {
        setAttributeInternal(IDAGREMENT, value);
    }

    /**
     * Gets the attribute value for idpermissionnaire using the alias name Idpermissionnaire.
     * @return the idpermissionnaire
     */
    public BigDecimal getIdpermissionnaire() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRE);
    }

    /**
     * Sets <code>value</code> as attribute value for idpermissionnaire using the alias name Idpermissionnaire.
     * @param value value to set the idpermissionnaire
     */
    public void setIdpermissionnaire(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRE, value);
    }

    /**
     * Gets the attribute value for typedocument using the alias name Typedocument.
     * @return the typedocument
     */
    public Integer getTypedocument() {
        return (Integer) getAttributeInternal(TYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for typedocument using the alias name Typedocument.
     * @param value value to set the typedocument
     */
    public void setTypedocument(Integer value) {
        setAttributeInternal(TYPEDOCUMENT, value);
    }

    /**
     * Gets the attribute value for cheminfichier using the alias name Cheminfichier.
     * @return the cheminfichier
     */
    public String getCheminfichier() {
        return (String) getAttributeInternal(CHEMINFICHIER);
    }

    /**
     * Sets <code>value</code> as attribute value for cheminfichier using the alias name Cheminfichier.
     * @param value value to set the cheminfichier
     */
    public void setCheminfichier(String value) {
        setAttributeInternal(CHEMINFICHIER, value);
    }

    /**
     * Gets the attribute value for nomfichier using the alias name Nomfichier.
     * @return the nomfichier
     */
    public String getNomfichier() {
        return (String) getAttributeInternal(NOMFICHIER);
    }

    /**
     * Sets <code>value</code> as attribute value for nomfichier using the alias name Nomfichier.
     * @param value value to set the nomfichier
     */
    public void setNomfichier(String value) {
        setAttributeInternal(NOMFICHIER, value);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link PermisView.
     */
    public RowIterator getPermisView() {
        return (RowIterator) getAttributeInternal(PERMISVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link PermisView1.
     */
    public RowIterator getPermisView1() {
        return (RowIterator) getAttributeInternal(PERMISVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailpermisView.
     */
    public RowIterator getDetailpermisView() {
        return (RowIterator) getAttributeInternal(DETAILPERMISVIEW);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link PermissionnairespnflView.
     */
    public ViewRowImpl getPermissionnairespnflView() {
        return (ViewRowImpl) getAttributeInternal(PERMISSIONNAIRESPNFLVIEW);
    }

    /**
     * Sets the master-detail link PermissionnairespnflView between this object and <code>value</code>.
     */
    public void setPermissionnairespnflView(ViewRowImpl value) {
        setAttributeInternal(PERMISSIONNAIRESPNFLVIEW, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ExportpfnlView.
     */
    public RowIterator getExportpfnlView() {
        return (RowIterator) getAttributeInternal(EXPORTPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CertificatorigineView.
     */
    public RowIterator getCertificatorigineView() {
        return (RowIterator) getAttributeInternal(CERTIFICATORIGINEVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PermissionnairespnflView1.
     */
    public RowSet getPermissionnairespnflView1() {
        return (RowSet) getAttributeInternal(PERMISSIONNAIRESPNFLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AgrementsView1.
     */
    public RowSet getAgrementsView1() {
        return (RowSet) getAttributeInternal(AGREMENTSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> typeDocumentView1.
     */
    public RowSet gettypeDocumentView1() {
        return (RowSet) getAttributeInternal(TYPEDOCUMENTVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CeqeView1.
     */
    public RowSet getCeqeView1() {
        return (RowSet) getAttributeInternal(CEQEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getCeqeParPermissionnaire1.
     */
    public RowSet getgetCeqeParPermissionnaire1() {
        return (RowSet) getAttributeInternal(GETCEQEPARPERMISSIONNAIRE1);
    }
}

