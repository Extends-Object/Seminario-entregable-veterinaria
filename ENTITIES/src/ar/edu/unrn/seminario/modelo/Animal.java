package ar.edu.unrn.seminario.modelo;

import java.time.LocalDate;
import java.time.Period;

public class Animal {
	String nombre;
	String especie;
	Raza raza;
	LocalDate fechaNac;
	int edad;
	float peso;
	String sexo;
	boolean estaCastrado;
	LibretaSanitaria libretaSanitaria;
	String caractParticulares;
	
	//CONSTRUCTORES
	public Animal(String nombre, String especie, Raza raza, LocalDate fechaNac, float peso, String sexo, boolean estaCastrado, String caractParticulares, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.fechaNac = fechaNac;
		this.peso = peso;
		this.sexo = sexo;
		this.estaCastrado = estaCastrado;
		this.caractParticulares = caractParticulares;
		this.edad = edad;
	}
	
	boolean consultarCastracion() 
	{
		return estaCastrado;
	}
	
	public int calcularEdad() 
	{
		LocalDate hoy = LocalDate.now();
		Period dias = Period.between(fechaNac, hoy);
		edad = dias.getYears();
		return edad;
	}
	
	
}
