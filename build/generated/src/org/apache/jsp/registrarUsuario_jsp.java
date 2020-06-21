package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("            <h1 class=\"user__title\">Registro</h1>\n");
      out.write("            <br>\n");
      out.write("            <div  class=\"input-group-prepend\">\n");
      out.write("                <form class=\"form\" action=\"usuario\" method=\"post\">\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"documento\" type=\"text\" placeholder=\"Número de Documento\"  class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"nombres\" type=\"text\" placeholder=\"Nombres\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"apellidos\" type=\"text\" placeholder=\"Apellidos\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"correo\" type=\"email\" placeholder=\"Correo\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                           <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input name=\"contrasenia\" type=\"password\" placeholder=\"Contraseña\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <label class=\"input-group-text\" for=\"inputGroupSelect01\"><i class=\"icon-down-open\"></i></label>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <select name=\"tipodoc\"  class=\"custom-select\"  >  <br>\n");
      out.write("                            <option >Tipo de documento</option> \n");
      out.write("                            <option value=\"3\">Cedula de ciudadania</option> \n");
      out.write("                            <option value=\"5\">Cedula de extranjeria</option> \n");
      out.write("                            <option value=\"6\">Documento nacioal de identidad</option>\n");
      out.write("                            <option value=\"7\">Tarjeta de identidad</option> \n");
      out.write("                            <option value=\"8\">Tarjeta pasaporte</option> \n");
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\">Registrar</button> \n");
      out.write("                    <a class=\"btn btn-success\" type=\"submit\" href=\"index.jsp\" >Volver </a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
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
