package cm.gov.minfof.model.entityviewobject;


import java.math.BigDecimal;

import java.sql.ResultSet;

import oracle.jbo.Row;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 21 16:08:10 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CollectepfnlViewImpl extends VueImplementation {
    /**
     * This is the default constructor (do not remove).
     */
    public CollectepfnlViewImpl() {
    }


    /**
     * executeQueryForCollection - for custom java data source support.
     */
    @Override
    protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
        super.executeQueryForCollection(qc, params, noUserParams);
    }

    /**
     * hasNextForCollection - for custom java data source support.
     */
    @Override
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - for custom java data source support.
     */
    @Override
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**
     * getQueryHitCount - for custom java data source support.
     */
    @Override
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }

    /**
     * getCappedQueryHitCount - for custom java data source support.
     */
    @Override
    public long getCappedQueryHitCount(ViewRowSetImpl viewRowSet, Row[] masterRows, long oldCap, long cap) {
        long value = super.getCappedQueryHitCount(viewRowSet, masterRows, oldCap, cap);
        return value;
    }


    /**
     * Returns the variable value for dateFin.
     * @return variable value for dateFin
     */
    public java.sql.Timestamp getdateFin() {
        return (java.sql.Timestamp) ensureVariableManager().getVariableValue("dateFin");
    }

    /**
     * Sets <code>value</code> for variable dateFin.
     * @param value value to bind as dateFin
     */
    public void setdateFin(java.sql.Timestamp value) {
        ensureVariableManager().setVariableValue("dateFin", value);
    }

    /**
     * Returns the variable value for dateDebut.
     * @return variable value for dateDebut
     */
    public java.sql.Timestamp getdateDebut() {
        return (java.sql.Timestamp) ensureVariableManager().getVariableValue("dateDebut");
    }

    /**
     * Sets <code>value</code> for variable dateDebut.
     * @param value value to bind as dateDebut
     */
    public void setdateDebut(java.sql.Timestamp value) {
        ensureVariableManager().setVariableValue("dateDebut", value);
    }

    /**
     * Returns the variable value for idRegionFiltre.
     * @return variable value for idRegionFiltre
     */
    public BigDecimal getidRegionFiltre() {
        return (BigDecimal) ensureVariableManager().getVariableValue("idRegionFiltre");
    }

    /**
     * Sets <code>value</code> for variable idRegionFiltre.
     * @param value value to bind as idRegionFiltre
     */
    public void setidRegionFiltre(BigDecimal value) {
        ensureVariableManager().setVariableValue("idRegionFiltre", value);
    }

    /**
     * Returns the variable value for idDepartementFiltre.
     * @return variable value for idDepartementFiltre
     */
    public BigDecimal getidDepartementFiltre() {
        return (BigDecimal) ensureVariableManager().getVariableValue("idDepartementFiltre");
    }

    /**
     * Sets <code>value</code> for variable idDepartementFiltre.
     * @param value value to bind as idDepartementFiltre
     */
    public void setidDepartementFiltre(BigDecimal value) {
        ensureVariableManager().setVariableValue("idDepartementFiltre", value);
    }

    /**
     * Returns the variable value for idRegionBind.
     * @return variable value for idRegionBind
     */
    public BigDecimal getidRegionBind() {
        return (BigDecimal) ensureVariableManager().getVariableValue("idRegionBind");
    }

    /**
     * Sets <code>value</code> for variable idRegionBind.
     * @param value value to bind as idRegionBind
     */
    public void setidRegionBind(BigDecimal value) {
        ensureVariableManager().setVariableValue("idRegionBind", value);
    }

    /**
     * Returns the variable value for idDepartementBind.
     * @return variable value for idDepartementBind
     */
    public BigDecimal getidDepartementBind() {
        return (BigDecimal) ensureVariableManager().getVariableValue("idDepartementBind");
    }

    /**
     * Sets <code>value</code> for variable idDepartementBind.
     * @param value value to bind as idDepartementBind
     */
    public void setidDepartementBind(BigDecimal value) {
        ensureVariableManager().setVariableValue("idDepartementBind", value);
    }
}

