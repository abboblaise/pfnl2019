package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DetailpermisViewSDOImpl extends SDODataObject implements DetailpermisViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 8;

   public DetailpermisViewSDOImpl() {}

   public java.math.BigDecimal getIddetailpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIddetailpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Float getQuantite() {
      return getFloat(START_PROPERTY_INDEX + 1);
   }

   public void setQuantite(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getObservation() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setObservation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getIdpartieproduitpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setIdpartieproduitpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getDetailpermisView() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setDetailpermisView(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getDetailpermisView1() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setDetailpermisView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getDetailpermisView2() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setDetailpermisView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }


}

