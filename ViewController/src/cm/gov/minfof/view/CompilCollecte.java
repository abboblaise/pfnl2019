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

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

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

import oracle.adf.model.binding.DCIteratorBinding;
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
import javax.faces.context.FacesContext;

import javax.naming.Context;

import javax.naming.InitialContext;

import javax.servlet.ServletContext;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import javax.sql.DataSource;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;

public class CompilCollecte {
    private File fichier = null;
    private Date dateDeb;
    private Date dateFin;

    public CompilCollecte() {
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public BindingContainer getBindingContainer() {
    BindingContext bindingContext = BindingContext.getCurrent();
    return bindingContext.getCurrentBindingsEntry();
    }

    public String imprimeCompil() {
        System.out.println("Entree dans la methode imprimeCompil");
        return null;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void imprimeHandle(ActionEvent actionEvent) {
        System.out.println("Date deb = " + dateDeb);
        System.out.println("Date fin = " + dateFin);
        imprimeEtat("colllectescompilees_pfnl.jasper");
    }
    
    public Connection getDataSourceConnection(String dataSourceName) throws Exception
      {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup(dataSourceName);
        return ds.getConnection();
      }
    
    private Connection getConnection() throws Exception
    {
      return getDataSourceConnection("jdbc/Connection1DS");// use datasourse in your application
    }
    
    public void close(Connection con)
        {
          if (con != null)
          {
            try
            {
              con.close();
            }
            catch (Exception e)
            {
            }
          }
        }
    
    public  ServletContext getContext()
    {
      return (ServletContext)getFacesContext().getExternalContext().getContext();
    }
    
    public  HttpServletResponse getResponse()
    {
      return (HttpServletResponse)getFacesContext().getExternalContext().getResponse();
    }
    
    public static FacesContext getFacesContext()
    {
      return FacesContext.getCurrentInstance();
    }
    
    public void runReport(String repPath, java.util.Map param) throws Exception
          {
              Connection conn = null;
              try
              {
                HttpServletResponse response = getResponse();
                ServletOutputStream out = response.getOutputStream();
                //response.addHeader("Cache-Control", "max-age=0");
                response.setHeader("Expires", "0");
                        response.setHeader("Cache-Control","must-revalidate, post-check=0,precheck=0");
                        response.setHeader("Pragma", "public");
                        response.setContentType("application/pdf");
        //        response.setContentType("application/pdf");
                ServletContext context = getContext();
                InputStream fs = context.getResourceAsStream("reports/"+repPath);
                JasperReport template = (JasperReport) JRLoader.loadObject(fs);
                template.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
                conn = getConnection();
                  System.out.println("Conn = "+conn.toString());
                JasperPrint print = JasperFillManager.fillReport(template, param, conn);
             //   JasperFillManager.fillReportToFile(template, "test.pdf", param, conn);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                JasperExportManager.exportReportToPdfStream(print, baos);
                out.write(baos.toByteArray());
                  Double dd = Math.random();
                  String cc = dd.toString()+".pdf";
                  try(OutputStream outputStream = new FileOutputStream(cc, true)) {
                      baos.writeTo(outputStream);
                      File f = new File(cc);
                      System.out.println("path = " + f.getAbsolutePath());
                      response.addHeader("Content-Disposition", "attachment; filename="+f.getAbsolutePath());
                      this.fichier = f;
                  }
                
                out.flush();
                out.close();
                FacesContext.getCurrentInstance().responseComplete();
              }
              catch (Exception jex)
              {
                jex.printStackTrace();
              }
              finally
              {    
                close(conn);
              }
          }

    public String imprimeEtat(String nomFichier) {
        Map m = new HashMap();
        //DCIteratorBinding empIter = (DCIteratorBinding) getBindings().get("CollectepfnlView1Iterator");
        //String collecteId = empIter.getCurrentRow().getAttribute("Idcollectepfnl").toString();
                
        String logoMinfof = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reports/MINFOF.png");
        String logoPfnl = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reports/logo_pfnl.png");
        
    //    m.put("pidcollecte", new BigDecimal(collecteId));
        m.put("Plogominfof",logoMinfof);    
        m.put("Plogopfnl",logoPfnl);
        m.put("PDatedeb", dateDeb);
        m.put("PDatefin", dateFin);
                    
        //m.put("pidregion", new BigDecimal(empId));
        try {
              runReport(nomFichier, m);
        } catch (Exception e) {
                }
        return null;
    }

    public void imprime(FacesContext facesContext, OutputStream outputStream) throws IOException{
        OutputStreamWriter w = new OutputStreamWriter(outputStream, "UTF-8");
             FileInputStream fis;
             byte[] b;
             try {
                 fis = new FileInputStream(this.fichier);
                 int n;
                 while((n=fis.available())>0) {
                     b = new byte[n];
                     int result = fis.read(b);
                     outputStream.write(b, 0, b.length);
                     if(result == -1)
                         break;
                     }
                 }
             catch (IOException e)
             {
                 e.printStackTrace();
             }
             outputStream.flush();
             this.fichier.delete();
    }

    public void imprimeParProduitHandle(ActionEvent actionEvent) {
        imprimeEtat("collectescompileesparproduit_pfnl.jasper");
    }

    public void imprimeLettreParPostePermissionnaireHandle(ActionEvent actionEvent) {
        imprimeEtat("lettrevoiturecompilee_pfnl.jasper");
    }
}
