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
		//this.numeroDosisActual = 0;
	}
	
	public int consultarDosisFaltantes() 
	{
		int dosisFaltantes;
		dosisFaltantes = numeroDosisTotal - numeroDosisActual;
		return dosisFaltantes;
	}
	
	public void registrarNuevaDosis() 
	{
		this.numeroDosisActual++;
	}
	
	public boolean necesitaRefuerzo() {
		//consultar esquema
		return necesita;
	}
	
}
