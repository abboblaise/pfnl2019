package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PostecontroleViewSDOImpl extends SDODataObject implements PostecontroleViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public PostecontroleViewSDOImpl() {}

   public java.math.BigDecimal getIdpostecontrole() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdpostecontrole(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getCodeposte() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setCodeposte(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getIntituleposte() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setIntituleposte(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getPosteexport() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setPosteexport(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdcommune() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdcommune(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getNomcommune() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setNomcommune(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

