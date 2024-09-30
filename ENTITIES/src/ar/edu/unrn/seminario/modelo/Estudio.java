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
		this.estaPendiente = false;
	}
	
	public boolean estaPendiente (Estudio estudio) {
		return this.estaPendiente;
	}
	
	public void mostrarInformacionEstudio() {
        System.out.println("Tipo de Estudio: " + tipo);
        System.out.println("Resultado: " + (resultado != null ? resultado : "No registrado"));
        System.out.println("Estado: " + (estaPendiente ? "Pendiente" : "Completado"));
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public boolean isEstaPendiente() {
		return estaPendiente;
	}

	public void setEstaPendiente(boolean estaPendiente) {
		this.estaPendiente = estaPendiente;
	}
}
