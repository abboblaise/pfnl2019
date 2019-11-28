package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class VehiculeViewSDOImpl extends SDODataObject implements VehiculeViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 9;

   public VehiculeViewSDOImpl() {}

   public java.math.BigDecimal getIdvehicule() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdvehicule(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdtransporteur() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdtransporteur(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdregion() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdregion(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdtypevehicule() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdtypevehicule(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Integer getCodechiffre() {
      return getInt(START_PROPERTY_INDEX + 4);
   }

   public void setCodechiffre(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getSuffixLettre() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setSuffixLettre(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getImmatriculation() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setImmatriculation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getVehiculeView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setVehiculeView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getVehiculeView1() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setVehiculeView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.util.List getVehiculeView2() {
      return getList(START_PROPERTY_INDEX + 9);
   }

   public void setVehiculeView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }


}

