package ar.edu.unrn.seminario.modelo;

public class Droga {
	
	String nombreGenerico;
	String nombreComercial;
	String principioActivo;
	String viaAdministracion; //intramuscular, subcutanea, oral
	int frecuenciaSuministroHS;
	
	public Droga(String nombreGenerico, String nombreComercial, String principioActivo, String viaAdministracion, int frecuenciaSuministroHS) {
		this.nombreGenerico = nombreGenerico;
		this.nombreComercial = nombreComercial;
		this.principioActivo = principioActivo;
		this.viaAdministracion = viaAdministracion;
		this.frecuenciaSuministroHS = frecuenciaSuministroHS;
	}
	
	public void mostrarInformacionDroga() {
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Comercial: " + nombreComercial);
        System.out.println("Principio Activo: " + principioActivo);
        System.out.println("Vía de Administración: " + viaAdministracion);
        System.out.println("Frecuencia de Suministro (HS): " + frecuenciaSuministroHS);
    }

	public String getNombreGenerico() {
		return nombreGenerico;
	}

	public void setNombreGenerico(String nombreGenerico) {
		this.nombreGenerico = nombreGenerico;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getPrincipioActivo() {
		return principioActivo;
	}

	public void setPrincipioActivo(String principioActivo) {
		this.principioActivo = principioActivo;
	}

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	public int getFrecuenciaSuministroHS() {
		return frecuenciaSuministroHS;
	}

	public void setFrecuenciaSuministroHS(int frecuenciaSuministroHS) {
		this.frecuenciaSuministroHS = frecuenciaSuministroHS;
	}
}
