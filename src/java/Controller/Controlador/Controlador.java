package Controller.Controlador;

import Controller.productoDao.ProductoDao;
import Model.Carrito;
import Model.Consultas;
import Model.Producto;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
@MultipartConfig
public class Controlador extends HttpServlet {

    Producto p = new Producto();
    Consultas co=new Consultas();
    ProductoDao dao=new ProductoDao();
    List<Producto> productos = new ArrayList<>();

    List<Carrito> listaCarrito = new ArrayList<>();
    int item;
    double totalPagar = 0.0;
    int cantidad = 1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String accion = request.getParameter("accion");
            productos=dao.listar();
            switch (accion){
                case"":
                    
                    break;
              default:
                  request.setAttribute("productos", productos);
                  request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
        /*  case "AgregarCarrito":
               int idp=Integer.parseInt(request.getParameter("id"));
               p=prodao.listarId(idp);
               item=item+1;
               Carrito car=new Carrito();
               car.setItem(item);
               car.setIdproducto(p.getIdProducto());
               car.setNombres(p.getNomProducto());
               car.setPrecioCompra(p.getPrecio());
               car.setCantidad(cantidad);
               car.setSubTota=(cantidad*p.getPrecio());
               listaCarrito.add(car);
               request.setAttribute("contador", listaCarrito.size());
               request.getRequestDispatcher("Controlador?accion=inicio").forward(request, response);
                break;
            case "Carrito":

                break;*/
        request.setAttribute("Productos", productos);
        request.getRequestDispatcher("menuUsuario.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
       
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Guardar":
                
                
               //Datos que se resiven del formulario
                String nom = request.getParameter("nomProducto");
                int pre = Integer.parseInt(request.getParameter("precio"));
                Part part = request.getPart("imagProducto");
                System.out.println("p generado ");
                InputStream inputStream = part.getInputStream();
                
                //envia los datos a PersonaDao
                p.setNomProducto(nom);
                p.setPrecio(pre);
                p.setImagProducto(inputStream);
                
               
                dao.agregar(p);
                request.getRequestDispatcher("menuUsuario.jsp");
                break;

        }
        request.getRequestDispatcher("menuUsuario.jsp").forward(request, response);
   
    
        switch (accion){
                case"productos":
                    List<Producto>productos=dao.listar();
                    request.getAttribute("productos"); 
                    request.getRequestDispatcher("menuUsuario.jsp").forward(request, response);
                    
                    break;
            
                 default:
                  request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
 }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
