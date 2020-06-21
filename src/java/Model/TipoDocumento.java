package Model;

public class TipoDocumento {

    private String inicial;
    private String nombreDocumento;
    private String estadoTipoDocumento;

    public TipoDocumento() {
    }

    public TipoDocumento(String inicial, String nombreDocumento, String estadoTipoDocumento) {
        this.inicial = inicial;
        this.nombreDocumento = nombreDocumento;
        this.estadoTipoDocumento = estadoTipoDocumento;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDcoumento) {
        this.nombreDocumento = nombreDcoumento;
    }

    public String getEstadoTipoDocumento() {
        return estadoTipoDocumento;
    }

    public void setEstadoTipoDocumento(String estadoTipoDocumento) {
        this.estadoTipoDocumento = estadoTipoDocumento;
    }

   
    
    
}
