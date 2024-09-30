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
	
	public void mostrarInformacionTratamiento() {
        System.out.println("Tipo de Tratamiento: " + tipo);
        System.out.println("Plan de Seguimiento: " + planSeguimiento);
        System.out.println("Monitoreo de Respuesta: " + monitoreoRespuesta);
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlanSeguimiento() {
		return planSeguimiento;
	}

	public void setPlanSeguimiento(String planSeguimiento) {
		this.planSeguimiento = planSeguimiento;
	}

	public String getMonitoreoRespuesta() {
		return monitoreoRespuesta;
	}

	public void setMonitoreoRespuesta(String monitoreoRespuesta) {
		this.monitoreoRespuesta = monitoreoRespuesta;
	}
}
