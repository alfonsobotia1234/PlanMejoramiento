package Controller.AlquilerDao;

import Model.Conexion;
import Controller.CarritoDao.Carrito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class AlquilerDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pst;
    ResultSet rs;
    int res = 0;

    public int generarAlquiler(Alquiler alquiler) {
        System.out.println("Controller.AlquilerDao.AlquilerDAO.generarAlquiler()");
        int codigo_alquiler;
        String sql = "INSERT INTO alquiler (precio_alquiler,fecha_alquiler,fecha_devolucion,usuario_id) VALUES (?,?,?,?)";
        try {
            con = cn.getConexion();
            pst = con.prepareStatement(sql);
            pst.setInt(1, alquiler.getPrecio_alquiler());
            pst.setString(2, alquiler.getFecha_alquiler());
            pst.setString(3, alquiler.getFecha_devolucion());
            pst.setInt(4, alquiler.getid_usuario());
            res = pst.executeUpdate();

            
            ///****
            sql = "SELECT @@IDENTITY AS id_alquiler";
            rs = pst.executeQuery(sql);
            rs.next();
            codigo_alquiler = rs.getInt("id_alquiler");
            rs.close();

            for (Carrito c : alquiler.getProductos()) {
                sql = "INSERT INTO alquiler_productos VALUES (?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, c.getId_producto());
                pst.setInt(2, codigo_alquiler);
                res = pst.executeUpdate();
                System.out.println("Controller.AlquilerDao.AlquilerDAO.generarAlquiler()");

            }
        } catch (SQLException e) {
            
            System.out.println("Controller.AlquilerDao.AlquilerDAO.generarAlquiler( Exxecption " + e);
        }

        return res;
    }

}
