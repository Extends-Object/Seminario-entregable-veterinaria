package ar.edu.unrn.seminario.dto;

import java.time.LocalDate;

public class AnimalDTO {
    private String nombre;
    private String especie;
    private RazaDTO raza; // Usando RazaDTO
    private LocalDate fechaNac;
    private int edad;
    private float peso;
    private String sexo;
    private boolean estaCastrado;
    private String caractParticulares;

    // Constructor
    public AnimalDTO(String nombre, String especie, RazaDTO raza, LocalDate fechaNac, int edad,
                     float peso, String sexo, boolean estaCastrado, String caractParticulares) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza; // Usando RazaDTO
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.estaCastrado = estaCastrado;
        this.caractParticulares = caractParticulares;
    }

    // Getters y Setters
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

    public String getCaractParticulares() {
        return caractParticulares;
    }

    public void setCaractParticulares(String caractParticulares) {
        this.caractParticulares = caractParticulares;
    }
}