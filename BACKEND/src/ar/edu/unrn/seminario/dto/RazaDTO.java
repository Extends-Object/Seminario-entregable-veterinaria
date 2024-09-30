package ar.edu.unrn.seminario.dto;

public class RazaDTO {
    private String nombre;
    private String tamaño;

    // Constructor
    public RazaDTO(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}