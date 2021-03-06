package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 29 11:20:17 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PartiesProduitsPfnlViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_PARTIESPRODUITSPFNL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpartiesproduitspfnl,
        Idpartiesrecoltees,
        Idproduitspfnl,
        Idunitemesure,
        Idunitemesureexport,
        PartiesProduitsPfnlView,
        PartiesProduitsPfnlView1,
        ProduitsPfnlView,
        UnitemesureView,
        UnitemesureView1,
        DetailscollectepfnlView,
        DetailsexportpfnlView,
        LettreVoiturePcView,
        LettreVoiturePcView1,
        LettreVoiturePcView2,
        UnitemesureView2,
        UnitemesureView3,
        PartiesrecolteesView1;
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


    public static final int IDPARTIESPRODUITSPFNL = AttributesEnum.Idpartiesproduitspfnl.index();
    public static final int IDPARTIESRECOLTEES = AttributesEnum.Idpartiesrecoltees.index();
    public static final int IDPRODUITSPFNL = AttributesEnum.Idproduitspfnl.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDUNITEMESUREEXPORT = AttributesEnum.Idunitemesureexport.index();
    public static final int PARTIESPRODUITSPFNLVIEW = AttributesEnum.PartiesProduitsPfnlView.index();
    public static final int PARTIESPRODUITSPFNLVIEW1 = AttributesEnum.PartiesProduitsPfnlView1.index();
    public static final int PRODUITSPFNLVIEW = AttributesEnum.ProduitsPfnlView.index();
    public static final int UNITEMESUREVIEW = AttributesEnum.UnitemesureView.index();
    public static final int UNITEMESUREVIEW1 = AttributesEnum.UnitemesureView1.index();
    public static final int DETAILSCOLLECTEPFNLVIEW = AttributesEnum.DetailscollectepfnlView.index();
    public static final int DETAILSEXPORTPFNLVIEW = AttributesEnum.DetailsexportpfnlView.index();
    public static final int LETTREVOITUREPCVIEW = AttributesEnum.LettreVoiturePcView.index();
    public static final int LETTREVOITUREPCVIEW1 = AttributesEnum.LettreVoiturePcView1.index();
    public static final int LETTREVOITUREPCVIEW2 = AttributesEnum.LettreVoiturePcView2.index();
    public static final int UNITEMESUREVIEW2 = AttributesEnum.UnitemesureView2.index();
    public static final int UNITEMESUREVIEW3 = AttributesEnum.UnitemesureView3.index();
    public static final int PARTIESRECOLTEESVIEW1 = AttributesEnum.PartiesrecolteesView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PartiesProduitsPfnlViewRowImpl() {
    }

    /**
     * Gets PartiesProduitsPfnl entity object.
     * @return the PartiesProduitsPfnl
     */
    public PartiesProduitsPfnlImpl getPartiesProduitsPfnl() {
        return (PartiesProduitsPfnlImpl) getEntity(ENTITY_PARTIESPRODUITSPFNL);
    }

    /**
     * Gets the attribute value for idpartiesproduitspfnl using the alias name Idpartiesproduitspfnl.
     * @return the idpartiesproduitspfnl
     */
    public BigDecimal getIdpartiesproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIESPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idpartiesproduitspfnl using the alias name Idpartiesproduitspfnl.
     * @param value value to set the idpartiesproduitspfnl
     */
    public void setIdpartiesproduitspfnl(BigDecimal value) {
        setAttributeInternal(IDPARTIESPRODUITSPFNL, value);
    }

    /**
     * Gets the attribute value for idpartiesrecoltees using the alias name Idpartiesrecoltees.
     * @return the idpartiesrecoltees
     */
    public BigDecimal getIdpartiesrecoltees() {
        return (BigDecimal) getAttributeInternal(IDPARTIESRECOLTEES);
    }

    /**
     * Sets <code>value</code> as attribute value for idpartiesrecoltees using the alias name Idpartiesrecoltees.
     * @param value value to set the idpartiesrecoltees
     */
    public void setIdpartiesrecoltees(BigDecimal value) {
        setAttributeInternal(IDPARTIESRECOLTEES, value);
    }

    /**
     * Gets the attribute value for idproduitspfnl using the alias name Idproduitspfnl.
     * @return the idproduitspfnl
     */
    public BigDecimal getIdproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idproduitspfnl using the alias name Idproduitspfnl.
     * @param value value to set the idproduitspfnl
     */
    public void setIdproduitspfnl(BigDecimal value) {
        setAttributeInternal(IDPRODUITSPFNL, value);
    }


    /**
     * Gets the attribute value for idunitemesure using the alias name Idunitemesure.
     * @return the idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as attribute value for idunitemesure using the alias name Idunitemesure.
     * @param value value to set the idunitemesure
     */
    public void setIdunitemesure(BigDecimal value) {
        setAttributeInternal(IDUNITEMESURE, value);
    }

    /**
     * Gets the attribute value for idunitemesureexport using the alias name Idunitemesureexport.
     * @return the idunitemesureexport
     */
    public BigDecimal getIdunitemesureexport() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESUREEXPORT);
    }

    /**
     * Sets <code>value</code> as attribute value for idunitemesureexport using the alias name Idunitemesureexport.
     * @param value value to set the idunitemesureexport
     */
    public void setIdunitemesureexport(BigDecimal value) {
        setAttributeInternal(IDUNITEMESUREEXPORT, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link PartiesProduitsPfnlView.
     */
    public RowIterator getPartiesProduitsPfnlView() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link PartiesProduitsPfnlView1.
     */
    public RowIterator getPartiesProduitsPfnlView1() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNLVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ProduitsPfnlView.
     */
    public RowIterator getProduitsPfnlView() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UnitemesureView.
     */
    public RowIterator getUnitemesureView() {
        return (RowIterator) getAttributeInternal(UNITEMESUREVIEW);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link UnitemesureView1.
     */
    public ViewRowImpl getUnitemesureView1() {
        return (ViewRowImpl) getAttributeInternal(UNITEMESUREVIEW1);
    }

    /**
     * Sets the master-detail link UnitemesureView1 between this object and <code>value</code>.
     */
    public void setUnitemesureView1(ViewRowImpl value) {
        setAttributeInternal(UNITEMESUREVIEW1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailscollectepfnlView.
     */
    public RowIterator getDetailscollectepfnlView() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailsexportpfnlView.
     */
    public RowIterator getDetailsexportpfnlView() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link LettreVoiturePcView.
     */
    public RowIterator getLettreVoiturePcView() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPCVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link LettreVoiturePcView1.
     */
    public RowIterator getLettreVoiturePcView1() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPCVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link LettreVoiturePcView2.
     */
    public RowIterator getLettreVoiturePcView2() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPCVIEW2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UnitemesureView2.
     */
    public RowSet getUnitemesureView2() {
        return (RowSet) getAttributeInternal(UNITEMESUREVIEW2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UnitemesureView3.
     */
    public RowSet getUnitemesureView3() {
        return (RowSet) getAttributeInternal(UNITEMESUREVIEW3);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PartiesrecolteesView1.
     */
    public RowSet getPartiesrecolteesView1() {
        return (RowSet) getAttributeInternal(PARTIESRECOLTEESVIEW1);
    }
}

