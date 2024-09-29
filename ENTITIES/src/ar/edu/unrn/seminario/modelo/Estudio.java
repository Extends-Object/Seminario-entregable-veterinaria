package ar.edu.unrn.seminario.modelo;

public class Estudio {
	private String tipo;  //extraccion, por imagenes
	private String resultado;
	private boolean estaPendiente;
	
	
	public Estudio(String tipo) {
		this.tipo = tipo;
	}
	
	public void registrarResultado (String resultado) {
		this.resultado = resultado;
	}
	
	public boolean estaPendiente (Estudio estudio) {
		return this.estaPendiente;
	}
	
	

}
