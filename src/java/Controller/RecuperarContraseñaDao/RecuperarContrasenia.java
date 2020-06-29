package Controller.RecuperarContraseñaDao;

import Controller.SendMailDao.SendEmailSMTP;
import Model.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RecuperarContrasenia", urlPatterns = {"/RecuperarContrasenia"})
public class RecuperarContrasenia extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecuperarContrasenia</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RecuperarContrasenia at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet RecuperarContrasenia at " + request.getAttribute("mail") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Consultas co = new Consultas();
        String pass = "";

        String nombreUser = request.getParameter("nombres");
        String mailUser = request.getParameter("correo");
        
      

        if (nombreUser.equalsIgnoreCase("") && mailUser.equalsIgnoreCase("")) {

            request.setAttribute("msg", "Nombre o correo invalido ");
            request.getRequestDispatcher("recuperarContrasenia.jsp").forward(request, response);

        } else {
              System.out.println("Controller.RecuperarContraseñaDao.RecuperarContrasenia.doPost()" + nombreUser + "   "+ mailUser);
            boolean isEnviarCorreo = co.correoIsValid(mailUser);
            
            if(isEnviarCorreo){
               String  userName = co.getUserName(nombreUser,mailUser); 
                pass = co.recuperarContraseniaDB(userName);
                SendEmailSMTP s = new SendEmailSMTP();
                mailUser = "alfonsobotia8@gmail.com";
                s.enviarConGMail(mailUser, "prueba 2  ", "Su contraes es: " + pass);
             }
                request.getRequestDispatcher("index.jsp").forward(request, response);
           
        }
       

      

            

        
       
        // processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
