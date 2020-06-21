package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.Conexion;

public final class roles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>rol</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <link href=\"css/rol.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <select name=\"rol\" class=\"\" onchange=\"location = this.value;\">  <br>\n");
      out.write("                <option>Seleccione rol</option>\n");
      out.write("                ");

                    //Aqui es la pgina en la cual se desarrolla el select para los roles.

                    int contador = 0;
                    String documento = (String) session.getAttribute("documento");
                    Conexion con = new Conexion();
                    /*Se importa la clase conexion se crean las variables de mysql y se hace la primera busqueda
                    , en ella se realiza la busqueda de los permisos que tenga el usuario con su numero de documento
                    que previamente fue subido a una variable de sesion
                     */
                    String sql = "SELECT * FROM autorizacion WHERE usuario_id";
                    PreparedStatement pst = null;
                    ResultSet rs = null;
                    try {
                        pst = con.getConexion().prepareStatement(sql);
                        rs = pst.executeQuery();
                        String nombre_rol = "";
                        contador = contador++;
                        while (rs.next()) {
                            /*Se verifica si hay resultados, si los hay, se guarda el id del rol que tenga el usuario en una variable
                            y posteriormente con otra consulta se trae el nombre de los roles del usuario 
                             */
                            String id_rol = rs.getString("id_roles");
                            String sql2 = "SELECT * FROM roles WHERE id_roles='" + id_rol + "'";
                            PreparedStatement pst2 = null;
                            ResultSet rs2 = null;
                            pst2 = con.getConexion().prepareStatement(sql2);
                            rs2 = pst2.executeQuery();

                            while (rs2.next()) {
                                nombre_rol = rs2.getString("nombre_rol");

                                //aqui hice un if para cuando obtenga los roles que tiene entonces dependiendo el rol lo mada a su respectiva pagina
                                if (nombre_rol.equals("Administrador")) {
                
      out.write("\n");
      out.write("                <option value=\"menuAdministrador.jsp\"><a >");
      out.print(nombre_rol);
      out.write("</a></option>\n");
      out.write("                ");

                    }
                    if (nombre_rol.equals("Instructor")) {

                
      out.write("\n");
      out.write("                <option value=\"menuInstructor.jsp\"><a >");
      out.print(nombre_rol);
      out.write("</a></option>\n");
      out.write("                ");

                    }
                    if (nombre_rol.equals("Responsable")) {
                
      out.write(" \n");
      out.write("                <option value=\"menuResponsable.jsp\"><a >");
      out.print(nombre_rol);
      out.write("</a></option>\n");
      out.write("                ");


                    }

                
      out.write("\n");
      out.write("                ");
                    //Aqui se muestran los roles(Necesito que creee los href dentro del select para poder hacer las demas paginas)
                            }

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
                            if (rs != null) {
                                rs.close();
                            }

                        } catch (SQLException e) {
                            System.err.println("Error" + e);
                        }
                    }
                
      out.write("\n");
      out.write("            </select> \n");
      out.write("        </header>\n");
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
