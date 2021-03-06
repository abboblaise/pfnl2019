package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.CeqeImpl;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Calendar;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 17 21:55:28 WAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CeqeViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_CEQE = 0;

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
        numComplet,
        CeqeView,
        LettreVoiturePcView,
        PermissionnairespnflView1,
        PermisView1,
        getPermisActifParPermissionnaire1,
        getTousLesPermis1;
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
    public static final int NUMCOMPLET = AttributesEnum.numComplet.index();
    public static final int CEQEVIEW = AttributesEnum.CeqeView.index();
    public static final int LETTREVOITUREPCVIEW = AttributesEnum.LettreVoiturePcView.index();
    public static final int PERMISSIONNAIRESPNFLVIEW1 = AttributesEnum.PermissionnairespnflView1.index();
    public static final int PERMISVIEW1 = AttributesEnum.PermisView1.index();
    public static final int GETPERMISACTIFPARPERMISSIONNAIRE1 =
        AttributesEnum.getPermisActifParPermissionnaire1.index();
    public static final int GETTOUSLESPERMIS1 = AttributesEnum.getTousLesPermis1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CeqeViewRowImpl() {
    }

    /**
     * Gets Ceqe entity object.
     * @return the Ceqe
     */
    public CeqeImpl getCeqe() {
        return (CeqeImpl) getEntity(ENTITY_CEQE);
    }

    /**
     * Gets the attribute value for idceqe using the alias name Idceqe.
     * @return the idceqe
     */
    public BigDecimal getIdceqe() {
        return (BigDecimal) getAttributeInternal(IDCEQE);
    }

    /**
     * Sets <code>value</code> as attribute value for idceqe using the alias name Idceqe.
     * @param value value to set the idceqe
     */
    public void setIdceqe(BigDecimal value) {
        setAttributeInternal(IDCEQE, value);
    }

    /**
     * Gets the attribute value for numeroceqe using the alias name Numeroceqe.
     * @return the numeroceqe
     */
    public String getNumeroceqe() {
        //return (String) getAttributeInternal(NUMEROCEQE);
        String val = (String) getAttributeInternal(NUMEROCEQE);
        if(val != null)
            return val.substring(11);
        else
            return "";
    }

    /**
     * Sets <code>value</code> as attribute value for numeroceqe using the alias name Numeroceqe.
     * @param value value to set the numeroceqe
     */
    public void setNumeroceqe(String value) {
     //   setAttributeInternal(NUMEROCEQE, value);
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        String value1;
        
        value1 = Integer.toString(year) + "/CEQPC/" + value;
        value = value1;
        setAttributeInternal(NUMEROCEQE, value);
        
    }

    /**
     * Gets the attribute value for datedelivrance using the alias name Datedelivrance.
     * @return the datedelivrance
     */
    public Date getDatedelivrance() {
        return (Date) getAttributeInternal(DATEDELIVRANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for datedelivrance using the alias name Datedelivrance.
     * @param value value to set the datedelivrance
     */
    public void setDatedelivrance(Date value) {
        setAttributeInternal(DATEDELIVRANCE, value);
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
     * Gets the attribute value for nomouraisonsociale using the alias name nomouraisonsociale.
     * @return the nomouraisonsociale
     */
    public String getnomouraisonsociale() {
        String result = "";
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voIm = am.getPermissionnairespnflView1();
        voIm.setWhereClause("Idpermissionnairespnfl="+getIdpermissionnaire());
        voIm.executeQuery();
        if (voIm.hasNext()){
            Row r = voIm.next();
            result = r.getAttribute("Nomouraisonsociale").toString();
            }
        voIm.setWhereClause(null);
        voIm.executeQuery();
        return result;
      //  return (String) getAttributeInternal(NOMOURAISONSOCIALE);
    }

    /**
     * Sets <code>value</code> as attribute value for nomouraisonsociale using the alias name nomouraisonsociale.
     * @param value value to set the nomouraisonsociale
     */
    public void setnomouraisonsociale(String value) {
        setAttributeInternal(NOMOURAISONSOCIALE, value);
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
     * Gets the attribute value for numeropermis using the alias name numeropermis.
     * @return the numeropermis
     */
    public String getnumeropermis() {
        AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
        ViewObjectImpl voimp = am.getPermisView1();
        voimp.setWhereClause("Idpermis = "+getIdpermis());
        String Resultat = "";
        voimp.executeQuery();
        if(voimp.hasNext()){
            Row r = voimp.next();
            Resultat = r.getAttribute("Numeropermis").toString();
        }
        voimp.setWhereClause(null);
        voimp.executeQuery();
        return Resultat;
        //return (String) getAttributeInternal(NUMEROPERMIS);
    }

    /**
     * Sets <code>value</code> as attribute value for numeropermis using the alias name numeropermis.
     * @param value value to set the numeropermis
     */
    public void setnumeropermis(String value) {
        setAttributeInternal(NUMEROPERMIS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute numComplet.
     * @return the numComplet
     */
    public String getnumComplet() {
        return (String) getAttributeInternal(NUMEROCEQE);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CeqeView.
     */
    public RowIterator getCeqeView() {
        return (RowIterator) getAttributeInternal(CEQEVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link LettreVoiturePcView.
     */
    public RowIterator getLettreVoiturePcView() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPCVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PermissionnairespnflView1.
     */
    public RowSet getPermissionnairespnflView1() {
        return (RowSet) getAttributeInternal(PERMISSIONNAIRESPNFLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PermisView1.
     */
    public RowSet getPermisView1() {
        return (RowSet) getAttributeInternal(PERMISVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getPermisActifParPermissionnaire1.
     */
    public RowSet getgetPermisActifParPermissionnaire1() {
        return (RowSet) getAttributeInternal(GETPERMISACTIFPARPERMISSIONNAIRE1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getTousLesPermis1.
     */
    public RowSet getgetTousLesPermis1() {
        return (RowSet) getAttributeInternal(GETTOUSLESPERMIS1);
    }
}

