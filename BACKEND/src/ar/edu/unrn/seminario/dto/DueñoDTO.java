package ar.edu.unrn.seminario.dto;

import java.util.ArrayList;

public class DueñoDTO {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private ArrayList<AnimalDTO> listaAnimales; // Usar DTOs para los animales

    // Constructor
    public DueñoDTO(String nombre, String apellido, String email, String direccion, ArrayList<AnimalDTO> listaAnimales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.listaAnimales = listaAnimales;
    }

    // Getters y Setters
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<AnimalDTO> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<AnimalDTO> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
}