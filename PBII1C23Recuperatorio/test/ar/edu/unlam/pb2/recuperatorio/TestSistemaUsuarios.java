package ar.edu.unlam.pb2.recuperatorio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistemaUsuarios {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void queSePuedaEliminarUnUser() throws UsertNotFound {
		final Boolean VALOR_ESPERADO=true;
		miUsuario=new UsuarioBasico("Maria", "1Ea257093");
		listaUsers= new TreeSet();
		miSistema=new SistemaUsuarios(listaUsers);
		miSistema.agregarUsuario(miUsuario);
		Boolean resultado = misistema.eliminarUsuario(miUsuario);
		assertTrue(resultado,VALOR_ESPERADO);
		}
	}
	



	@Test(expected:UserNotFound.class)
	public void queNoSeEncuentreUnUser() throws UserNotFound {
		final Boolean VALOR_ESPERADO=false;
		miUsuario=new UsuarioBasico("Maria", "1Ea257093");
		otroUsuario=new UsuarioBasico("Juana", "0931Ea257");
		listaUsers= new TreeSet();
		miSistema=new SistemaUsuarios(listaUsers);
		miSistema.agregarUsuario(miUsuario);
		miSistema.buscarUsuario(otroUsuario);
		
	}
	

	@Test
	public void queSePuedaLoguearCorrectamente(){
		final Boolean VALOR_ESPERADO=true;
		miUsuario=new UsuarioBasico("Maria", "1Ea257093");
		listaUsers= new TreeSet();
		miSistema=new SistemaUsuarios(listaUsers);
		miSistema.agregarUsuario(miUsuario);
		Boolean resultado = miSistema.loginUsuario(miUsuario);
		assertTrue(resultado,VALOR_ESPERADO);
		
	}


}
