package ar.edu.unlam.pb2.recuperatorio;

import java.util.Objects;

public abstract class Usuario implements Comparable<Usuario> {
	private static final int MINIMA_LONGITUD_PASSWORD = 15;
	private String nombre;
	private String password;
	private Boolean estaEliminado;
	
	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}

	public Boolean esValidoLaContrasenia(String password) {
		return true;
	}
	
	public Boolean passwordIncorrecta(String nombreUser, String password) {
		for(int intentos=0; intentos <=3; intentos ++)
			if(this.getPassword().equals(password))
				return false;
			return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int compareTo(Usuario user) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(user.getNombre());
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

	public Boolean getEstaEliminado() {
		return estaEliminado;
	}

	public void setEstaEliminado(Boolean estaEliminado) {
		this.estaEliminado = estaEliminado;
	}




}
