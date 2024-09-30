package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class DiagnosticoDTO {
    private LocalDate fecha;
    private String provisional;
    private String diferencial;
    private String definitivo;
    private TratamientoDTO tratamiento; // Suponiendo que también tienes un TratamientoDTO
    private ArrayList<PrescripcionDTO> prescripciones; // Y un DTO para Prescripcion
    private ArrayList<EstudioDTO> estudios; // Y un DTO para Estudio

    // Constructor
    public DiagnosticoDTO(LocalDate fecha, String provisional, String diferencial, String definitivo, 
                          TratamientoDTO tratamiento, ArrayList<PrescripcionDTO> prescripciones, 
                          ArrayList<EstudioDTO> estudios) {
        this.fecha = fecha;
        this.provisional = provisional;
        this.diferencial = diferencial;
        this.definitivo = definitivo;
        this.tratamiento = tratamiento;
        this.prescripciones = prescripciones;
        this.estudios = estudios;
    }

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProvisional() {
        return provisional;
    }

    public void setProvisional(String provisional) {
        this.provisional = provisional;
    }

    public String getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(String diferencial) {
        this.diferencial = diferencial;
    }

    public String getDefinitivo() {
        return definitivo;
    }

    public void setDefinitivo(String definitivo) {
        this.definitivo = definitivo;
    }

    public TratamientoDTO getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(TratamientoDTO tratamiento) {
        this.tratamiento = tratamiento;
    }

    public ArrayList<PrescripcionDTO> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(ArrayList<PrescripcionDTO> prescripciones) {
        this.prescripciones = prescripciones;
    }

    public ArrayList<EstudioDTO> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<EstudioDTO> estudios) {
        this.estudios = estudios;
    }
}
