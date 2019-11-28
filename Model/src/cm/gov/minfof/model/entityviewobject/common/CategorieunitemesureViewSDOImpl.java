package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CategorieunitemesureViewSDOImpl extends SDODataObject implements CategorieunitemesureViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public CategorieunitemesureViewSDOImpl() {}

   public java.math.BigDecimal getIdcategorieunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcategorieunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getLibellecategorie() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setLibellecategorie(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.util.List getUnitemesureView() {
      return getList(START_PROPERTY_INDEX + 2);
   }

   public void setUnitemesureView(java.util.List value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

