package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 04 19:42:32 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class getLibelleProduitCompletRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Libelle,
        Idpartiesproduitspfnl,
        Idcategorieunitemesure;
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


    public static final int LIBELLE = AttributesEnum.Libelle.index();
    public static final int IDPARTIESPRODUITSPFNL = AttributesEnum.Idpartiesproduitspfnl.index();
    public static final int IDCATEGORIEUNITEMESURE = AttributesEnum.Idcategorieunitemesure.index();

    /**
     * This is the default constructor (do not remove).
     */
    public getLibelleProduitCompletRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Libelle.
     * @return the Libelle
     */
    public String getLibelle() {
        return (String) getAttributeInternal(LIBELLE);
    }

    /**
     * Gets the attribute value for the calculated attribute Idpartiesproduitspfnl.
     * @return the Idpartiesproduitspfnl
     */
    public BigDecimal getIdpartiesproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIESPRODUITSPFNL);
    }

    /**
     * Gets the attribute value for the calculated attribute Idcategorieunitemesure.
     * @return the Idcategorieunitemesure
     */
    public BigDecimal getIdcategorieunitemesure() {
        return (BigDecimal) getAttributeInternal(IDCATEGORIEUNITEMESURE);
    }
}

