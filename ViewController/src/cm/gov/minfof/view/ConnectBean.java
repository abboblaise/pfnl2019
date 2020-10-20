package cm.gov.minfof.view;


import com.sun.mail.util.MailSSLSocketFactory;

import java.math.BigDecimal;

import java.security.GeneralSecurityException;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;

import org.apache.commons.validator.routines.EmailValidator;

public class ConnectBean {
    private boolean editpwd;
    ShowJqNotification notifObj = new ShowJqNotification();

    public void setEditpwd(boolean editpwd) {
        this.editpwd = editpwd;
    }

    public boolean isEditpwd() {
        return editpwd;
    }

    public ConnectBean() {
        editpwd = false;
    }
    
    private UIComponent findComponent(UIComponent base, String id) {

            if (id.equals(base.getId())) {
                return base;
            }
            UIComponent children = null;
            UIComponent result = null;
            Iterator childrens = base.getFacetsAndChildren();
            while (childrens.hasNext() && (result == null)) {
                children = (UIComponent) childrens.next();
                if (id.equals(children.getId())) {
                    result = children;
                    break;
                }
                result = findComponent(children, id);
                if (result != null) {
                    break;
                }
            }
            return result;
        }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public BindingContainer getBindingContainer() {
    BindingContext bindingContext = BindingContext.getCurrent();
    return bindingContext.getCurrentBindingsEntry();
    }
    
    public Object executemethode(String mthod){
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }
    

