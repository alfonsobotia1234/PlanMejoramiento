package Controller.UsuarioDao;

import Model.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "Usuario", urlPatterns = {"/Usuario"})
public class Usuario extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {

                
                String numeroDoc = request.getParameter("numeroDoc");
                String nombres = request.getParameter("nombres");
                String apellidos = request.getParameter("apellidos");
                String correo = request.getParameter("correo");
                int tipoDocumentoId = Integer.parseInt(request.getParameter("tipoDoc"));
             //   String numeroDocumento = request.getParameter("numeroDocumento");
                int id = Integer.parseInt(request.getParameter("id"));

           

                Consultas co = new Consultas();
                if (co.actualizarUsuario(numeroDoc, nombres, apellidos, correo, correo, tipoDocumentoId, id)) {
                    response.sendRedirect("consultarUsuario.jsp");
                } else {
                    response.sendRedirect("consultarUsuario.jsp");
                }
            }catch(Exception e){
                System.out.println(e);
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
