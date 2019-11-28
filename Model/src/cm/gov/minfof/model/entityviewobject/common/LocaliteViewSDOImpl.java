package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class LocaliteViewSDOImpl extends SDODataObject implements LocaliteViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public LocaliteViewSDOImpl() {}

   public java.math.BigDecimal getIdlocalite() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdlocalite(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomlocalite() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomlocalite(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdcommune() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdcommune(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getLocaliteView() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setLocaliteView(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

