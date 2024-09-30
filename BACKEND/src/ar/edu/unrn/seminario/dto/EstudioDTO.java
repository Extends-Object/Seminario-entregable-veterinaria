package ar.edu.unrn.seminario.dto;

public class EstudioDTO {
    private String tipo; // Extracción, por imágenes
    private String resultado;
    private boolean estaPendiente;

    // Constructor
    public EstudioDTO(String tipo, String resultado, boolean estaPendiente) {
        this.tipo = tipo;
        this.resultado = resultado;
        this.estaPendiente = estaPendiente;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean isEstaPendiente() {
        return estaPendiente;
    }

    public void setEstaPendiente(boolean estaPendiente) {
        this.estaPendiente = estaPendiente;
    }
}