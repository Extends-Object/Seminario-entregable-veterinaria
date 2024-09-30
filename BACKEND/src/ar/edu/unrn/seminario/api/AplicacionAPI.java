package ar.edu.unrn.seminario.api;

import java.util.ArrayList;

import ar.edu.unrn.seminario.modelo.Animal;

public interface AplicacionAPI {
	
	/*
	// Métodos para manejar Veterinarios
    void agregarVeterinario(Veterinario veterinario);
    void eliminarVeterinario(int matricula);
    Veterinario buscarVeterinario(int matricula);
    List<Veterinario> listarVeterinarios();

    // Métodos para manejar Dueños
    void agregarDueño(Dueño dueño);
    void eliminarDueño(String email);
    Dueño buscarDueño(String email);
    List<Dueño> listarDueños();
    */
    
    // Métodos para manejar animales - Definidos en DUEÑO
    void agregarAnimal(Animal animal);
    void eliminarAnimal(String nombre);
    Animal buscarAnimal(String nombre);
    ArrayList <Animal> listarAnimales();
    
    /*
    // Métodos para manejar la lista de Veterinarias
    void agregarVeterinaria(Veterinaria veterinaria);
    void eliminarVeterinaria(String direccion);
    Veterinaria buscarVeterinaria(String direccion);
    List<Veterinaria> listarVeterinarias();

    
    void registrarVisita(Visita visita);
    List<Visita> listarVisitasPorAnimal(String nombreAnimal);
    */

}
