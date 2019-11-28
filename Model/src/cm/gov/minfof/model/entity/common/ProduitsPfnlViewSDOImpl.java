package cm.gov.minfof.model.entity.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class ProduitsPfnlViewSDOImpl extends SDODataObject implements ProduitsPfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public ProduitsPfnlViewSDOImpl() {}

   public java.math.BigDecimal getIdproduitspfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdproduitspfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomscientifique() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomscientifique(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getNomcommercial() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setNomcommercial(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getCodeproduit() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setCodeproduit(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdfamillepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdfamillepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDescriptionsommaire() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDescriptionsommaire(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getModeattribution() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setModeattribution(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdcategorie() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdcategorie(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.util.List getPartiesProduitsPfnlView() {
      return getList(START_PROPERTY_INDEX + 9);
   }

   public void setPartiesProduitsPfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getPartiesProduitsPfnlView1() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setPartiesProduitsPfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

