package ar.edu.unrn.seminario.modelo;

public class Raza {
	private String nombre;
	private String tamaño;
	private Especie especie;
	
	
	
	public Raza(String nombre, String tamaño, Especie especie) {
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.especie = especie;
	}
	
	public Raza(String nombre2, String tamaño2) {
		this.nombre = nombre2;
		this.tamaño = tamaño2;
	}

	public void mostrarInformacionRaza() {
        System.out.println("Nombre de la Raza: " + nombre);
        System.out.println("Tamaño: " + tamaño);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Especie getEspecie() {
		return this.especie;
	}
}
