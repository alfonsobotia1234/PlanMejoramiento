
package Controller.AlquilerDao;

import Controller.CarritoDao.Carrito;
import java.util.List;

public class Alquiler {
    
    private int precio_alquiler;
    private String fecha_alquiler;
    private String fecha_devolucion;
    private int id_usuario;


    private List<Carrito>productos;
    
    public Alquiler() {
    }

    public Alquiler(int precio_alquiler, String fecha_alquiler, String fecha_devolucion, int id_usuario, List<Carrito> productos) {
        this.precio_alquiler = precio_alquiler;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.id_usuario = id_usuario;
        this.productos = productos;
    }

    public int getPrecio_alquiler() {
        return precio_alquiler;
    }

    public void setPrecio_alquiler(int precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }

    public String getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(String fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public List<Carrito> getProductos() {
        return productos;
    }

    public void setProductos(List<Carrito> productos) {
        this.productos = productos;
    }
       
    
    
}
