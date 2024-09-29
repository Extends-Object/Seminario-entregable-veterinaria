package ar.edu.unrn.seminario.modelo;

import java.util.ArrayList;

public class Dueño {
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
}
