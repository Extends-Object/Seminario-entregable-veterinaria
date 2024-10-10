package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.dto.AnimalDTO;
import ar.edu.unrn.seminario.dto.EspecieDTO;
import ar.edu.unrn.seminario.dto.RazaDTO;
import ar.edu.unrn.seminario.exception.AnimalExistsInArrayException;
import ar.edu.unrn.seminario.modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MemoryApi implements IApi {

	// ATRIBUTOS
	private ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

	private ArrayList<Raza> listaRazas = new ArrayList<Raza>();
	

	//private ArrayList<Especie> listaEspecies = new ArrayList<Especie>();

	// CONSTRUCTOR
	public MemoryApi() {
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		this.listaAnimales = listaAnimales;
		inicializarRazas();
	}

	// METODOS-----------------------------------------------------------------------------------------------------------
	
	//INICIALIZAR LAS LISTAS DE ESPECIES Y RAZAS
	private void inicializarRazas() {
	    // Razas para Perro
	    listaRazas.add(new Raza("Labrador", "Grande", new Especie("Perro")));
	    listaRazas.add(new Raza("Caniche", "Mediano", new Especie("Perro")));
	    listaRazas.add(new Raza("Border Collie", "Mediano", new Especie("Perro")));
	    
	    // Razas para Gato
	    listaRazas.add(new Raza("Siames", "Pequeño", new Especie("Gato")));
	    listaRazas.add(new Raza("Khao Manee", "Pequeño", new Especie("Gato")));
	    listaRazas.add(new Raza("Australian Mist", "Pequeño", new Especie("Gato")));
	    
	    // Razas para Caballo
	    listaRazas.add(new Raza("Appaloosa", "Grande", new Especie("Caballo")));
	    listaRazas.add(new Raza("Konik", "Mediano", new Especie("Caballo")));
	    listaRazas.add(new Raza("Lipizzano", "Grande", new Especie("Caballo")));
	}
	
	//-----------------------------------------------------------------------------------------------------------------

	// AGREGAR UN ANIMAL A LA LISTA DE ANIMALES REGISTRADOS
	@Override
	public void agregarAnimal(String nombre, String tamaño, String raza, LocalDate fechaNac,float peso,
			String sexo, boolean estaCastrado, String caractParticulares, int iD) throws AnimalExistsInArrayException {

		// CREANDO AL ANIMAL CON LOS PARAMETROS RECIBIDOS
		//Especie e = new Especie(especie);
		Raza r = new Raza(raza, tamaño);
		Animal animal = new Animal(nombre, r, fechaNac, peso, sexo, estaCastrado, caractParticulares, iD);

		// CREACION DE LA LIBRETA DE VACUNAS
		ArrayList<Vacuna> vacunas = new ArrayList<Vacuna>();
		LibretaSanitaria ls = new LibretaSanitaria(vacunas);
		animal.setLibretaSanitaria(ls);
		
		//RECONOCIMIENTO DE LA EXCEPCION ID REPETIDO
		for (Animal a : listaAnimales) {
			if (iD == a.getID()) {
				throw new AnimalExistsInArrayException("Este ID ya esta registrado, ingrese un nuevo ID");
			} else {
				listaAnimales.add(animal);
			}
		}
	}

	// OBTENER LA LISTA DE RAZAS SEGUN LA ESPECIE
	@Override
	public ArrayList<RazaDTO> obtenerRazas(String especie) {
		ArrayList<RazaDTO> razasDTO = new ArrayList<RazaDTO>();
		for (Raza raza : listaRazas) {
			//if (raza.getEspecie().equals(especie)) {
				razasDTO.add(new RazaDTO(raza.getNombre(), raza.getTamaño()));
				//}
		}
		return razasDTO;
	}
	
	// OBTENER LA LISTA DE ESPECIES CARGADAS EN LA BASE
	@Override
	public ArrayList<EspecieDTO> obtenerEspecies() { // LA LISTA DE LA MEMORY API TIENE ESPECIES DEL DOMINIO
		ArrayList<EspecieDTO> especiesDTO = new ArrayList<>(); // SE DDEBEN CONVERTIR A LISTA DE ESPECIES DTO
		//for (Especie especie : listaEspecies) { // SE LEEN DE LA LISTA
		//	especiesDTO.add(new EspecieDTO(especie.getTipo())); // getTipo retorna un String que va al constructor de la
		} // especieDTO, se crea y se agrega a la lista DTO
		return null; // SE RETORNA LA LISTA DTO
	}
	
	//BORRAR UN ANIMAL REGISTRADO
	@Override
	public void borrarAnimal(int iD) {
		for (Animal animal : listaAnimales) {
			if (iD == animal.getID()) {
				listaAnimales.remove(animal);
				break;
			}
		}
	}
	
	//MODIFICAR UN ANIMAL REGISTRADO
	@Override
	public void modificarAnimal(int iD, String nombre, int edad, float peso, boolean estaCastrado,
			String caractParticulares) {
		for (Animal animal : listaAnimales) {
			if (iD == animal.getID()) {
				animal.setNombre(nombre);
				animal.setEdad(edad);
				animal.setEstaCastrado(estaCastrado);
				animal.setPeso(peso);
				animal.setCaractParticulares(caractParticulares);
			}
		}
	}
	
	//TRANSFORMAR UN ANIMAL A ANIMAL DTO
	@Override
	public ArrayList<AnimalDTO> animalToDTO() {
		ArrayList<AnimalDTO> listaAnimalDTO = new ArrayList<AnimalDTO> ();
		for(Animal animal : listaAnimales) {
			
			//CONVERTIR RAZA Y ESPECIE A RAZA Y ESPECIE DTO
			AnimalDTO a = new AnimalDTO (
		            animal.getNombre(),
		            //new EspecieDTO(animal.getEspecie().getTipo()),	//TANTO ESPECIE COMO RAZA SE TIENEN QUE CREAR EN DTO
		            new RazaDTO(animal.getRaza().getNombre(), animal.getRaza().getTamaño()),
		            animal.getFechaNac(),
		            animal.getEdad(),
		            animal.getPeso(), // CONVERTIR EL PESO A STRING
		            animal.getSexo(),
		            animal.estaCastrado(),
		            animal.getCaractParticulares()
		        );
			
			
			listaAnimalDTO.add(a);
		}
		return listaAnimalDTO;	//RETORNAMOS LA LISTA DE ANIMALES DTO
	}
	
	

}
