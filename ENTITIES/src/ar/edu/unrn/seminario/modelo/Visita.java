package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;

public class Visita {
	private LocalDate fecha;
	private Veterinario veterinario;
	private Animal animalAtendido;
	private String motivo;
	private Diagnostico diagnostico;
	private String notasAdicionales;
	
	
	
	public Visita(LocalDate fecha, Veterinario veterinario, Animal animalAtendido, String motivo, Diagnostico diagnostico) {
		this.fecha = fecha;
		this.veterinario = veterinario;
		this.animalAtendido = animalAtendido;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
	}
	
	
	public void agregarNotasAdicionales(String notas) {
		this.notasAdicionales = notas;
	}

}
