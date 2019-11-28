package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DetailscollectepfnlViewSDOImpl extends SDODataObject implements DetailscollectepfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 24;

   public DetailscollectepfnlViewSDOImpl() {}

   public java.math.BigDecimal getIddetailscollectepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIddetailscollectepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdpermissionnaire() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdpermissionnaire(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdorigine() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdorigine(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Float getQuantite() {
      return getFloat(START_PROPERTY_INDEX + 3);
   }

   public void setQuantite(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getIddestination() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setIddestination(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdpartieproduitpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdpartieproduitpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdcollectepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdcollectepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getIdprovenance() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setIdprovenance(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getNomacteur() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setNomacteur(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.Integer getTypeacteur() {
      return getInt(START_PROPERTY_INDEX + 10);
   }

   public void setTypeacteur(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getIddepartemental() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setIddepartemental(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.math.BigDecimal getIdregonal() {
      return getBigDecimal(START_PROPERTY_INDEX + 12);
   }

   public void setIdregonal(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.math.BigDecimal getIdprovenance1() {
      return getBigDecimal(START_PROPERTY_INDEX + 13);
   }

   public void setIdprovenance1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getNomprovenance() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setNomprovenance(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.util.List getDetailscollectepfnlView1() {
      return getList(START_PROPERTY_INDEX + 15);
   }

   public void setDetailscollectepfnlView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.util.List getDetailscollectepfnlView3() {
      return getList(START_PROPERTY_INDEX + 16);
   }

   public void setDetailscollectepfnlView3(java.util.List value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.util.List getDetailscollectepfnlView4() {
      return getList(START_PROPERTY_INDEX + 17);
   }

   public void setDetailscollectepfnlView4(java.util.List value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.util.List getDetailscollectepfnlView5() {
      return getList(START_PROPERTY_INDEX + 18);
   }

   public void setDetailscollectepfnlView5(java.util.List value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.util.List getDetailscollectepfnlView6() {
      return getList(START_PROPERTY_INDEX + 19);
   }

   public void setDetailscollectepfnlView6(java.util.List value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO getPermissionnairespnflView() {
      return (cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO)get(START_PROPERTY_INDEX + 20);
   }

   public void setPermissionnairespnflView(cm.gov.minfof.model.entityviewobject.common.PermissionnairespnflViewSDO value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO getPartiesProduitsPfnlView() {
      return (cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO)get(START_PROPERTY_INDEX + 21);
   }

   public void setPartiesProduitsPfnlView(cm.gov.minfof.model.entity.common.PartiesProduitsPfnlViewSDO value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO getUnitemesureView() {
      return (cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO)get(START_PROPERTY_INDEX + 22);
   }

   public void setUnitemesureView(cm.gov.minfof.model.entityviewobject.common.UnitemesureViewSDO value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.OriginespnflsViewSDO getOriginespnflsView() {
      return (cm.gov.minfof.model.entityviewobject.common.OriginespnflsViewSDO)get(START_PROPERTY_INDEX + 23);
   }

   public void setOriginespnflsView(cm.gov.minfof.model.entityviewobject.common.OriginespnflsViewSDO value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }

   public cm.gov.minfof.model.entityviewobject.common.DepartementViewSDO getDepartementView() {
      return (cm.gov.minfof.model.entityviewobject.common.DepartementViewSDO)get(START_PROPERTY_INDEX + 24);
   }

   public void setDepartementView(cm.gov.minfof.model.entityviewobject.common.DepartementViewSDO value) {
      set(START_PROPERTY_INDEX + 24 , value);
   }


}

