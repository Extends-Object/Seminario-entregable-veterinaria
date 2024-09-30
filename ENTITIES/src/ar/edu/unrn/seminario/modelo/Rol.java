package ar.edu.unrn.seminario.modelo;

public class Rol extends Usuario{
	//private Integer codigo;
	//private String nombre;
	//private boolean activo;

	public Rol(String nombre, String apellido, String email) {
		super(nombre, apellido, email);
	}
	
	/*public RolDTO toDTO() {
        return new RolDTO(getNombre(), getApellido(), getEmail(), nombreRol, activo);
    }

    public static Rol fromDTO(RolDTO rolDTO) {
        Rol rol = new Rol(rolDTO.getNombre(), rolDTO.getApellido(), rolDTO.getEmail(), rolDTO.getNombreRol());
        if (rolDTO.isActivo()) {
            rol.activar();
        } else {
            rol.desactivar();
        }
        return rol;
    }*/

	//public Rol(Integer codigo, String nombre) {
	//	this.codigo = codigo;
	//	this.nombre = nombre;
	//}
	

	/*public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void activar() {
		this.activo = true;
	}

	public void desactivar() {
		this.activo = false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rol other = (Rol) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rol [codigo=" + codigo + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
*/
}
