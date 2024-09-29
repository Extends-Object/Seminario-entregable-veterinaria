package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prescripcion {
	private LocalDate creacion;
	private ArrayList <Droga> drogas;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int frecuenciaSuministro;
	
	
	public Prescripcion(LocalDate creacion, ArrayList<Droga> drogas, LocalDate fechaInicio, LocalDate fechaFin, int frecuenciaSuministro) {
		this.creacion = creacion;
		this.drogas = drogas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.frecuenciaSuministro = frecuenciaSuministro;
	}
	
	public void agregarDroga (Droga droga) {
		drogas.add(droga);
	}
	
	/*public boolean estaVigente () {
		LocalDate hoy = LocalDate.now();
		Period vencimiento = Period.between(hoy, fechaFin);
		if(hoy.getYear() <= fechaFin.getYear()) {
			if(hoy.getMonth()o)
		}
	}*/
	
}
	

