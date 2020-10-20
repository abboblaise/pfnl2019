package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entityviewobject.common.Longtext3;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 15 00:04:19 WAT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getExportDocumentsOfficielsRowImpl extends ViewRowImpl {


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
        Nomfichier,
        Cheminfichier,
        Typefichier,
        Idtypedocument,
        Iddetailpermis,
        Idunitemesure,
        Idpartieproduitpfnl,
        Quantite,
        Idregions,
        Iddepartements,
        Nomouraisonsociale,
        Libelleunitemesure;
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


    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int NUMEROPERMIS = AttributesEnum.Numeropermis.index();
    public static final int ZONECOUPE = AttributesEnum.Zonecoupe.index();
    public static final int DATEDELIVRANCE = AttributesEnum.Datedelivrance.index();
    public static final int DATEFIN = AttributesEnum.Datefin.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int IDAGREMENT = AttributesEnum.Idagrement.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int NOMFICHIER = AttributesEnum.Nomfichier.index();
    public static final int CHEMINFICHIER = AttributesEnum.Cheminfichier.index();
    public static final int TYPEFICHIER = AttributesEnum.Typefichier.index();
    public static final int IDTYPEDOCUMENT = AttributesEnum.Idtypedocument.index();
    public static final int IDDETAILPERMIS = AttributesEnum.Iddetailpermis.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDPARTIEPRODUITPFNL = AttributesEnum.Idpartieproduitpfnl.index();
    public static final int QUANTITE = AttributesEnum.Quantite.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int NOMOURAISONSOCIALE = AttributesEnum.Nomouraisonsociale.index();
    public static final int LIBELLEUNITEMESURE = AttributesEnum.Libelleunitemesure.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getExportDocumentsOfficielsRowImpl() {
    }
}
