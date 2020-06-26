package Controller.IniciarSesion;

import Model.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InicioSesion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("contrasenia");
        HttpSession objsesion = request.getSession(true);
        Consultas co = new Consultas();

        String nombre = co.autenticacion(usuario, password);
        String rol =  co.autenticacionRol(usuario, password);
        if (nombre != "") {

            objsesion.setAttribute("usuario", "1");
            objsesion.setAttribute("nombre", nombre);
            objsesion.setAttribute("documento", usuario);
            
            
            if (rol.equals("Administrador")) {
                objsesion.setAttribute("rol", rol);
                response.sendRedirect("menuAdministrador.jsp");
            
            } else {
                response.sendRedirect("menuUsuario.jsp");
            }
        } else {

            objsesion.setAttribute("usuario", "0");
            objsesion.setAttribute("nombre", "");
            objsesion.setAttribute("documento", "");
            response.sendRedirect("mensaje.jsp");
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
