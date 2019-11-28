package cm.gov.minfof.model.entity.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class FamillePfnlViewSDOImpl extends SDODataObject implements FamillePfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public FamillePfnlViewSDOImpl() {}

   public java.math.BigDecimal getIdfamillepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdfamillepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomfamille() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomfamille(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.util.List getPartiesProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 2);
   }

   public void setPartiesProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getPartiesProduitsPfnlView1() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setPartiesProduitsPfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.util.List getProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 4);
   }

   public void setProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

