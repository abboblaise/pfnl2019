package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DetailsexportpfnlViewSDOImpl extends SDODataObject implements DetailsexportpfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 14;

   public DetailsexportpfnlViewSDOImpl() {}

   public java.math.BigDecimal getIddetailsexportpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIddetailsexportpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdexportpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdexportpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Float getQuantite() {
      return getFloat(START_PROPERTY_INDEX + 3);
   }

   public void setQuantite(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getObservations() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setObservations(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getIdpartieproduitpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setIdpartieproduitpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdcertificat() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdcertificat(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdpays() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdpays(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getIdcertificat1() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setIdcertificat1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getNumeroco() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setNumeroco(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getDetailsexportpfnlView() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setDetailsexportpfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.util.List getDetailsexportpfnlView1() {
      return getList(START_PROPERTY_INDEX + 11);
   }

   public void setDetailsexportpfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.util.List getDetailsexportpfnlView2() {
      return getList(START_PROPERTY_INDEX + 12);
   }

   public void setDetailsexportpfnlView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO getPartiesProduitsPfnlView() {
      return (cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO)get(START_PROPERTY_INDEX + 13);
   }

   public void setPartiesProduitsPfnlView(cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO getUnitemesureView() {
      return (cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO)get(START_PROPERTY_INDEX + 14);
   }

   public void setUnitemesureView(cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }


}

