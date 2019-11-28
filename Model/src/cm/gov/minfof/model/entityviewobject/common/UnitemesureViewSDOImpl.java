package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class UnitemesureViewSDOImpl extends SDODataObject implements UnitemesureViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public UnitemesureViewSDOImpl() {}

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLibelleunitemesure() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLibelleunitemesure(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdcategorie() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdcategorie(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getOrdregrandeur() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setOrdregrandeur(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Float getRatio() {
      return getFloat(START_PROPERTY_INDEX + 4);
   }

   public void setRatio(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.Integer getActif() {
      return getInt(START_PROPERTY_INDEX + 5);
   }

   public void setActif(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.Float getArrondi() {
      return getFloat(START_PROPERTY_INDEX + 6);
   }

   public void setArrondi(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getUnitemesureView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setUnitemesureView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

