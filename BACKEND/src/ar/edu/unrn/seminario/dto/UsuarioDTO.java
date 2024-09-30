package ar.edu.unrn.seminario.dto;

public class UsuarioDTO {
    private String nombre;
    private String apellido;
    private String email;

    public UsuarioDTO(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
}