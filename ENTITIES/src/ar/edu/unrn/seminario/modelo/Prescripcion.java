package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prescripcion {
	private LocalDate creacion;
	private ArrayList<Droga> drogas;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int frecuenciaSuministro;

	public Prescripcion(LocalDate creacion, ArrayList<Droga> drogas, LocalDate fechaInicio, LocalDate fechaFin,
			int frecuenciaSuministro) {
		this.creacion = creacion;
		this.drogas = drogas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.frecuenciaSuministro = frecuenciaSuministro;
	}

	public void agregarDroga(Droga droga) {
		drogas.add(droga);
		System.out.println("Droga agregada");
	}

	public boolean estaVigente() {
        LocalDate hoy = LocalDate.now();
        return (hoy.isAfter(fechaInicio) || hoy.isEqual(fechaInicio)) && 
               (hoy.isBefore(fechaFin)   || hoy.isEqual(fechaFin));
    }
	
	public void mostrarInformacionPrescripcion() {
        System.out.println("Fecha de creación: " + creacion);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Frecuencia de suministro: " + frecuenciaSuministro + " horas");
        System.out.println("Drogas prescritas:");
        for (Droga droga : drogas) {
            droga.mostrarInformacionDroga();
        }
    }

	public LocalDate getCreacion() {
		return creacion;
	}

	public void setCreacion(LocalDate creacion) {
		this.creacion = creacion;
	}

	public ArrayList<Droga> getDrogas() {
		return drogas;
	}

	public void setDrogas(ArrayList<Droga> drogas) {
		this.drogas = drogas;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getFrecuenciaSuministro() {
		return frecuenciaSuministro;
	}

	public void setFrecuenciaSuministro(int frecuenciaSuministro) {
		this.frecuenciaSuministro = frecuenciaSuministro;
	}
}
