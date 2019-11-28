package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CollectepfnlViewSDOImpl extends SDODataObject implements CollectepfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 18;

   public CollectepfnlViewSDOImpl() {}

   public java.math.BigDecimal getIdcollectepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcollectepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Timestamp getDatecollecte() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 1);
   }

   public void setDatecollecte(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIddepartement() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIddepartement(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdlocalite() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdlocalite(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdposte() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdposte(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getIdutilisateur() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setIdutilisateur(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIddepartmental() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIddepartmental(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdregional() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdregional(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getIddepartement1() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setIddepartement1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.math.BigDecimal getIdlocalite1() {
      return getBigDecimal(START_PROPERTY_INDEX + 9);
   }

   public void setIdlocalite1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getIdposte1() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setIdposte1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getIdusr() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setIdusr(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getNomdepartement() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setNomdepartement(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getNomlocalite() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setNomlocalite(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getNomposte() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setNomposte(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.math.BigDecimal getIdutilisateur1() {
      return getBigDecimal(START_PROPERTY_INDEX + 15);
   }

   public void setIdutilisateur1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getNomuser() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setNomuser(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.util.List getCollectepfnlView() {
      return getList(START_PROPERTY_INDEX + 17);
   }

   public void setCollectepfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.util.List getDetailscollectepfnlView() {
      return getList(START_PROPERTY_INDEX + 18);
   }

   public void setDetailscollectepfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }


}

