package ar.edu.unrn.seminario.dto;

public class VeterinariaDTO {
    private String direccion;
    private int codArea;
    private int numeroTel;

    // Constructor
    public VeterinariaDTO(String direccion, int codArea, int numeroTel) {
        this.direccion = direccion;
        this.codArea = codArea;
        this.numeroTel = numeroTel;
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
}