package cm.gov.minfof.model.entityviewobject;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 12 14:25:54 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class listeQualitePermissionnaireRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        idQualitePermissionnaire,
        libelleQualitePermissionnaire;
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
    public static final int IDQUALITEPERMISSIONNAIRE = AttributesEnum.idQualitePermissionnaire.index();
    public static final int LIBELLEQUALITEPERMISSIONNAIRE = AttributesEnum.libelleQualitePermissionnaire.index();

    /**
     * This is the default constructor (do not remove).
     */
    public listeQualitePermissionnaireRowImpl() {
    }
}

