package ar.edu.unrn.seminario.dto;

public class DrogaDTO {
    private String nombreGenerico;
    private String nombreComercial;
    private String principioActivo;
    private String viaAdministracion; // intramuscular, subcutánea, oral
    private int frecuenciaSuministroHS;

    // Constructor
    public DrogaDTO(String nombreGenerico, String nombreComercial, String principioActivo, String viaAdministracion, int frecuenciaSuministroHS) {
        this.nombreGenerico = nombreGenerico;
        this.nombreComercial = nombreComercial;
        this.principioActivo = principioActivo;
        this.viaAdministracion = viaAdministracion;
        this.frecuenciaSuministroHS = frecuenciaSuministroHS;
    }

    // Getters y Setters
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