package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 20 04:03:16 WAT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PermissionnaireEtPermisRowImpl extends ViewRowImpl {
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
        Nomfichier,
        Cheminfichier,
        Typefichier,
        Nomouraisonsociale,
        Statut,
        Siegesocial,
        Nbreemploye,
        Contact,
        Mail,
        Codepnfl,
        Natureactivite,
        Numceqe,
        Idpermissionnairespnfl,
        Qualite,
        Nui,
        Profession,
        Typepersonne,
        Adressep,
        Sexe,
        Qualiteexploitant,
        Idcommune;
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
    public static final int TYPEDOCUMENT = AttributesEnum.Typedocument.index();
    public static final int NOMFICHIER = AttributesEnum.Nomfichier.index();
    public static final int CHEMINFICHIER = AttributesEnum.Cheminfichier.index();
    public static final int TYPEFICHIER = AttributesEnum.Typefichier.index();
    public static final int NOMOURAISONSOCIALE = AttributesEnum.Nomouraisonsociale.index();
    public static final int STATUT = AttributesEnum.Statut.index();
    public static final int SIEGESOCIAL = AttributesEnum.Siegesocial.index();
    public static final int NBREEMPLOYE = AttributesEnum.Nbreemploye.index();
    public static final int CONTACT = AttributesEnum.Contact.index();
    public static final int MAIL = AttributesEnum.Mail.index();
    public static final int CODEPNFL = AttributesEnum.Codepnfl.index();
    public static final int NATUREACTIVITE = AttributesEnum.Natureactivite.index();
    public static final int NUMCEQE = AttributesEnum.Numceqe.index();
    public static final int IDPERMISSIONNAIRESPNFL = AttributesEnum.Idpermissionnairespnfl.index();
    public static final int QUALITE = AttributesEnum.Qualite.index();
    public static final int NUI = AttributesEnum.Nui.index();
    public static final int PROFESSION = AttributesEnum.Profession.index();
    public static final int TYPEPERSONNE = AttributesEnum.Typepersonne.index();
    public static final int ADRESSEP = AttributesEnum.Adressep.index();
    public static final int SEXE = AttributesEnum.Sexe.index();
    public static final int QUALITEEXPLOITANT = AttributesEnum.Qualiteexploitant.index();
    public static final int IDCOMMUNE = AttributesEnum.Idcommune.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PermissionnaireEtPermisRowImpl() {
    }
}