    public void ValideMotdepasse(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        String fieldVal = (String)object;
        //System.out.println("Confirm = "+fieldVal);
        RichSelectBooleanCheckbox cb = (RichSelectBooleanCheckbox)uIComponent.findComponent("sbc1");
        boolean bb = (Boolean)cb.getValue();
        
        if (bb){
            RichInputText it = (RichInputText)uIComponent.findComponent("it2");
            String password1 = (String)it.getValue();
            //System.out.println("pwd = "+password1);
            if(!password1.equalsIgnoreCase(fieldVal)){
                FacesMessage message = new FacesMessage("Les deux mots de passe doivent être identiques");
                throw new ValidatorException(message);
            }
        }
    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    public static Object getExpressionValue(String expression) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);
        Class bindClass = valueExp.getType(elContext);
        return valueExp.getValue(elContext);
    }

    public static void setExpressionValue(String expression, Object newValue) {
        FacesContext facesContext = getFacesContext();
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, expression, Object.class);

        //Check that the input newValue can be cast to the property type
        //expected by the managed bean.
        //If the managed Bean expects a primitive we rely on Auto-Unboxing
        Class bindClass = valueExp.getType(elContext);
        if (bindClass.isPrimitive() || bindClass.isInstance(newValue)) {
            valueExp.setValue(elContext, newValue);
        }
    }

    @SuppressWarnings("oracle.jdeveloper.java.insufficient-catch-block")
    public String EnregistrerUtilisateur() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        
        ADFContext adfCtx = ADFContext.getCurrent();
        Map appScope = adfCtx.getApplicationScope();
        BigDecimal lastId = new BigDecimal(0);

        Object idEnCours = getExpressionValue("#{bindings.Idutilisateur.inputValue}");

        BigDecimal v = new BigDecimal(5);
        if (idEnCours instanceof BigDecimal)
            v = (BigDecimal) idEnCours;


        /********** FIN ENREGISTREMENT DU DETAIL **********/

        if (idEnCours == null || v.toString().equals("-1")) {
            Object dernierId = appScope.get("idutilisateurbean");
            if (dernierId == null) {
                //Je vais mettre à jour la liste qui compte les id
                DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("getLastIdUtilisateur1Iterator");
                ViewObjectImpl vo = (ViewObjectImpl) iterIB.getViewObject();
                vo.executeQuery();

                lastId = new BigDecimal(0);
                if (vo.hasNext()) {
                    Row r = vo.next();
                    lastId = (BigDecimal) r.getAttribute(0);

                    BigDecimal un = new BigDecimal(1);
                    lastId = lastId.add(un);
                    appScope.put("idutilisateurbean", lastId);
                }
            } else {
                BigDecimal un = new BigDecimal(1);
                lastId = (BigDecimal) dernierId;
                lastId = lastId.add(un);
                appScope.put("idutilisateurbean", lastId);
            }

            setExpressionValue("#{bindings.Idutilisateur.inputValue}", lastId);
        }
        
        operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        
        DCIteratorBinding empIter = (DCIteratorBinding) getBindings().get("UtilisateurView1Iterator");
        String pswd = empIter.getCurrentRow()
                                   .getAttribute("Passworduser")
                                   .toString();
        String email = empIter.getCurrentRow()
                                   .getAttribute("Emailuser")
                                   .toString();
        String login = empIter.getCurrentRow()
                                   .getAttribute("Loginuser")
                                   .toString();
        Boolean bb = (Boolean)empIter.getCurrentRow()
                                   .getAttribute("Premiereconnexion");
        
        if (bb){ 
            FacesContext ctx = FacesContext.getCurrentInstance();
            try {
                String sms ="Paramètres de connexion PFNL : \n Login : "+login
                    +"\n Mot de passe : "+pswd+"\n Veuillez chnager ce mot de passe lors de votre première connexion. \n"
                    +"PS : Ne pas écrire à cette adresse";
                String rst = sendEmail(sms, "Paramètres de compte PFNL", email, "infopfnl2016@gmail.com");
                FacesMessage msg1 =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Message Envoyé",rst);
                ctx.addMessage("",msg1);
            } catch (Exception e) {
                String mm = e.toString();
                FacesMessage msg1 =
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Message Envoyé",mm);
                ctx.addMessage("",msg1);
                
            }
        }
        
        String nomPays = notifObj.getValueOfField("UtilisateurView1Iterator", "Nomuser");
        notifObj.showNoticeMessageAction("Enregistrement effectué! L'utilisateur <b>"+ nomPays +" </b>a été enregistré avec succès");
        annulerUtilisateur();
        
        return null;
    }

    public String CreerUtilisateur() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String SupprimerUtilisateur() {
        String nomPays = notifObj.getValueOfField("UtilisateurView1Iterator", "Nomuser");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        
        notifObj.showNoticeMessageAction("Suppression effectuée! L'utilisateur <b>"+ nomPays +" </b>a été supprimer avec succès");
        return null;
    }
    
    
    
    /**
      * De limit the toEmail List
      * Authenticate
      * @param msg
      * @param subject
      * @param toEmail
      * @param fromEmail
      * @return
      * @throws Exception
      */
     public static String sendEmail(String msg, String subject, String toEmail, String fromEmail)
       throws Exception
     {
       String toEmails[] = toEmail.split(",");
       System.out.println("TO:::FROM:::SUBJ:::BODY:::" + toEmail + "-" + fromEmail + "-" + subject + "-" + msg);

       Session session = setSessionAuthentication();
       InternetAddress from = new InternetAddress(fromEmail);
       InternetAddress to[] = new InternetAddress[toEmails.length];
       for (int c = 0; c < toEmails.length; c++)
       {
         to[c] = new InternetAddress(toEmails[c]);
       }
       MimeMessage message = new MimeMessage(session);
       message.setFrom(from);
       message.addRecipients(Message.RecipientType.TO, to);
       message.setSubject(subject);
       message.setText(msg);
       Transport.send(message);
       // msg="OK Msg Posted Successfully";
       return "Message envoyé avec succès";
     }

     /**
      *
      * @return
      * @throws Exception
      */
     public static Session setSessionAuthentication()
       throws Exception
     {
       final String username = "minfofpfnl@gmail.com";
       final String password = "SYSADMIN@2019";
       //Using SSL
       //Properties props = new Properties();
       //props.put("mail.smtp.host", "smtp.gmail.com");
       //props.put("mail.smtp.socketFactory.port", "465");
       //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       //props.put("mail.smtp.auth", "true");
       //props.put("mail.smtp.port", "587");
       // USING TLS
               Properties props = new Properties();
               props.put("mail.smtp.auth", "true");
               props.put("mail.smtp.starttls.enable", "true");
               props.put("mail.smtp.host", "smtp.gmail.com");
               props.put("mail.smtp.port", "587");
       props.put("mail.debug", "true");
       MailSSLSocketFactory sf = null;
       try
       {
         sf = new MailSSLSocketFactory();
       }
       catch (GeneralSecurityException e1)
       {
         e1.printStackTrace();
       }
       sf.setTrustAllHosts(true);
       props.put("mail.smtp.ssl.socketFactory", sf);
       Session session = Session.getInstance(props, new javax.mail.Authenticator()
         {
           protected PasswordAuthentication getPasswordAuthentication()
           {
             return new PasswordAuthentication(username, password);
           }
         });
       return session;
     }

    public void Valideemail(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        String lemail = (String)object;
        EmailValidator emailValidator = EmailValidator.getInstance();
        if(!emailValidator.isValid(lemail)){
            FacesMessage message = new FacesMessage("l'adresse email n'est pas au format valide");
            throw new ValidatorException(message);
        }

    }

    public String annulerUtilisateur() {
        notifObj.annulerParent("UtilisateurView1Iterator");
        return null;
    }

    public void OndeleteUser(DialogEvent dialogEvent) {
        // Add event code here...
        SupprimerUtilisateur();
    }
}
