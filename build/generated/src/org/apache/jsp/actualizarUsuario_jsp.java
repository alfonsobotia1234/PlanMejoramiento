package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Conexion;
import Model.Consultas;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class actualizarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <link href=\"css/styleregistro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"font/fontello.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <h1 class=\"user__title\">Actualizar Usuario</h1>\n");
      out.write("            ");


                String numeroDoc = request.getParameter("cod");
                Conexion con = new Conexion();
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    String consulta = ("SELECT * FROM usuario WHERE numero_documento= ?");
                    pst = con.getConexion().prepareStatement(consulta);
                    pst.setString(1, numeroDoc);
                    rs = pst.executeQuery();

                    while (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"input-group-prepend\">\n");
      out.write("                <form class=\"form\" action=\"usuario\" method=\"post\">\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"numdoc\" readonly type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\" placeholder=\"Número de Documento\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"nombres\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\" placeholder=\"Nombres\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"apellidos\" type=\"text\"  value=\"");
      out.print(rs.getString(4));
      out.write("\" placeholder=\"Apellidos\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"correo\" type=\"email\"  value=\"");
      out.print(rs.getString(5));
      out.write("\" placeholder=\"Correo electronico\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <label class=\"input-group-text\" for=\"inputGroupSelect01\"><i class=\"icon-down-open\"></i></label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input name=\"estado\" type=\"text\"  value=\"");
      out.print(rs.getString(7));
      out.write("\" placeholder=\"Estado\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <label class=\"input-group-text\" for=\"inputGroupSelect01\"><i class=\"icon-down-open\"></i></label>\n");
      out.write("                        </div>\n");
      out.write("                        <select name=\"tipoDoc\"  class=\"custom-select\"  >  <br>\n");
      out.write("                            <option >Tipo de documento</option> \n");
      out.write("                            <option value=\"3\">Cedula de ciudadania</option> \n");
      out.write("                            <option value=\"5\">Cedula de extranjeria</option> \n");
      out.write("                            <option value=\"6\">Documento nacioal de identidad</option>\n");
      out.write("                            <option value=\"7\">Tarjeta de identidad</option> \n");
      out.write("                            <option value=\"8\">Tarjeta pasaporte</option> \n");
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input name=\"numdoc\"  type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\" placeholder=\"Número de Documento\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\">Actualizar</button> \n");
      out.write("                    <a class=\"btn btn-success\" type=\"submit\" href=\"menuUsuario.jsp\" >Volver </a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
}

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
