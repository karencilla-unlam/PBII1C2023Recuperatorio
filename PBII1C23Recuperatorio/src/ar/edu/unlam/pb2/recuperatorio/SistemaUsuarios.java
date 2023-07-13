package ar.edu.unlam.pb2.recuperatorio;

import java.util.Set;
import java.util.TreeSet;

public class SistemaUsuarios {
	private Set<Usuario> usuarios;

	public SistemaUsuarios(Set<Usuario> usuarios) {
		super();
		this.usuarios = new TreeSet<Usuario>();
	}
	
	
	public Usuario buscarUsuario(Usuario user) throws UserNotFound {
		
		for(Usuario actual : usuarios)
			if(actual.getNombre().equals(user.getNombre()))
				return actual;
		
		throw new UserNotFound("No se encontro el usuario");
	}
	
	
	public void agregarUsuario(Usuario user){
		if(!this.usuarios.contains(user)) {
			usuarios.add(user);
		}
			
	}
	
	public void eliminarUsuario(Usuario user) throws UserNotFound{
		if(!this.usuarios.contains(user)) {
			((SistemaUsuarios) this.usuarios).buscarUsuario(user).setEstaEliminado(true);
		}
			
	}

	public Boolean loginUsuario(Usuario user) throws UserNotFound {
		if(buscarUsuario(user) != null)
			if(user.esValidoLaContrasenia(user.getPassword()))
				return true;
		
		return false;
	}

}
