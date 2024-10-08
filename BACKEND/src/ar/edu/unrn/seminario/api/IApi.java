package ar.edu.unrn.seminario.api;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unrn.seminario.dto.EspecieDTO;
import ar.edu.unrn.seminario.dto.RazaDTO;
import ar.edu.unrn.seminario.exception.AnimalExistsInArrayException;

public interface IApi {
	
	public void agregarAnimal(String nombre, String especie, String tamaño, String raza, LocalDate fechaNac, int edad, float peso, String sexo, boolean estaCastrado, String caractParticulares, int iD) throws AnimalExistsInArrayException;
	
	public void borrarAnimal(int iD);
	
	public void modificarAnimal(int iD, String nombre, int edad, float peso, boolean estaCastrado, String caractParticulares);

	public ArrayList<RazaDTO> obtenerRazas(String especie);
	
	public ArrayList<EspecieDTO> obtenerEspecies();
	
}