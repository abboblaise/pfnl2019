package cm.gov.minfof.model.queryviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class RegionsViewSDOImpl extends SDODataObject implements RegionsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public RegionsViewSDOImpl() {}

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

   public java.util.List getCommunesView() {
      return getList(START_PROPERTY_INDEX + 5);
   }

   public void setCommunesView(java.util.List value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

