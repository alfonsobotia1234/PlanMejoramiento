package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarDocumento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Documento</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <link href=\"font/fontello.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"css/styleregistrodoc.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <nav>\n");
      out.write("        <h1 >Registro de Tipo de Documento</h1>\n");
      out.write("    <div class=\"input-group-prepend\" >\n");
      out.write("        <form class=\"form\" action=\"RegistrarDocumento\" >\n");
      out.write("            <br>\n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <div class=\"input-group-prepend\">\n");
      out.write("                    <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <input name=\"inicial\" type=\"text\" maxlength=\"4\" placeholder=\"Inicial del documento\" class=\"form__input\" /><br>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <div class=\"input-group-prepend\">\n");
      out.write("                    <span class=\"input-group-text\" id=\"basic-addon1\" ><i class=\"icon-user-1\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <input name=\"nombreDoc\" type=\"text\" placeholder=\"Nombre de Documento\" class=\"form__input\" /><br>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("                <div class=\"input-group-prepend\">\n");
      out.write("                    <label class=\"input-group-text\" for=\"inputGroupSelect01\"><i class=\"icon-down-open\"></i></label>\n");
      out.write("                </div>\n");
      out.write("                <select name=\"estadoTipoDoc\" class=\"custom-select\">  <br>\n");
      out.write("                    <option>Selelccione una opcion</option> \n");
      out.write("                    <option value=\"Activo\">Activo</option> \n");
      out.write("                    <option value=\"Inactivo\">Inactivo</option> \n");
      out.write("\n");
      out.write("                </select> \n");
      out.write("            </div> <br>\n");
      out.write("\n");
      out.write("            <input class=\"btn btn-primary\" name=\"accion\" value=\"Agregar\" type=\"submit\">\n");
      out.write("            <a style=\"color: white\" href=\"menuAdministrador.jsp\" class=\"btn btn-success\" type=\"submit\">Volver</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("</body>\n");
      out.write("</html>");
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
