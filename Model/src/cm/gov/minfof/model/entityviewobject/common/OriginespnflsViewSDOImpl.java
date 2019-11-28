package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OriginespnflsViewSDOImpl extends SDODataObject implements OriginespnflsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public OriginespnflsViewSDOImpl() {}

   public java.math.BigDecimal getIdoriginespnfls() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdoriginespnfls(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomsource() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomsource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.Integer getOriginepnfl() {
      return getInt(START_PROPERTY_INDEX + 2);
   }

   public void setOriginepnfl(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

