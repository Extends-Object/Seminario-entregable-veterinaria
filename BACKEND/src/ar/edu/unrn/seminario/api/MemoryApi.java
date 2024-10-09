package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.dto.EspecieDTO;
import ar.edu.unrn.seminario.dto.RazaDTO;
import ar.edu.unrn.seminario.exception.AnimalExistsInArrayException;
import ar.edu.unrn.seminario.modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MemoryApi implements IApi {
	
	//ATRIBUTO
	private Set <Animal> listaAnimales = new TreeSet <Animal>();
	
	
	private ArrayList <Raza> listaRazas = new ArrayList <Raza>();
	private ArrayList <Especie> listaEspecies = new ArrayList <Especie>();
	
	//CONSTRUCTOR
	public MemoryApi(){
		
		Set<Animal> listaAnimales = new TreeSet <Animal>();
		this.listaAnimales = listaAnimales;
		inicializarRazas();
	}
	
	//METODOS
	private void inicializarEspecies() {
		Especie e1 = new Especie ("Gato");
		Especie e2 = new Especie ("Perro");
		Especie e3 = new Especie ("Caballo");
		
		listaEspecies.add(e1);
		listaEspecies.add(e2);
		listaEspecies.add(e3);
		
	}
	
	private void inicializarRazas() {
		/*
		Raza r1 = new Raza ("Golden Retriever", "Grande");
		Raza r2 = new Raza ("Border Collie", "Grande");
		Raza r3 = new Raza ("Fox Terrier", "Mediano");
		Raza r4 = new Raza ("Chihuahua", "Pequeño");
		
		listaRazas.add(r1);
		listaRazas.add(r2);
		listaRazas.add(r3);
		listaRazas.add(r4);
	*/
	}


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
	
	public void agregarAnimal(String nombre, String fechaNac, String peso, String sexo, String caractParticulares,
			boolean estaCastrado) {
		
		//AGREGAR LA LOGICA
	}
	

	@Override
	public ArrayList <RazaDTO> obtenerRazas(String especie) {
		ArrayList <RazaDTO> razasDTO = new ArrayList <RazaDTO>();
		for(Raza raza : listaRazas) {
			if (raza.getEspecie().equals(especie)) {
	            razasDTO.add(new RazaDTO(raza.getNombre(), raza.getTamaño()));
	        }
		}
		return razasDTO;
	}


	@Override
	public ArrayList <EspecieDTO> obtenerEspecies() {			//LA LISTA DE LA MEMORY API TIENE ESPECIES DEL DOMINIO
		ArrayList<EspecieDTO> especiesDTO = new ArrayList<>();	//SE DDEBEN CONVERTIR A LISTA DE ESPECIES DTO
	    for (Especie especie : listaEspecies) {					//SE LEEN DE LA LISTA
	        especiesDTO.add(new EspecieDTO(especie.getTipo()));	//getTipo retorna un String que va al constructor de la
	    }														//especieDTO, se crea y se agrega a la lista DTO
	    return especiesDTO;										//SE RETORNA LA LISTA DTO
	}
	
}
