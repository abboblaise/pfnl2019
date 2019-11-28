package cm.gov.minfof.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;

import java.util.Iterator;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class Ceqe {
    ShowJqNotification notifObj = new ShowJqNotification();
    
    public Ceqe() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public BindingContainer getBindingContainer() {
        BindingContext bindingContext = BindingContext.getCurrent();
        return bindingContext.getCurrentBindingsEntry();
    }

    public Object executemethode(String mthod) {
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String creerCeqe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregCeqe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le CEQE a été enregistré avec succès");
        return null;
    }
    
    
    /**Method to upload file to actual path on Server*/
    private String uploadFile(UploadedFile file) {
        UploadedFile myfile = file;
        String path = null;
        if (myfile == null) {
        } else {
            // All uploaded files will be stored in below path
            path = myfile.getFilename();
            int lastIndex = path.lastIndexOf(".");
            int lenght = path.length();
            System.out.println("lastIndex = " + lastIndex + " length = " + lenght);
            String nomSansExtension = path.substring(0, lastIndex);
            System.out.println("Sans extension = " + nomSansExtension);
            String numPermis = notifObj.getValueOfField("CeqeView1Iterator", "Numeroceqe");
            System.out.println("numero ceqe = " + numPermis);
            if(numPermis == null)
            {
                FacesContext fc = FacesContext.getCurrentInstance();
                UIViewRoot root = fc.getViewRoot();
                RichInputText numPermisInputText = (RichInputText) findComponent(root, "it2");
                numPermis = numPermisInputText.getValue().toString();
            }
            String vraiChaine = path.replaceFirst(nomSansExtension, numPermis);
            nomSansExtension.concat(path.substring(lastIndex));
            System.out.println("vraie chaine = " + vraiChaine);
            vraiChaine = nomSansExtension.concat(vraiChaine);
            path = vraiChaine;
            System.out.println("vraie chaine modifiee = " + vraiChaine);

            InputStream inputStream = null;
            try {
                FileOutputStream out = new FileOutputStream(path);
                inputStream = myfile.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead = 0;
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();
                File f = new File(path);
                System.out.println("chemin absolu = " + f.getAbsolutePath());
                out.close();
            } catch (Exception ex) {
                // handle exception
                ex.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        //Returns the path where file is stored
        return path;
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

    public void uploadFileVCE(ValueChangeEvent valueChangeEvent) {
        if (valueChangeEvent.getNewValue() != null) {
            //Get File Object from VC Event
            UploadedFile fileVal = (UploadedFile) valueChangeEvent.getNewValue();
            //Upload File to path- Return actual server path
            String path = uploadFile(fileVal);
            System.out.println(fileVal.getContentType());
            //Method to insert data in table to keep track of uploaded files
            /*    OperationBinding ob = executeOperation("setFileData");
            ob.getParamsMap().put("Nomfichier", fileVal.getFilename());
            ob.getParamsMap().put("Cheminfichier", path);
            ob.getParamsMap().put("Typefichier", fileVal.getContentType());
            ob.execute(); */
            System.out.println("Nomfichier = " + fileVal.getFilename());
            System.out.println("Cheminfichier = " + path);
            System.out.println("Typefichier = " + fileVal.getContentType());

            FacesContext fc = FacesContext.getCurrentInstance();
            UIViewRoot root = fc.getViewRoot();

            FacesContext context = FacesContext.getCurrentInstance();
            Application application = context.getApplication();

            RichInputText nomFichierInputText = (RichInputText) findComponent(root, "it5");
            RichInputText cheminFichierInputText = (RichInputText) findComponent(root, "it6");
            System.out.println("nomFichierInputText = " + nomFichierInputText);
            nomFichierInputText.setValue(fileVal.getFilename());
            cheminFichierInputText.setValue(path);
            // Reset inputFile component after upload
          //  ResetUtils.reset(valueChangeEvent.getComponent());
        }
    }

    public void fileDownloadActionListener(FacesContext facesContext, OutputStream outputStream) throws IOException{
        String pathFichier = notifObj.getValueOfField("CeqeView1Iterator", "Cheminfichier");
        File filed = new File(pathFichier);
        FileInputStream fis;
        byte[] b;
        try {
            fis = new FileInputStream(filed);

            int n;
            while ((n = fis.available()) > 0) {
                b = new byte[n];
                int result = fis.read(b);
                outputStream.write(b, 0, b.length);
                if (result == -1)
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        outputStream.flush();
    }

    public String supprimeCeqe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Le CEQE a été supprimé avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimeCeqe();
        }
    }

    public String annulerCeqe() {
        notifObj.annulerParent("CeqeView1Iterator");
        return null;
    }
}
