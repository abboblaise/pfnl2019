package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class PermissionnairespnflViewSDOImpl extends SDODataObject implements PermissionnairespnflViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 19;

   public PermissionnairespnflViewSDOImpl() {}

   public java.lang.String getNomouraisonsociale() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setNomouraisonsociale(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Integer getStatut() {
      return getInt(START_PROPERTY_INDEX + 1);
   }

   public void setStatut(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getSiegesocial() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setSiegesocial(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getNbreemploye() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setNbreemploye(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getContact() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setContact(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getMail() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setMail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getCodepnfl() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setCodepnfl(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getNatureactivite() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setNatureactivite(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getNumceqe() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setNumceqe(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.math.BigDecimal getIdpermissionnairespnfl() {
      return getBigDecimal(START_PROPERTY_INDEX + 9);
   }

   public void setIdpermissionnairespnfl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getNui() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setNui(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getProfession() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setProfession(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.Integer getTypepersonne() {
      return getInt(START_PROPERTY_INDEX + 12);
   }

   public void setTypepersonne(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getAdressep() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setAdressep(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.Integer getSexe() {
      return getInt(START_PROPERTY_INDEX + 14);
   }

   public void setSexe(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.math.BigDecimal getIdcommune() {
      return getBigDecimal(START_PROPERTY_INDEX + 15);
   }

   public void setIdcommune(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getNomcommune() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setNomcommune(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.math.BigDecimal getIdregional() {
      return getBigDecimal(START_PROPERTY_INDEX + 17);
   }

   public void setIdregional(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.math.BigDecimal getIddepartemental() {
      return getBigDecimal(START_PROPERTY_INDEX + 18);
   }

   public void setIddepartemental(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.util.List getPermisView() {
      return getList(START_PROPERTY_INDEX + 19);
   }

   public void setPermisView(java.util.List value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }


}

