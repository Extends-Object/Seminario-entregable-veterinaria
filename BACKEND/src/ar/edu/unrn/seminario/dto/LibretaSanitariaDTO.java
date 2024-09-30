package ar.edu.unrn.seminario.dto;

import java.util.ArrayList;

public class LibretaSanitariaDTO {
    private ArrayList<VacunaDTO> listaVacunas;

    public LibretaSanitariaDTO(ArrayList<VacunaDTO> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }

    public ArrayList<VacunaDTO> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(ArrayList<VacunaDTO> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }
}