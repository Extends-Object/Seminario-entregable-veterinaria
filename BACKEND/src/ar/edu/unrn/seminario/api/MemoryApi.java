package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.exception.AnimalExistsInArrayException;
import ar.edu.unrn.seminario.modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MemoryApi implements IApi {
	
	//ATRIBUTO
	private Set<Animal> listaAnimales = new TreeSet <Animal>();
	
	//CONSTRUCTOR
	public MemoryApi(){
		
		Set<Animal> listaAnimales = new TreeSet <Animal>();
		this.listaAnimales = listaAnimales;
	}
	
	//METODOS
	public void borrarAnimal(int iD){
		for(Animal animal: listaAnimales){
			if(iD == animal.getID()){
				listaAnimales.remove(animal);
				break;
			}
		}		
	}
	
	public void modificarAnimal (int iD, String nombre, int edad, float peso, boolean estaCastrado, String caractParticulares){
		
		for(Animal animal: listaAnimales){
			if(iD == animal.getID()){
				animal.setNombre(nombre);
				animal.setEdad(edad);
				animal.setEstaCastrado(estaCastrado);
				animal.setPeso(peso);
				animal.setCaractParticulares(caractParticulares);
			}
		}	
	}

	@Override
	public void agregarAnimal(String nombre, String especie, String tamaño, String raza, LocalDate fechaNac, int edad,
			float peso, String sexo, boolean estaCastrado, String caractParticulares, int iD)
			throws AnimalExistsInArrayException {
		ArrayList <Vacuna> vacunas = new ArrayList <Vacuna>();
		LibretaSanitaria lb = new LibretaSanitaria(vacunas);
		Raza r = new Raza (raza, tamaño);
		Animal animal = new Animal(nombre, especie, r, fechaNac, peso, sexo, estaCastrado, caractParticulares, iD);
		
		animal.setLibretaSanitaria(lb);
		
		for(Animal a : listaAnimales){
			if(iD == a.getID()){
				throw new AnimalExistsInArrayException("Este ID ya esta registrado, ingrese un nuevo ID");
			} else {
				listaAnimales.add(animal);
			}
		}
		
	}
}
