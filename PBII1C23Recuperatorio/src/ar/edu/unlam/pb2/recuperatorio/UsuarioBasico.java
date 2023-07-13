package ar.edu.unlam.pb2.recuperatorio;

public class UsuarioBasico extends Usuario implements Bloqueable,Eliminable,Comparable<Usuario> {

	public UsuarioBasico(String nombre, String password) {
		super(nombre, password);
		// TODO Auto-generated constructor stub
	}

	/* Los usuarios administradores además de los requisitos de la contraseña de los usuarios básicos deben tener un carácter especial 
	y no puede tener secuencia de más de 3 caracteres seguidos (123 y abc es válido, pero 1234 o abcd no).  */
	@Override
	public Boolean esValidoLaContrasenia(String password) {
		char ch;
		Boolean esValido = false;
		Boolean hayMayuscula = false;
    	Boolean hayMinuscula = false;
    	Boolean hayNumero = false;

	    for(int i=0;i < password.length();i++) {
        	ch = password.charAt(i);
        	if( Character.isDigit(ch)) {
            		hayNumero = true;
        	}
        	else if (Character.isUpperCase(ch)) {
            		hayMayuscula = true;
        	} else if (Character.isLowerCase(ch)) {
            		hayMinuscula = true;
        	}
        	if(hayNumero && hayMayuscula && hayMinuscula)
            		return esValido=true;
    		}	
		return esValido;
	}

	@Override
	public Boolean esEliminable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void esBloqueable() {
		// TODO Auto-generated method stub
		
	}
	

}
