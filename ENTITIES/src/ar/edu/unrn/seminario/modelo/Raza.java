package ar.edu.unrn.seminario.modelo;

public class Raza {
	String nombre;
	String tamaño;
	
	
	public Raza(String nombre, String tamaño) {
		this.nombre = nombre;
		this.tamaño = tamaño;
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
}
