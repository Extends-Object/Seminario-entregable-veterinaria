package ar.edu.unrn.seminario.modelo;

public class Droga {
	
	String nombreGenerico;
	String nombreComercial;
	String principioActivo;
	String viaAdministracion;
	int frecuenciaSuministroHS;
	
	public Droga(String nombreGenerico, String nombreComercial, String principioActivo, String viaAdministracion, int frecuenciaSuministroHS) {
		this.nombreGenerico = nombreGenerico;
		this.nombreComercial = nombreComercial;
		this.principioActivo = principioActivo;
		this.viaAdministracion = viaAdministracion;
		this.frecuenciaSuministroHS = frecuenciaSuministroHS;
	}
	
	public mostrarInformacionDroga () {
		System.out.println();
	}
	
}
