package ar.edu.unrn.seminario.exception;

public class AnimalExistsInArrayException extends Exception {
	
	public AnimalExistsInArrayException() 
	{}
	
	public AnimalExistsInArrayException(String mensaje) 
	{
		super(mensaje);
	}
}