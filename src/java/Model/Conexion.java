package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Creación de las variables para la conexión
    private Connection con;
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "Caterpillar?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    // Aqui se define el constructor para la clase Conexion
    public Connection getConexion() {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.err.println("ERROR " + e);
        } catch (SQLException e) {
            System.err.println("ERROR " + e);
        }
    

   
        return con;

    }

}
