package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.Conexion;

public final class consultarRol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consultar Roles</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"CSS/styledocumento.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <br>\n");
      out.write("                <h1>Consultar Roles</h1>\n");
      out.write("                <a href=\"menuAdministrador.jsp\" style=\"color: white\" class=\"btn btn-success\">Volver</a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table  class=\"table table-sm table-bordered table-hover \">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"text-center\">Nombre</th>\n");
      out.write("                            <th class=\"text-center\">Acciones</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");
  Conexion con = new Conexion();
                            PreparedStatement pst = null;
                            ResultSet rs = null;
                            try {
                                String sql= "SELECT * FROM roles ;";
                                pst = con.getConexion().prepareStatement(sql);
                                rs = pst.executeQuery();

                                while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"text-center\">");
      out.print(rs.getString("nombre_rol"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td class=\"text-center\"><a class=\"btn btn-info\" href=\"actualizarRol.jsp?id_rol=");
      out.print(rs.getString("id_roles"));
      out.write("\">Actualizar</a>\n");
      out.write("                                <a style=\"color: white\" class=\"btn btn-danger\" href=\"EliminarRol?id_rol=");
      out.print(rs.getString("id_roles"));
      out.write("\">Eliminar</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </thead>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
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
