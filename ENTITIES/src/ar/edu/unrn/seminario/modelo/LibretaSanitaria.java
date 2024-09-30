package ar.edu.unrn.seminario.modelo;

import java.util.ArrayList;

public class LibretaSanitaria {
	ArrayList<Vacuna> listaVacunas;

	public LibretaSanitaria() {
		this.listaVacunas = new ArrayList<Vacuna>(); // Inicializar vacia
	}
	
	public LibretaSanitaria(ArrayList<Vacuna> listaVacunas) {
		this.listaVacunas = listaVacunas;
	}
	
	public void agregarVaguna (Vacuna vacuna) {
		listaVacunas.add(vacuna);
        System.out.println("Vacuna agregada: " + vacuna.getNombre());
	}
	
	public boolean fueAplicada(Vacuna vacuna) {
		return listaVacunas.contains(vacuna);
    }
	
	public void mostrarVacunas() {
        System.out.println("Lista de Vacunas:");
        for (Vacuna vacuna : listaVacunas) {
            System.out.println("- " + vacuna.getNombre());
        }
    }

	public ArrayList<Vacuna> getListaVacunas() {
		return listaVacunas;
	}

	public void setListaVacunas(ArrayList<Vacuna> listaVacunas) {
		this.listaVacunas = listaVacunas;
	}
}