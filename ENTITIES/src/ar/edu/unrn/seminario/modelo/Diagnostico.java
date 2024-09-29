package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diagnostico {
	private LocalDate fecha;
	private String provisional;  //sintomas
	private String diferencial;  //posibles condiciones
	private String definitivo;  //luego de pruebas fisicas
	
	private Tratamiento tratamiento;
	private ArrayList <Prescripcion> prescripciones;
	private ArrayList <Estudio> estudios;
	public Diagnostico(LocalDate fecha, String provisional, String diferencial) {
		this.fecha = fecha;
		this.provisional = provisional;
		this.diferencial = diferencial;
	}
	
	public void agregarTratamiento (Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public void agregarPrescripcion (Prescripcion prescripcion) {
		prescripciones.add(prescripcion);
	}
	
	public void agregarEstudio(Estudio estudio) {
		estudios.add(estudio);
	}
	
}
