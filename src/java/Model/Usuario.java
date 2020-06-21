
package Model;

public class Usuario {
    
   String numDoc;
   String nombres;  
   String apellidos;
   String correo;       
   String contrasenia;             
   String tipoDoc;

    public Usuario() {
    }

    public Usuario(String numDoc, String nombres, String apellidos, String correo, String contrasenia, String estado, String tipoDoc) {
        this.numDoc = numDoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
   
   
           
}
