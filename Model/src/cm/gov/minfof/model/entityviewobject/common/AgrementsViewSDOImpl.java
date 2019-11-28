package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class AgrementsViewSDOImpl extends SDODataObject implements AgrementsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public AgrementsViewSDOImpl() {}

   public java.math.BigDecimal getIdagrements() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdagrements(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Date getDatedebut() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 1);
   }

   public void setDatedebut(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Date getDatefin() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 2);
   }

   public void setDatefin(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getNumagreement() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setNumagreement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getDescriptioncontenuagreements() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setDescriptioncontenuagreements(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getNomdetenteur() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setNomdetenteur(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

