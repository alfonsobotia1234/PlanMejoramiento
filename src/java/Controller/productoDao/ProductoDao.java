package Controller.productoDao;

import Model.Conexion;
import Model.Producto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class ProductoDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Producto listarId(int id){
        String sql="select * from producto where id_producto="+id;
        Producto p= new Producto();
        try {
           con=cn.getConexion();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               p.setIdProducto(rs.getInt(1));
               p.setImagProducto(rs.getBinaryStream(2));
               p.setNomProducto(rs.getString(3));
               p.setPrecio(rs.getInt(4));
               
           }
        } catch (Exception e) {
        }
        return p;
    }

    public List listar() {
        List<Producto> productos = new ArrayList();
        String sql = "select * from producto";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt(1));
                p.setImagProducto(rs.getBinaryStream(2));
                p.setNomProducto(rs.getString(3));
                p.setPrecio(rs.getInt(4));
                productos.add(p);
            }

        } catch (Exception e) {

        }
        return productos;
    }

    public void listarImagen(int id, HttpServletResponse reponse) {
        String sql = "select * from producto where id_Producto=?";
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            outputStream = reponse.getOutputStream();
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next());
            {
                inputStream = rs.getBinaryStream("imagProducto");
                System.out.println("Encuentra un inaaresultado adicional ");
            }
            
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
           
            int i = 0;

            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);

            }
            
            System.out.println("Me debe estar manaddo ");
        } catch (SQLException e ) {
            System.err.println("Producto "+ e.getMessage());

        } catch (IOException ex) {
            System.out.println("error arhcio IO " + ex.getMessage());
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  public void agregar(Producto p){
      
        System.out.println("Nombre "+ p.getNomProducto());
        System.out.println("precio"+ p.getPrecio());
        System.out.println("imagen"+ p.getImagProducto());
        
        String sql="insert into producto ( nombre_producto, imagen_producto, precio) values(?,?,?)";
                   
                    
                    
        try {
             con=cn.getConexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, p.getNomProducto());
            ps.setBlob(2, p.getImagProducto());
            ps.setInt(3, p.getPrecio());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, e);
            
            
            System.out.println("Error agrgar )"+e.getMessage());
             System.out.println("Error agrgar )"+e.getLocalizedMessage());
             System.out.println("Descripcion )"+e.getStackTrace());
            
       
        }
           
            
        
    }
}