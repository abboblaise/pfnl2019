package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class ExportpfnlViewSDOImpl extends SDODataObject implements ExportpfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 15;

   public ExportpfnlViewSDOImpl() {}

   public java.math.BigDecimal getIdexportpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdexportpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdpermissionnaire() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdpermissionnaire(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getNumeroexport() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setNumeroexport(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getNumeroco() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setNumeroco(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getDateexport() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setDateexport(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdposteexport() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdposteexport(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdpermis1() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdpermis1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getNomouraisonsociale() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setNomouraisonsociale(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getNumeropermis() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setNumeropermis(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getNompostecontrole() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setNompostecontrole(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.util.List getExportpfnlView() {
      return getList(START_PROPERTY_INDEX + 11);
   }

   public void setExportpfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.util.List getExportpfnlView1() {
      return getList(START_PROPERTY_INDEX + 12);
   }

   public void setExportpfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.util.List getDetailsexportpfnlView() {
      return getList(START_PROPERTY_INDEX + 13);
   }

   public void setDetailsexportpfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.PermisViewSDO getPermisView() {
      return (cm.gov.minfof.model.entityviewobject.common.PermisViewSDO)get(START_PROPERTY_INDEX + 14);
   }

   public void setPermisView(cm.gov.minfof.model.entityviewobject.common.PermisViewSDO value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO getPermissionnairespnflView() {
      return (cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO)get(START_PROPERTY_INDEX + 15);
   }

   public void setPermissionnairespnflView(cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }


}

