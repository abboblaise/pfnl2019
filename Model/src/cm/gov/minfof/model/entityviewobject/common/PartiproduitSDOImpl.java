package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PartiproduitSDOImpl extends SDODataObject implements PartiproduitSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public PartiproduitSDOImpl() {}

   public java.math.BigDecimal getIdpartiesproduitspfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdpartiesproduitspfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdpartiesrecoltees() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdpartiesrecoltees(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdproduitspfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdproduitspfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdunitemesureexport() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdunitemesureexport(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

