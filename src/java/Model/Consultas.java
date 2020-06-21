package Model;

import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas extends Conexion  {

    //Metodo para iniciar sesion
    public String autenticacion(String usuario, String password) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select * from usuario where numero_Documento = ? and Contrasenia = ?";
            pst = getConexion().prepareStatement(consulta);
            //preparar las variables
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();

            String nombre = "";

            if (rs.absolute(1)) {

                nombre = "" + rs.getString(3) + " " + rs.getString(4);
                System.out.println(nombre);
                return nombre;

            }

        } catch (Exception e) {
            System.err.println("Error" + e);

        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }

        return "";
    }
    
    //Metodo para registrar usuario
    public boolean registrarUsuario(String numeroDocumento, String nombres, String apellidos, String correo, String contrasenia, String estado,String tipoDocumentoId ) {

        PreparedStatement pst = null;
        try {

            String sql = "INSERT INTO Caterpillar.usuario (id_usuario,numero_documento,nombres,apellidos,correo,contrasenia,tipo_documento_id) VALUES(NULL,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, numeroDocumento);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, correo);
            pst.setString(5, contrasenia);
            pst.setString(6, tipoDocumentoId);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
        return false;
         }
       
        
   

    //Metodo para eliminar usuarios
    public boolean eliminarUsuario(String numeroDoc) {

        PreparedStatement pst = null;
        try {
            String sql = "DELETE FROM Caterpillar.usuario WHERE numero_documento= ?";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, numeroDoc);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    /*public static void main (String[] args) {
        
            Consultas con= new Consultas();
            
            con.eliminarUsuario("1001823866");}*/

    //Metodo para actualizar usuario
    public boolean actualizarUsuario(String numeroDoc, String nombres, String apellidos, String correo,  String tipoDocumentoId, String numerodoc1 ) {

        PreparedStatement pst = null;
        try {

            String sql = "UPDATE usuario SET numero_documento= ?, nombres= ?, apellidos= ?, correo= ?, tipo_Documento_id= ? WHERE numero_documento= ?;";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, numeroDoc);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, correo);
            pst.setString(5, tipoDocumentoId);
            pst.setString(6, numeroDoc);
            

            if (pst.executeUpdate() == 1) {
                return true;

            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }

        return false;
    }
    
       public static void main (String[] args) {
           Consultas con= new Consultas();
           con.actualizarUsuario("1001823866", "Alfonso", "botia Alviz", "alfonso@mimail.com","3","1001823866");
        }

       

    //Metodo para registrar tipo de documento
    public boolean registrarDocumento(String inicial, String nombreDocumento, String estadoTipoDoc) {

        PreparedStatement pst = null;

        try {
            String sql = "INSERT INTO tipo_Documento VALUES(NULL,?,?,?);";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, inicial);
            pst.setString(2, nombreDocumento);
            pst.setString(3, estadoTipoDoc);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }

        return false;
    }
       

    //Metodo para actualizar documento
    public boolean actualizarDocumento(String inicial, String nombreDocumento, String estadoTipoDoc) {

        PreparedStatement pst = null;
        String sql = "update inicial set inicial= ?, nombre_documento= ? where estado_tipo_documento= ?;";
        try {
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, inicial);
            pst.setString(2, nombreDocumento);
            pst.setString(3, estadoTipoDoc);
            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }

        return false;
    }

    //Metodo para eliminar documento
    public boolean eliminarDocumento(String sigla) {

        PreparedStatement pst = null;

        try {

            String consulta = "delete from tipo_documento where sigla= ?;";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, sigla);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        }

        return false;
    }

}

    



    

