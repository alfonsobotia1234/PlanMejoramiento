package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.Conexion;

public final class actualizarDocumento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Actualizar</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <link href=\"css/styleregistraruser.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<center> <h1 class=\"user__title\">Actualizar Tipo de documento</h1></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"user\" >\n");
      out.write("    \n");
      out.write("    ");

        String inicial = request.getParameter("codigo");
            Conexion con = new Conexion();
            PreparedStatement pst = null;
            ResultSet rs = null;
            try {   
                String consulta = "SELECT * FROM tipo_documento where inicial= ?;";
                pst = con.getConexion().prepareStatement(consulta);
                pst.setString(1, inicial);
                rs = pst.executeQuery();

                while (rs.next()) {

        
      out.write("\n");
      out.write("    <form class=\"form\" action=\"ActualizarDocumento\" method=\"post\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"form__group\">\n");
      out.write("            <input name=\"inicial\" readonly type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\" placeholder=\"Inicial\" class=\"form__input\" />\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"form__group\">\n");
      out.write("            <input name=\"nombreDocumento\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\" placeholder=\"nombreDoc\" class=\"form__input\" />\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"form__group\">\n");
      out.write("            <select name=\"estadoTipoDocumento\" class=\"form__input\">  \n");
      out.write("                <option>Tipo de documento</option> \n");
      out.write("                <option value=\"Activo\">Activo</option> \n");
      out.write("                <option value=\"Inactivo\">Inactivo</option> \n");
      out.write("\n");
      out.write("            </select> \n");
      out.write("        </div> <br>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <center><input class=\"boton\" name=\"opcion\" value=\"Guardar\" type=\"submit\">  \n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");


    } catch (SQLException e) {
        System.out.println("Error" + e);
    } finally {
        try {
            if (con.getConexion() != null) {
                con.getConexion().close();
            }
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            System.err.println("Error" + e);
        }
    }

      out.write('\n');
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
