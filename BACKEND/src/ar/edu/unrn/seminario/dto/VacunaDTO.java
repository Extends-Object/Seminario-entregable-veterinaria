package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;

public class VacunaDTO {
    private LocalDate fechaAplicacion;
    private int numeroDosisTotal;
    private int numeroDosisActual;
    private String drogaNombre; // Solo el nombre de la droga para simplificar
    private String lote;
    private String nombre;
    private float cantidadSuministrada; // ml o unidades
    private String esquema; // inicial, refuerzo, serie
    private LocalDate proximaDosis;
    private String observaciones;

    public VacunaDTO(LocalDate fechaAplicacion, int numeroDosisTotal, int numeroDosisActual, String drogaNombre,
                     String lote, String nombre, float cantidadSuministrada, String esquema,
                     LocalDate proximaDosis, String observaciones) {
        this.fechaAplicacion = fechaAplicacion;
        this.numeroDosisTotal = numeroDosisTotal;
        this.numeroDosisActual = numeroDosisActual;
        this.drogaNombre = drogaNombre;
        this.lote = lote;
        this.nombre = nombre;
        this.cantidadSuministrada = cantidadSuministrada;
        this.esquema = esquema;
        this.proximaDosis = proximaDosis;
        this.observaciones = observaciones;
    }

    // Getters y Setters
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

    public String getDrogaNombre() {
        return drogaNombre;
    }

    public void setDrogaNombre(String drogaNombre) {
        this.drogaNombre = drogaNombre;
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