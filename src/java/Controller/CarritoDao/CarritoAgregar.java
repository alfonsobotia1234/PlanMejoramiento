package Contrlador;

import Modelo.Carrito;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andres Alvarez
 */
public class CarritoAgregar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int id_producto = Integer.parseInt(request.getParameter("id_producto"));

        HttpSession sesion = request.getSession(true);

        ArrayList<Carrito> lista = sesion.getAttribute("carrito") == null ? new ArrayList<>() : (ArrayList) sesion.getAttribute("carrito");

        boolean comprobacion = false;

        if (lista.size() > 0) {
            for (Carrito c : lista) {
                if (id_producto == c.getId_producto()) {
                    c.setCantidad(c.getCantidad() + cantidad);
                    comprobacion = true;
                    break;
                }
            }
        }

        if (!comprobacion) {
            lista.add(new Carrito(id_producto, cantidad));
        }

        sesion.setAttribute("carrito", lista);
        
        response.sendRedirect("carrito.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
