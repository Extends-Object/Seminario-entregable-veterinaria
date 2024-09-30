package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;

public class Vacuna {
	LocalDate fechaAplicacion;
	int numeroDosisTotal;
	int numeroDosisActual;
	Droga droga;
	String lote;
	String nombre;
	float cantidadSuministrada; //ml o unidades
	String esquema; //inicial, refuerzo, serie
	LocalDate proximaDosis;
	String observaciones;
	
	
	public Vacuna(LocalDate fechaAplicacion, int numeroDosisTotal, Droga droga, String lote, String nombre,
			float cantidadSuministrada, String esquema, LocalDate proximaDosis, String observaciones) {
		this.fechaAplicacion = fechaAplicacion;
		this.numeroDosisTotal = numeroDosisTotal;
		this.droga = droga;
		this.lote = lote;
		this.nombre = nombre;
		this.cantidadSuministrada = cantidadSuministrada;
		this.esquema = esquema;
		this.proximaDosis = proximaDosis;
		this.observaciones = observaciones;
		this.numeroDosisActual = 0;
	}
	
	public int consultarDosisFaltantes() 
	{
		return numeroDosisTotal - numeroDosisActual;
	}
	
	public void registrarNuevaDosis() 
	{
		if (numeroDosisActual < numeroDosisTotal) {
            this.numeroDosisActual++;
            System.out.println("Dosis actual: " + numeroDosisActual);
        }
	}
	
	/*public boolean necesitaRefuerzo() {
		//consultar esquema
		return necesita;
	}*/

	public LocalDate getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(LocalDate fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public int getNumeroDosisTotal() {
		return numeroDosisTotal;
	}

	public void setNumeroDosisTotal(int numeroDosisTotal) {
		this.numeroDosisTotal = numeroDosisTotal;
	}

	public int getNumeroDosisActual() {
		return numeroDosisActual;
	}

	public void setNumeroDosisActual(int numeroDosisActual) {
		this.numeroDosisActual = numeroDosisActual;
	}

	public Droga getDroga() {
		return droga;
	}

	public void setDroga(Droga droga) {
		this.droga = droga;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCantidadSuministrada() {
		return cantidadSuministrada;
	}

	public void setCantidadSuministrada(float cantidadSuministrada) {
		this.cantidadSuministrada = cantidadSuministrada;
	}

	public String getEsquema() {
		return esquema;
	}

	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}

	public LocalDate getProximaDosis() {
		return proximaDosis;
	}

	public void setProximaDosis(LocalDate proximaDosis) {
		this.proximaDosis = proximaDosis;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
