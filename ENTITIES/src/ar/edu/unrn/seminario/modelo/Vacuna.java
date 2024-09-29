package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;

public class Vacuna {
	LocalDate fechaAplicacion;
	int numeroDosis;
	int numeroDosisActuales;
	Droga droga;
	String lote;
	String nombre;
	float cantidadSuministrada;
	String esquema;
	LocalDate proximaDosis;
	String observaciones;
	
	
	public Vacuna(LocalDate fechaAplicacion, int numeroDosis, Droga droga, String lote, String nombre,
			float cantidadSuministrada, String esquema, LocalDate proximaDosis, String observaciones) {
		this.fechaAplicacion = fechaAplicacion;
		this.numeroDosis = numeroDosis;
		this.droga = droga;
		this.lote = lote;
		this.nombre = nombre;
		this.cantidadSuministrada = cantidadSuministrada;
		this.esquema = esquema;
		this.proximaDosis = proximaDosis;
		this.observaciones = observaciones;
		this.numeroDosisActuales = 0;
	}
	
	public int consultarDosisFaltantes() 
	{
		int dosisFaltantes;
		dosisFaltantes = numeroDosis - numeroDosisActuales;
		return dosisFaltantes;
	}
	
	public void registrarNuevaDosis() 
	{
		this.numeroDosisActuales++;
	}
	
	
}
