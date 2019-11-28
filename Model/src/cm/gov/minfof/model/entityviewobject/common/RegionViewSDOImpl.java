package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class RegionViewSDOImpl extends SDODataObject implements RegionViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 8;

   public RegionViewSDOImpl() {}

   public java.math.BigDecimal getIdregions() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdregions(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomregion() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomregion(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getCoderegion() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setCoderegion(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDescriptionregions() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDescriptionregions(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getCheflieuregion() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setCheflieuregion(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.util.List getDepartementView() {
      return getList(START_PROPERTY_INDEX + 5);
   }

   public void setDepartementView(java.util.List value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getCommuneView() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setCommuneView(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getVehiculeView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setVehiculeView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getDepartementView1() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setDepartementView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }


}

