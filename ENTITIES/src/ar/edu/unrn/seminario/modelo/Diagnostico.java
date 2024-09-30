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
		this.prescripciones = new ArrayList<Prescripcion>();  // Inicializar la lista de prescripciones
        this.estudios = new ArrayList<Estudio>();        // Inicializar la lista de estudios
	}
	
	public void agregarTratamiento (Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
		System.out.println("Tratamiento agregado");
	}
	
	public void agregarPrescripcion (Prescripcion prescripcion) {
		prescripciones.add(prescripcion);
		System.out.println("Prescripción agregada");
	}
	
	public void agregarEstudio(Estudio estudio) {
		estudios.add(estudio);
		System.out.println("Estudio agregado");
	}
	
	public void mostrarInformacionDiagnostico() {
        System.out.println("Fecha del Diagnóstico: " + fecha);
        System.out.println("Diagnóstico Provisional: " + provisional);
        System.out.println("Diagnóstico Diferencial: " + diferencial);
        System.out.println("Tratamiento: " + tratamiento.getTipo());
        System.out.println("Número de Prescripciones: " + prescripciones.size());
        System.out.println("Número de Estudios: " + estudios.size());
    }

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getProvisional() {
		return provisional;
	}

	public void setProvisional(String provisional) {
		this.provisional = provisional;
	}

	public String getDiferencial() {
		return diferencial;
	}

	public void setDiferencial(String diferencial) {
		this.diferencial = diferencial;
	}

	public String getDefinitivo() {
		return definitivo;
	}

	public void setDefinitivo(String definitivo) {
		this.definitivo = definitivo;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	public ArrayList<Prescripcion> getPrescripciones() {
		return prescripciones;
	}

	public void setPrescripciones(ArrayList<Prescripcion> prescripciones) {
		this.prescripciones = prescripciones;
	}

	public ArrayList<Estudio> getEstudios() {
		return estudios;
	}

	public void setEstudios(ArrayList<Estudio> estudios) {
		this.estudios = estudios;
	}
}
