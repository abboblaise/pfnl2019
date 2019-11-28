package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PaysViewSDOImpl extends SDODataObject implements PaysViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public PaysViewSDOImpl() {}

   public java.math.BigDecimal getIdpays() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdpays(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNompays() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNompays(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getCodepays() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setCodepays(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

