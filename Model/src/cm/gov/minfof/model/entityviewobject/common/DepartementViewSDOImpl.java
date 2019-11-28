package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DepartementViewSDOImpl extends SDODataObject implements DepartementViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public DepartementViewSDOImpl() {}

   public java.math.BigDecimal getIddepartements() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIddepartements(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomdepartement() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomdepartement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getCodedepartement() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setCodedepartement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdregions() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdregions(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getNomcheflieu() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setNomcheflieu(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCodesigif() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCodesigif(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getDepartementView() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setDepartementView(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getCommuneView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setCommuneView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

