package ar.edu.unrn.seminario.modelo;

public class Veterinario{
	private String nombre;
	private String apellido;
	private String email;
	private Veterinaria veterinariaAtiende;
	private int matricula;
	
	public Veterinario (String nombre, String apellido, String email, Veterinaria veterinariaAtiende, int matricula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.veterinariaAtiende = veterinariaAtiende;
		this.matricula = matricula;
		
	}
	
	public void mostrarInformacionVeterinario() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Veterinaria: ");
        veterinariaAtiende.mostrarContacto();
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Veterinaria getVeterinariaAtiende() {
		return veterinariaAtiende;
	}

	public void setVeterinariaAtiende(Veterinaria veterinariaAtiende) {
		this.veterinariaAtiende = veterinariaAtiende;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
