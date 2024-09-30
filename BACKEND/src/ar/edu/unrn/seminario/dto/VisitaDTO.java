package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;

public class VisitaDTO {
    private LocalDate fecha;
    private String veterinarioNombre;
    private String animalNombre;
    private String motivo;
    private String diagnosticoDiferencial;
    private String notasAdicionales;

    // Constructor
    public VisitaDTO(LocalDate fecha, String veterinarioNombre, String animalNombre, 
                     String motivo, String diagnosticoDiferencial, String notasAdicionales) {
        this.fecha = fecha;
        this.veterinarioNombre = veterinarioNombre;
        this.animalNombre = animalNombre;
        this.motivo = motivo;
        this.diagnosticoDiferencial = diagnosticoDiferencial;
        this.notasAdicionales = notasAdicionales;
    }

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinarioNombre() {
        return veterinarioNombre;
    }

    public void setVeterinarioNombre(String veterinarioNombre) {
        this.veterinarioNombre = veterinarioNombre;
    }

    public String getAnimalNombre() {
        return animalNombre;
    }

    public void setAnimalNombre(String animalNombre) {
        this.animalNombre = animalNombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnosticoDiferencial() {
        return diagnosticoDiferencial;
    }

    public void setDiagnosticoDiferencial(String diagnosticoDiferencial) {
        this.diagnosticoDiferencial = diagnosticoDiferencial;
    }

    public String getNotasAdicionales() {
        return notasAdicionales;
    }

    public void setNotasAdicionales(String notasAdicionales) {
        this.notasAdicionales = notasAdicionales;
    }
}
