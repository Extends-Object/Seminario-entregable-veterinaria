package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;

public class AnimalDTO {
    private String nombre;
    private EspecieDTO especie;
    private RazaDTO raza;
    private LocalDate fechaNac;
    private int edad;
    private String peso;
    private String sexo;
    private boolean estaCastrado;
    private String caractParticulares;

    // Constructor
    public AnimalDTO(String nombre, EspecieDTO especie, RazaDTO raza, LocalDate fechaNac, int edad,
                     String peso, String sexo, boolean estaCastrado, String caractParticulares) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.estaCastrado = estaCastrado;
        this.caractParticulares = caractParticulares;
    }

    public AnimalDTO(String nombre2, EspecieDTO especie2, RazaDTO raza2, LocalDate fechaNac2, String peso2,
			boolean estaCastrado2, String caractParticulares2) {
    	this.nombre = nombre2;
        this.especie = especie2;
        this.raza = raza2;
        this.fechaNac = fechaNac2;
        
        this.peso = peso2;
        
        this.estaCastrado = estaCastrado2;
        this.caractParticulares = caractParticulares2;
	}

	// Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EspecieDTO getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieDTO especie) {
        this.especie = especie;
    }

    public RazaDTO getRaza() {
        return raza;
    }

    public void setRaza(RazaDTO raza) {
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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

    public String getCaractParticulares() {
        return caractParticulares;
    }

    public void setCaractParticulares(String caractParticulares) {
        this.caractParticulares = caractParticulares;
    }
}