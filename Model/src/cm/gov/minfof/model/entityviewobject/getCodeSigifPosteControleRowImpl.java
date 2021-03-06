package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 24 14:38:49 WAT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getCodeSigifPosteControleRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Codesigif,
        Iddepartements,
        Idregions,
        Idcommunes,
        Idpostecontrole;
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
    public static final int CODESIGIF = AttributesEnum.Codesigif.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int IDCOMMUNES = AttributesEnum.Idcommunes.index();
    public static final int IDPOSTECONTROLE = AttributesEnum.Idpostecontrole.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getCodeSigifPosteControleRowImpl() {
    }
}

