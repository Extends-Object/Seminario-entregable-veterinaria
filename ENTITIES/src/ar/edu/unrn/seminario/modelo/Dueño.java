package ar.edu.unrn.seminario.modelo;

import java.util.ArrayList;

public class Dueño{
	private String nombre;
	private String apellido;
	private String email;
	private ArrayList <Animal> listaAnimales;
	private String direccion;
	
	public Dueño (String nombre, String apellido, String email, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
	}
	
	
	public void agregarAnimal(Animal animal) {
		listaAnimales.add(animal);
		System.out.println("Animal agregado: " + animal.getNombre());
	}
	
	public void eliminarAnimal(Animal animal) {
		if (listaAnimales.remove(animal)) {
            System.out.println("Animal eliminado");
        } else {
            System.out.println("El animal no se encontró en la lista");
        }
	}
	
	public Animal buscarAnimal (String nombre) {
		for (Animal animal : listaAnimales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                return animal;
            }
        }
        System.out.println("Animal no encontrado");
        return null;
	}

	public ArrayList <Animal> listarAnimales () {
		return this.listaAnimales;
	}
	
	
	//--------------------------------------------------------
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ArrayList<Animal> getListaAnimales() {
		return listaAnimales;
	}


	public void setListaAnimales(ArrayList<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
