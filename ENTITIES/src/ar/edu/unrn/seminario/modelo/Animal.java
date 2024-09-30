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
	public Animal(String nombre, String especie, Raza raza, LocalDate fechaNac, float peso, String sexo, boolean estaCastrado, String caractParticulares) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.fechaNac = fechaNac;
		this.peso = peso;
		this.sexo = sexo;
		this.estaCastrado = estaCastrado;
		this.caractParticulares = caractParticulares;
		calcularEdad();
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
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isEstaCastrado() {
		return estaCastrado;
	}

	public void setEstaCastrado(boolean estaCastrado) {
		this.estaCastrado = estaCastrado;
	}

	public LibretaSanitaria getLibretaSanitaria() {
		return libretaSanitaria;
	}

	public void setLibretaSanitaria(LibretaSanitaria libretaSanitaria) {
		this.libretaSanitaria = libretaSanitaria;
	}

	public String getCaractParticulares() {
		return caractParticulares;
	}

	public void setCaractParticulares(String caractParticulares) {
		this.caractParticulares = caractParticulares;
	}
	
	
	
	
}
