package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class TransporteurViewSDOImpl extends SDODataObject implements TransporteurViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public TransporteurViewSDOImpl() {}

   public java.math.BigDecimal getIdtransporteur() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdtransporteur(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNui() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNui(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getNom() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setNom(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getAdresse() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setAdresse(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getTelephone() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setTelephone(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.util.List getVehiculeView() {
      return getList(START_PROPERTY_INDEX + 5);
   }

   public void setVehiculeView(java.util.List value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

