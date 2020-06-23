package Controller.productoDao;

import Model.Conexion;
import Model.Producto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
           con=cn.getConnection();
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
            con = cn.getConnection();
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
        String sql = "select * from producto where id_Producto=" + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            outputStream = reponse.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next());
            {
                inputStream = rs.getBinaryStream("imagProducto");

            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;

            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);

            }
        } catch (Exception e) {

        }

    }
  /* public void agregar(Producto p){
        String sql="insert into producto (id_producto, imagen_producto, nombre_producto, precio) values(NULL,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setBlob(1, p.getImagProducto());
            ps.setString(2, p.getNomProducto());
            ps.setInt(3, p.getPrecio());
            ps.executeUpdate();
            
        }catch (Exception e){
            
        }
    }*/
}