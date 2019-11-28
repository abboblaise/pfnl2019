package cm.gov.minfof.model.entity.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PartiesProduitsPfnlViewSDOImpl extends SDODataObject implements PartiesProduitsPfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 9;

   public PartiesProduitsPfnlViewSDOImpl() {}

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

   public java.util.List getPartiesProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 5);
   }

   public void setPartiesProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getPartiesProduitsPfnlView1() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setPartiesProduitsPfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO getUnitemesureView1() {
      return (cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO)get(START_PROPERTY_INDEX + 8);
   }

   public void setUnitemesureView1(cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.util.List getUnitemesureView() {
      return getList(START_PROPERTY_INDEX + 9);
   }

   public void setUnitemesureView(java.util.List value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }


}

