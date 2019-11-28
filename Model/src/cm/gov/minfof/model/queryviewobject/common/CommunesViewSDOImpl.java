package cm.gov.minfof.model.queryviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CommunesViewSDOImpl extends SDODataObject implements CommunesViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public CommunesViewSDOImpl() {}

   public java.math.BigDecimal getIdcommunes() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcommunes(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomcommune() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomcommune(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIddepartements() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIddepartements(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getIddepartementsCommunesView() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setIddepartementsCommunesView(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

