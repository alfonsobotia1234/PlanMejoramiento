package Model;
import java.io.InputStream;

/**
 *
 * @author User
 */
public class Producto {

    public static void add(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int id;
    InputStream imagProducto;
    String nomProducto;
    int precio;

    public Producto() {
    }

    public Producto(int id, InputStream imagProducto, String nomProducto, int precio) {
        this.id = id;
        this.imagProducto = imagProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InputStream getImagProducto() {
        return imagProducto;
    }

    public void setImagProducto(InputStream imagProducto) {
        this.imagProducto = imagProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
