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
	
	

}
