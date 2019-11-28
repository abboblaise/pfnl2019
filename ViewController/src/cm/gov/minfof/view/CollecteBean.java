package cm.gov.minfof.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.math.BigDecimal;

import java.sql.Connection;

import java.util.HashMap;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import javax.sql.DataSource;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.util.JRLoader;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Key;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

public class CollecteBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    private File fichier = null;


    public CollecteBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public BindingContainer getBindingContainer() {
        BindingContext bindingContext = BindingContext.getCurrent();
        return bindingContext.getCurrentBindingsEntry();
    }


    public Connection getDataSourceConnection(String dataSourceName) throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup(dataSourceName);
        return ds.getConnection();
    }

    private Connection getConnection() throws Exception {
        return getDataSourceConnection("jdbc/Connection1DS"); // use datasourse in your application
    }

    public void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public ServletContext getContext() {
        return (ServletContext) getFacesContext().getExternalContext().getContext();
    }

    public HttpServletResponse getResponse() {
        return (HttpServletResponse) getFacesContext().getExternalContext().getResponse();
    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    public Object executemethode(String mthod) {
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }

    public String creerCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregistreCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String supprimeCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        Object o = executemethode("Commit");
        //System.out.println("object = " + o);
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée!<br> La collecte a été supprimée avec succès");
        return null;
    }

    public String annulerEnregistrement() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String creerDetailsCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert1");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String supprimerDetailCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! <br>La ligne a été supprimée avec succès");
        return null;
    }

    public String enregCollecte() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String enregistrerCollecte() {
        System.out.println("entree dans enregistreCollecte");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Enregistrement effectué! <br>La collecte a été enregistrée avec succès");
        return null;
    }


    public void runReport(String repPath, java.util.Map param) throws Exception {
        Connection conn = null;
        try {
            HttpServletResponse response = getResponse();
            ServletOutputStream out = response.getOutputStream();
            //response.addHeader("Cache-Control", "max-age=0");
            response.setHeader("Expires", "0");
            response.setHeader("Cache-Control", "must-revalidate, post-check=0,precheck=0");
            response.setHeader("Pragma", "public");
            response.setContentType("application/pdf");
            //        response.setContentType("application/pdf");
            ServletContext context = getContext();
            InputStream fs = context.getResourceAsStream("reports/" + repPath);
            JasperReport template = (JasperReport) JRLoader.loadObject(fs);
            template.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
            conn = getConnection();
            System.out.println("Conn = " + conn.toString());
            JasperPrint print = JasperFillManager.fillReport(template, param, conn);
            //   JasperFillManager.fillReportToFile(template, "test.pdf", param, conn);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(print, baos);
            out.write(baos.toByteArray());
            Double dd = Math.random();
            String cc = dd.toString() + ".pdf";
            try (OutputStream outputStream = new FileOutputStream(cc, true)) {
                baos.writeTo(outputStream);
                File f = new File(cc);
                System.out.println("path = " + f.getAbsolutePath());
                response.addHeader("Content-Disposition", "attachment; filename=" + f.getAbsolutePath());
                this.fichier = f;
            }

            out.flush();
            out.close();
            FacesContext.getCurrentInstance().responseComplete();
        } catch (Exception jex) {
            jex.printStackTrace();
        } finally {
            close(conn);
        }
    }


    public String imprimeEtat() {
        Map m = new HashMap();
        DCIteratorBinding empIter = (DCIteratorBinding) getBindings().get("CollectepfnlView1Iterator");
        String collecteId = empIter.getCurrentRow()
                                   .getAttribute("Idcollectepfnl")
                                   .toString();

        String logoMinfof = FacesContext.getCurrentInstance()
                                        .getExternalContext()
                                        .getRealPath("/reports/MINFOF.png");
        String logoPfnl = FacesContext.getCurrentInstance()
                                      .getExternalContext()
                                      .getRealPath("/reports/logo_pfnl.png");

        m.put("pidcollecte", new BigDecimal(collecteId));
        m.put("Plogominfof", logoMinfof);
        m.put("Plogopfnl", logoPfnl);

        //m.put("pidregion", new BigDecimal(empId));
        try {
            runReport("collecte_pfnl.jasper", m);
        } catch (Exception e) {
        }
        return null;
    }

    public void imprime(FacesContext facesContext, OutputStream outputStream) throws IOException {
        OutputStreamWriter w = new OutputStreamWriter(outputStream, "UTF-8");
        FileInputStream fis;
        byte[] b;
        try {
            fis = new FileInputStream(this.fichier);
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
        this.fichier.delete();
    }

    public void imprimeLettreParPostePermissionnaireHandle(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void onCollecteQuery(QueryEvent queryEvent) {
        BindingContext bctx = BindingContext.getCurrent();
        DCBindingContainer bindings = (DCBindingContainer) bctx.getCurrentBindingsEntry();

        //access the method bindings to set the bind variables on the ViewCriteria
        OperationBinding rangeStartOperationBinding = bindings.getOperationBinding("setdateDebut");
        OperationBinding rangeEndOperationBinding = bindings.getOperationBinding("setdateFin");

        // get the start date and end date from the temporary valiables
        AttributeBinding attr = (AttributeBinding) bindings.getControlBinding("dateDebutVar1");
        Timestamp sd = (Timestamp) attr.getInputValue();
        attr = (AttributeBinding) bindings.getControlBinding("dateFinVar1");
        Timestamp ed = (Timestamp) attr.getInputValue();

        DCIteratorBinding iterIB = (DCIteratorBinding) getBindings().get("CollectepfnlView1Iterator");
        ViewObjectImpl ttVO = (ViewObjectImpl) iterIB.getViewObject();
        ViewCriteria vc = ttVO.getViewCriteria("CollectepfnlViewCriteria");
        VariableValueManager vvm_vc = vc.ensureVariableManager();
        vvm_vc.setVariableValue("dateDebut", sd);
        vvm_vc.setVariableValue("dateFin", ed);
        ttVO.setApplyViewCriteriaNames(new String[] { "CollectepfnlViewCriteria" });

        invokeMethodExpression("#{bindings.CollectepfnlView1Query.processQuery}", Object.class, QueryEvent.class,
                               queryEvent);
    }

    public Object invokeMethodExpression(String expr, Class returnType, Class[] argTypes, Object[] args) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elctx = fc.getELContext();
        ExpressionFactory elFactory = fc.getApplication().getExpressionFactory();
        MethodExpression methodExpr = elFactory.createMethodExpression(elctx, expr, returnType, argTypes);
        return methodExpr.invoke(elctx, args);
    }

    public Object invokeMethodExpression(String expr, Class returnType, Class argType, Object argument) {
        return invokeMethodExpression(expr, returnType, new Class[] { argType }, new Object[] { argument });
    }

    public void onDeleteCollecte(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimeCollecte();
        }
    }

    public void onDeleteDetailsCollecte(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            supprimerDetailCollecte();
        }
    }

    public void qryId1_attributeChangeListener(AttributeChangeEvent attributeChangeEvent) {
        /*    System.out.println("je suis entré");
        DCIteratorBinding multiCritereIter = (DCIteratorBinding) getBindings().get("CollMultiCritere1Iterator");
        DCIteratorBinding collecteCompileeIter = (DCIteratorBinding) getBindings().get("CompilCollecte1Iterator");
        ViewCriteria multiCritereVC = multiCritereIter.getViewCriteria();
        collecteCompileeIter.getViewObject().applyViewCriteria(multiCritereVC);
        collecteCompileeIter.executeQuery();
        System.out.println("je suis sorti");*/
    }

    public String actualiserHistogramme() {
        System.out.println("je suis entré");
        DCIteratorBinding multiCritereIter = (DCIteratorBinding) getBindings().get("CollMultiCritere1Iterator");
        DCIteratorBinding collecteCompileeIter = (DCIteratorBinding) getBindings().get("CompilCollecte1Iterator");
        ViewCriteria multiCritereVC;
        
        ApplicationModule appModule = multiCritereIter.getViewObject().getApplicationModule();
        ViewObject vo = appModule.findViewObject("CollMultiCritere1");
        ViewCriteria critere = vo.getViewCriteriaManager().getViewCriteria("CollMultiCritereCriteria");
        
        
        multiCritereVC = multiCritereIter.getViewCriteria();
        System.out.println("criteria = " + multiCritereVC.getName());
        collecteCompileeIter.getViewObject().applyViewCriteria(critere);
        collecteCompileeIter.executeQuery();
        System.out.println("je suis sorti");
       

        return null;
    }

    public String annulerDetailsCollecte() {
        notifObj.annulerParentEtDetails("CollectepfnlView1Iterator", "DetailscollectepfnlView17Iterator");
        return null;
    }

    public String annulerCollecte() {
        notifObj.annulerParent("CollectepfnlView1Iterator");
        return null;
    }
}
