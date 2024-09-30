package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrescripcionDTO {
    private LocalDate creacion;
    private ArrayList<DrogaDTO> drogas; // Suponiendo que tienes un DrogaDTO
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int frecuenciaSuministro;

    // Constructor
    public PrescripcionDTO(LocalDate creacion, ArrayList<DrogaDTO> drogas, LocalDate fechaInicio, LocalDate fechaFin,
                           int frecuenciaSuministro) {
        this.creacion = creacion;
        this.drogas = drogas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.frecuenciaSuministro = frecuenciaSuministro;
    }

    // Getters y Setters
    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public ArrayList<DrogaDTO> getDrogas() {
        return drogas;
    }

    public void setDrogas(ArrayList<DrogaDTO> drogas) {
        this.drogas = drogas;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getFrecuenciaSuministro() {
        return frecuenciaSuministro;
    }

    public void setFrecuenciaSuministro(int frecuenciaSuministro) {
        this.frecuenciaSuministro = frecuenciaSuministro;
    }
}