package ar.edu.unrn.seminario.dto;

public class AnimalDTO {
    private String nombre;
    private String especie;
    //private RazaDTO raza; // Usando RazaDTO
    private String raza;
    private String fechaNac;
    private int edad;
    private String peso;
    private String sexo;
    private boolean estaCastrado;
    private String caractParticulares;

    // Constructor
    public AnimalDTO(String nombre, String especie, String raza, String fechaNac, int edad,
                     String peso, String sexo, boolean estaCastrado, String caractParticulares) {
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

    public AnimalDTO(String nombre2, String especie2, String raza2, String fechaNac2, String peso2,
			boolean estaCastrado2, String caractParticulares2) {
    	this.nombre = nombre2;
        this.especie = especie2;
        this.raza = raza2; // Usando RazaDTO
        this.fechaNac = fechaNac2;
        //this.edad = edad2;
        this.peso = peso2;
        //this.sexo = sexo;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
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