package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 08 21:16:24 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class permisActifViewRowImpl extends ViewRowImpl {


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpermis,
        Numeropermis,
        Datedelivrance,
        Datefin,
        Idpermissionnaire,
        Typedocument,
        Nomouraisonsociale;
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
    public static final int DATEDELIVRANCE = AttributesEnum.Datedelivrance.index();
    public static final int DATEFIN = AttributesEnum.Datefin.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int TYPEDOCUMENT = AttributesEnum.Typedocument.index();
    public static final int NOMOURAISONSOCIALE = AttributesEnum.Nomouraisonsociale.index();

    /**
     * This is the default constructor (do not remove).
     */
    public permisActifViewRowImpl() {
    }
}

