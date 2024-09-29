package ar.edu.unrn.seminario.modelo;

public class Veterinaria {
	private String direccion;
	private int codArea;
	private int numeroTel;
	
	public Veterinaria(String direccion, int codArea, int numeroTel) {
		this.direccion = direccion;
		this.codArea = codArea;
		this.numeroTel = numeroTel;
	}
	
	public void actualizarTel (int codArea, int numeroTel) {
		this.codArea = codArea;
		this.numeroTel = numeroTel;
	}

}
