package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class actualizarUsuario1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

       //CONECTANOD A LA BASE DE DATOS:
       Connection con;
       String url="jdbc:mysql://localhost:3306/Caterpillar";
       String Driver="com.mysql.jdbc.Driver";
       String user="root";
       String clave="";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;
       ResultSet rs;
       String numeroDoc=request.getParameter("doc");
       ps=con.prepareStatement("select * from usuario where numero_documento="+numeroDoc);
       rs=ps.executeQuery();
       while(rs.next()){
                         
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Modificar Registro</h1>\n");
      out.write("            <hr>\n");
      out.write("            <form action=\"usuario\" method=\"post\" class=\"form-control\" style=\"width: 500px; height: 400px\">\n");
      out.write("                numeroDoc\n");
      out.write("                <input type=\"text\" readonly=\"\" class=\"form-control\" value=\"");
      out.print( rs.getString("numero_documento"));
      out.write("\"/>\n");
      out.write("                 Nombres:\n");
      out.write("                <input type=\"text\" name=\"txtNom\" class=\"form-control\" value=\"");
      out.print( rs.getString("nombres"));
      out.write("\"/><br>\n");
      out.write("                Apellidos\n");
      out.write("                <input type=\"text\" name=\"txtDNI\" class=\"form-control\" value=\"");
      out.print( rs.getString("apellidos"));
      out.write("\"/>\n");
      out.write("                Correo\n");
      out.write("                <input type=\"email\" name=\"txtDNI\" class=\"form-control\" value=\"");
      out.print( rs.getString("correo"));
      out.write("\"/>\n");
      out.write("                Estado\n");
      out.write("                <input type=\"text\" name=\"txtDNI\" class=\"form-control\" value=\"");
      out.print( rs.getString("estado"));
      out.write("\"/>     \n");
      out.write("                <a href=\"index.jsp\">Regresar</a>\n");
      out.write("            </form>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
