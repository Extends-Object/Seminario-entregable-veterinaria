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
	
	public void mostrarContacto() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: (" + codArea + ") " + numeroTel);
    }

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodArea() {
		return codArea;
	}

	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
}
