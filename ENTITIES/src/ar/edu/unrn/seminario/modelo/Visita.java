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
	
	public void mostrarInformacionVisita() {
        System.out.println("Fecha de la Visita: " + fecha);
        System.out.println("Veterinario: " + veterinario.getNombre());
        System.out.println("Animal Atendido: " + animalAtendido.getNombre());
        System.out.println("Motivo: " + motivo);
        System.out.println("Diagnóstico: " + diagnostico.getDiferencial());
        System.out.println("Notas Adicionales: " + (notasAdicionales != null ? notasAdicionales : "Ninguna"));
    }

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Animal getAnimalAtendido() {
		return animalAtendido;
	}

	public void setAnimalAtendido(Animal animalAtendido) {
		this.animalAtendido = animalAtendido;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getNotasAdicionales() {
		return notasAdicionales;
	}

	public void setNotasAdicionales(String notasAdicionales) {
		this.notasAdicionales = notasAdicionales;
	}
}
