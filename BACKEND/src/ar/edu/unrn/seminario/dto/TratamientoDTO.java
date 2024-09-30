package ar.edu.unrn.seminario.dto;

public class TratamientoDTO {
    private String tipo;
    private String planSeguimiento;
    private String monitoreoRespuesta;

    // Constructor
    public TratamientoDTO(String tipo, String planSeguimiento, String monitoreoRespuesta) {
        this.tipo = tipo;
        this.planSeguimiento = planSeguimiento;
        this.monitoreoRespuesta = monitoreoRespuesta;
    }

    // Getters y Setters
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