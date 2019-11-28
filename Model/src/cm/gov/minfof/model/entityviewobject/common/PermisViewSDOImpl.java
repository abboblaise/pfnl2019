package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PermisViewSDOImpl extends SDODataObject implements PermisViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 14;

   public PermisViewSDOImpl() {}

   public java.math.BigDecimal getIdpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNumeropermis() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNumeropermis(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getZonecoupe() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setZonecoupe(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Timestamp getDatedelivrance() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 3);
   }

   public void setDatedelivrance(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Date getDatefin() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 4);
   }

   public void setDatefin(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getObservation() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setObservation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdagrement() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdagrement(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdpermissionnaire() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdpermissionnaire(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.Integer getTypedocument() {
      return getInt(START_PROPERTY_INDEX + 8);
   }

   public void setTypedocument(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getCheminfichier() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setCheminfichier(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getNomfichier() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setNomfichier(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.util.List getPermisView() {
      return getList(START_PROPERTY_INDEX + 11);
   }

   public void setPermisView(java.util.List value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.util.List getPermisView1() {
      return getList(START_PROPERTY_INDEX + 12);
   }

   public void setPermisView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.util.List getDetailpermisView() {
      return getList(START_PROPERTY_INDEX + 13);
   }

   public void setDetailpermisView(java.util.List value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.util.List getCertificatorigineView() {
      return getList(START_PROPERTY_INDEX + 14);
   }

   public void setCertificatorigineView(java.util.List value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }


}

