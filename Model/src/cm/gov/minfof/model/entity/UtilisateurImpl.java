package cm.gov.minfof.model.entity;

import java.io.IOException;

import java.math.BigDecimal;

import java.util.Random;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 31 09:23:02 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UtilisateurImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idutilisateur,
        Loginuser,
        Passworduser,
        Nomuser,
        Telephone,
        Niveauintervention,
        Idregions,
        Iddepartements,
        Idgroupe,
        Saisiecollecte,
        Saisieexport,
        Saisietransit,
        Emailuser,
        Premiereconnexion,
        Utilisateur,
        IdgroupeUtilisateur,
        Utilisateur1,
        IddepartementsUtilisateur,
        Utilisateur2,
        IdregionsUtilisateur,
        Groupeutilisateur,
        Groupeutilisateur1,
        Groupeutilisateur2,
        LettreVoiturePc,
        LettreVoiturePc1,
        LettreVoiturePc2,
        LettreVoiturePc3,
        LettreVoiturePc4,
        LettreVoiturePc5,
        TypeDocument,
        TypeDocument1,
        TypeDocument2;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IDUTILISATEUR = AttributesEnum.Idutilisateur.index();
    public static final int LOGINUSER = AttributesEnum.Loginuser.index();
    public static final int PASSWORDUSER = AttributesEnum.Passworduser.index();
    public static final int NOMUSER = AttributesEnum.Nomuser.index();
    public static final int TELEPHONE = AttributesEnum.Telephone.index();
    public static final int NIVEAUINTERVENTION = AttributesEnum.Niveauintervention.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int IDGROUPE = AttributesEnum.Idgroupe.index();
    public static final int SAISIECOLLECTE = AttributesEnum.Saisiecollecte.index();
    public static final int SAISIEEXPORT = AttributesEnum.Saisieexport.index();
    public static final int SAISIETRANSIT = AttributesEnum.Saisietransit.index();
    public static final int EMAILUSER = AttributesEnum.Emailuser.index();
    public static final int PREMIERECONNEXION = AttributesEnum.Premiereconnexion.index();
    public static final int UTILISATEUR = AttributesEnum.Utilisateur.index();
    public static final int IDGROUPEUTILISATEUR = AttributesEnum.IdgroupeUtilisateur.index();
    public static final int UTILISATEUR1 = AttributesEnum.Utilisateur1.index();
    public static final int IDDEPARTEMENTSUTILISATEUR = AttributesEnum.IddepartementsUtilisateur.index();
    public static final int UTILISATEUR2 = AttributesEnum.Utilisateur2.index();
    public static final int IDREGIONSUTILISATEUR = AttributesEnum.IdregionsUtilisateur.index();
    public static final int GROUPEUTILISATEUR = AttributesEnum.Groupeutilisateur.index();
    public static final int GROUPEUTILISATEUR1 = AttributesEnum.Groupeutilisateur1.index();
    public static final int GROUPEUTILISATEUR2 = AttributesEnum.Groupeutilisateur2.index();
    public static final int LETTREVOITUREPC = AttributesEnum.LettreVoiturePc.index();
    public static final int LETTREVOITUREPC1 = AttributesEnum.LettreVoiturePc1.index();
    public static final int LETTREVOITUREPC2 = AttributesEnum.LettreVoiturePc2.index();
    public static final int LETTREVOITUREPC3 = AttributesEnum.LettreVoiturePc3.index();
    public static final int LETTREVOITUREPC4 = AttributesEnum.LettreVoiturePc4.index();
    public static final int LETTREVOITUREPC5 = AttributesEnum.LettreVoiturePc5.index();
    public static final int TYPEDOCUMENT = AttributesEnum.TypeDocument.index();
    public static final int TYPEDOCUMENT1 = AttributesEnum.TypeDocument1.index();
    public static final int TYPEDOCUMENT2 = AttributesEnum.TypeDocument2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UtilisateurImpl() {
        /*setAttributeInternal(SAISIECOLLECTE, 0);
        setAttributeInternal(SAISIEEXPORT, 0);
        setAttributeInternal(SAISIETRANSIT, 0);*/
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Utilisateur");
    }


    /**
     * Gets the attribute value for Idutilisateur, using the alias name Idutilisateur.
     * @return the value of Idutilisateur
     */
    public BigDecimal getIdutilisateur() {
        return (BigDecimal) getAttributeInternal(IDUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idutilisateur.
     * @param value value to set the Idutilisateur
     */
    public void setIdutilisateur(BigDecimal value) {
        setAttributeInternal(IDUTILISATEUR, value);
    }

    /**
     * Gets the attribute value for Loginuser, using the alias name Loginuser.
     * @return the value of Loginuser
     */
    public String getLoginuser() {
        return (String) getAttributeInternal(LOGINUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Loginuser.
     * @param value value to set the Loginuser
     */
    public void setLoginuser(String value) {
        setAttributeInternal(LOGINUSER, value);
    }

    /**
     * Gets the attribute value for Passworduser, using the alias name Passworduser.
     * @return the value of Passworduser
     */
    public String getPassworduser() throws IOException {
        String str = (String)getAttributeInternal(PASSWORDUSER);
        CrypteDecrypte cd = new CrypteDecrypte();
        
        return cd.codedecode(str, 2);

        //return (String) getAttributeInternal(PASSWORDUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Passworduser.
     * @param value value to set the Passworduser
     */
    public void setPassworduser(String value) throws IOException {
        
        CrypteDecrypte cd = new CrypteDecrypte();
        String str = cd.codedecode(value, 1);
        
        setAttributeInternal(PASSWORDUSER, str);
    }

    /**
     * Gets the attribute value for Nomuser, using the alias name Nomuser.
     * @return the value of Nomuser
     */
    public String getNomuser() {
        return (String) getAttributeInternal(NOMUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomuser.
     * @param value value to set the Nomuser
     */
    public void setNomuser(String value) {
        setAttributeInternal(NOMUSER, value);
    }

    /**
     * Gets the attribute value for Telephone, using the alias name Telephone.
     * @return the value of Telephone
     */
    public String getTelephone() {
        return (String) getAttributeInternal(TELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Telephone.
     * @param value value to set the Telephone
     */
    public void setTelephone(String value) {
        setAttributeInternal(TELEPHONE, value);
    }

    /**
     * Gets the attribute value for Niveauintervention, using the alias name Niveauintervention.
     * @return the value of Niveauintervention
     */
    public Integer getNiveauintervention() {
        return (Integer) getAttributeInternal(NIVEAUINTERVENTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Niveauintervention.
     * @param value value to set the Niveauintervention
     */
    public void setNiveauintervention(Integer value) {
        setAttributeInternal(NIVEAUINTERVENTION, value);
    }

    /**
     * Gets the attribute value for Idregions, using the alias name Idregions.
     * @return the value of Idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idregions.
     * @param value value to set the Idregions
     */
    public void setIdregions(BigDecimal value) {
        setAttributeInternal(IDREGIONS, value);
    }

    /**
     * Gets the attribute value for Iddepartements, using the alias name Iddepartements.
     * @return the value of Iddepartements
     */
    public BigDecimal getIddepartements() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddepartements.
     * @param value value to set the Iddepartements
     */
    public void setIddepartements(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENTS, value);
    }

    /**
     * Gets the attribute value for Idgroupe, using the alias name Idgroupe.
     * @return the value of Idgroupe
     */
    public BigDecimal getIdgroupe() {
        return (BigDecimal) getAttributeInternal(IDGROUPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idgroupe.
     * @param value value to set the Idgroupe
     */
    public void setIdgroupe(BigDecimal value) {
        setAttributeInternal(IDGROUPE, value);
    }


    /**
     * Gets the attribute value for Saisiecollecte, using the alias name Saisiecollecte.
     * @return the value of Saisiecollecte
     */
    public Boolean getSaisiecollecte() {
        return (Boolean) getAttributeInternal(SAISIECOLLECTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Saisiecollecte.
     * @param value value to set the Saisiecollecte
     */
    public void setSaisiecollecte(Boolean value) {
        setAttributeInternal(SAISIECOLLECTE, value);
    }

    /**
     * Gets the attribute value for Saisieexport, using the alias name Saisieexport.
     * @return the value of Saisieexport
     */
    public Boolean getSaisieexport() {
        return (Boolean) getAttributeInternal(SAISIEEXPORT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Saisieexport.
     * @param value value to set the Saisieexport
     */
    public void setSaisieexport(Boolean value) {
        setAttributeInternal(SAISIEEXPORT, value);
    }

    /**
     * Gets the attribute value for Saisietransit, using the alias name Saisietransit.
     * @return the value of Saisietransit
     */
    public Boolean getSaisietransit() {
        return (Boolean) getAttributeInternal(SAISIETRANSIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Saisietransit.
     * @param value value to set the Saisietransit
     */
    public void setSaisietransit(Boolean value) {
        setAttributeInternal(SAISIETRANSIT, value);
    }

    /**
     * Gets the attribute value for Emailuser, using the alias name Emailuser.
     * @return the value of Emailuser
     */
    public String getEmailuser() {
        return (String) getAttributeInternal(EMAILUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Emailuser.
     * @param value value to set the Emailuser
     */
    public void setEmailuser(String value) {
        setAttributeInternal(EMAILUSER, value);
    }

    /**
     * Gets the attribute value for Premiereconnexion, using the alias name Premiereconnexion.
     * @return the value of Premiereconnexion
     */
    public Boolean getPremiereconnexion() {
        return (Boolean) getAttributeInternal(PREMIERECONNEXION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Premiereconnexion.
     * @param value value to set the Premiereconnexion
     */
    public void setPremiereconnexion(Boolean value) {
        setAttributeInternal(PREMIERECONNEXION, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUtilisateur() {
        return (RowIterator) getAttributeInternal(UTILISATEUR);
    }

    /**
     * @return the associated entity UtilisateurImpl.
     */
    public UtilisateurImpl getIdgroupeUtilisateur() {
        return (UtilisateurImpl) getAttributeInternal(IDGROUPEUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the associated entity UtilisateurImpl.
     */
    public void setIdgroupeUtilisateur(UtilisateurImpl value) {
        setAttributeInternal(IDGROUPEUTILISATEUR, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUtilisateur1() {
        return (RowIterator) getAttributeInternal(UTILISATEUR1);
    }

    /**
     * @return the associated entity UtilisateurImpl.
     */
    public UtilisateurImpl getIddepartementsUtilisateur() {
        return (UtilisateurImpl) getAttributeInternal(IDDEPARTEMENTSUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the associated entity UtilisateurImpl.
     */
    public void setIddepartementsUtilisateur(UtilisateurImpl value) {
        setAttributeInternal(IDDEPARTEMENTSUTILISATEUR, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUtilisateur2() {
        return (RowIterator) getAttributeInternal(UTILISATEUR2);
    }

    /**
     * @return the associated entity UtilisateurImpl.
     */
    public UtilisateurImpl getIdregionsUtilisateur() {
        return (UtilisateurImpl) getAttributeInternal(IDREGIONSUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the associated entity UtilisateurImpl.
     */
    public void setIdregionsUtilisateur(UtilisateurImpl value) {
        setAttributeInternal(IDREGIONSUTILISATEUR, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getGroupeutilisateur() {
        return (EntityImpl) getAttributeInternal(GROUPEUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setGroupeutilisateur(EntityImpl value) {
        setAttributeInternal(GROUPEUTILISATEUR, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getGroupeutilisateur1() {
        return (EntityImpl) getAttributeInternal(GROUPEUTILISATEUR1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setGroupeutilisateur1(EntityImpl value) {
        setAttributeInternal(GROUPEUTILISATEUR1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getGroupeutilisateur2() {
        return (EntityImpl) getAttributeInternal(GROUPEUTILISATEUR2);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setGroupeutilisateur2(EntityImpl value) {
        setAttributeInternal(GROUPEUTILISATEUR2, value);
    }


    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc1() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC1);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc1(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC1, value);
    }

    /**
     * @return the associated entity LettreVoiturePcImpl.
     */
    public LettreVoiturePcImpl getLettreVoiturePc2() {
        return (LettreVoiturePcImpl) getAttributeInternal(LETTREVOITUREPC2);
    }

    /**
     * Sets <code>value</code> as the associated entity LettreVoiturePcImpl.
     */
    public void setLettreVoiturePc2(LettreVoiturePcImpl value) {
        setAttributeInternal(LETTREVOITUREPC2, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc3() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC3);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc4() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC4);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLettreVoiturePc5() {
        return (RowIterator) getAttributeInternal(LETTREVOITUREPC5);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument1() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument1(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTypeDocument2() {
        return (EntityImpl) getAttributeInternal(TYPEDOCUMENT2);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTypeDocument2(EntityImpl value) {
        setAttributeInternal(TYPEDOCUMENT2, value);
    }

    /**
     * @param idutilisateur key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idutilisateur) {
        return new Key(new Object[] { idutilisateur });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT) {
            //System.out.println("actif = " + getActif());
            BigDecimal id = getLastId("getLastIdUtilisateur1");
            setIdutilisateur(id);
            setPremiereconnexion(true);
            String pswd=generateRandomChars();
            try {
                setPassworduser(pswd);
            } catch (IOException f) {
            }
        }
        
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName) {
        //System.out.println("entree dans getLastId");
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
            System.out.println("last Id = " + lastId);
            vo.closeRowSet();
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
    
    public static String generateRandomChars() {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"; 
        int length = 12;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }

        return sb.toString();
    }
}

