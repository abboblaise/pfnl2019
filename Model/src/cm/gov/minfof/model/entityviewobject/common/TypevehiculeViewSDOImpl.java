package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class TypevehiculeViewSDOImpl extends SDODataObject implements TypevehiculeViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public TypevehiculeViewSDOImpl() {}

   public java.math.BigDecimal getIdtypevehicule() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdtypevehicule(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getCodevehicule() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setCodevehicule(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLibelletype() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLibelletype(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getVehiculeView() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setVehiculeView(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

