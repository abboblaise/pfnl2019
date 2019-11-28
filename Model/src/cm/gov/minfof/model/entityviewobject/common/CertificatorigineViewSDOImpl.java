package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CertificatorigineViewSDOImpl extends SDODataObject implements CertificatorigineViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public CertificatorigineViewSDOImpl() {}

   public java.math.BigDecimal getIdcertificatorigine() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcertificatorigine(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Float getQuantite() {
      return getFloat(START_PROPERTY_INDEX + 1);
   }

   public void setQuantite(java.lang.Float value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIdpartieproduitpfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIdpartieproduitpfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIdunitemesure() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIdunitemesure(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getNumeroco() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setNumeroco(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDestinataire() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDestinataire(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.math.BigDecimal getIdpays() {
      return getBigDecimal(START_PROPERTY_INDEX + 7);
   }

   public void setIdpays(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getCertificatorigineView() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setCertificatorigineView(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.util.List getCertificatorigineView1() {
      return getList(START_PROPERTY_INDEX + 9);
   }

   public void setCertificatorigineView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getCertificatorigineView2() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setCertificatorigineView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

