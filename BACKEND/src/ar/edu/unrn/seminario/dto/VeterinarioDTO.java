package ar.edu.unrn.seminario.dto;

public class VeterinarioDTO {
    private String nombre;
    private String apellido;
    private String email;
    private int matricula;
    private VeterinariaDTO veterinariaAtiende;

    public VeterinarioDTO(String nombre, String apellido, String email, int matricula, VeterinariaDTO veterinariaAtiende) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.matricula = matricula;
        this.veterinariaAtiende = veterinariaAtiende;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }

    public VeterinariaDTO getVeterinariaAtiende() {
        return veterinariaAtiende;
    }
}