package ar.edu.unrn.seminario.modelo;

public class Tratamiento {
	private String tipo;
	private String planSeguimiento;
	private String monitoreoRespuesta;
	
	
	public Tratamiento (String tipo, String planSeguimiento, String monitoreoRespuesta) {
		this.tipo = tipo;
		this.planSeguimiento = planSeguimiento;
		this.monitoreoRespuesta = monitoreoRespuesta;
	}
	
	public void actualizarSegumiento(String actualizacion) {
		this.planSeguimiento = actualizacion;
	}

}
