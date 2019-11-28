package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CategorieproduitViewSDOImpl extends SDODataObject implements CategorieproduitViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public CategorieproduitViewSDOImpl() {}

   public java.math.BigDecimal getIdcategorieproduit() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcategorieproduit(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLibellecategorie() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLibellecategorie(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getCodecategorie() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setCodecategorie(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getObservation() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setObservation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Boolean isQuotas() {
      return getBoolean(START_PROPERTY_INDEX + 4);
   }

   public void setQuotas(java.lang.Boolean value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.Boolean isQuotasTransient() {
      return getBoolean(START_PROPERTY_INDEX + 5);
   }

   public void setQuotasTransient(java.lang.Boolean value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

