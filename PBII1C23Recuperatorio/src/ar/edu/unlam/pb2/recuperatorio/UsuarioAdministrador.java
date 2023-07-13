package ar.edu.unlam.pb2.recuperatorio;

public class UsuarioAdministrador extends Usuario implements Bloqueable,Eliminable,Comparable<Usuario> {
	private final int MINIMA_LONGITUD_PASSWORD=10;
	public UsuarioAdministrador(String nombre, String password) {
		super(nombre, password);
		// TODO Auto-generated constructor stub
	}

	/* Los usuarios básicos deben tener passwords que contengan al menos un número y una minúscula y una mayúscula.  */
	@Override
	public Boolean esValidoLaContrasenia(String password) {
		char ch;
		Boolean esValido = false;
		Boolean hayMayuscula = false;
    	Boolean hayMinuscula = false;
    	Boolean hayNumero = false;
    	Boolean hayCaracterEspecial=false;
    	Integer contador = 0;
//    	String[] arraySpecialCharacters = ["+", "%", "*", "$", "&"];
    	
    	if(password.length()>=MINIMA_LONGITUD_PASSWORD) {
	    	for(int i=0;i < password.length();i++) {
        		ch = password.charAt(i);
        		if( Character.isDigit(ch)) {
            			hayNumero = true;
        		}
        		else if (Character.isUpperCase(ch)) {
            			hayMayuscula = true;
        		} else if (Character.isLowerCase(ch)) {
            			hayMinuscula = true;
        		} else if (password.contains("+") || password.contains("%") || password.contains("*") || password.contains("$") || password.contains("&"))
        				hayCaracterEspecial = true;
	    		if (password.contains("ch")&&password.contains("ch+1"))
	    				contador ++;
        		if(hayNumero && hayMayuscula && hayMinuscula && hayCaracterEspecial && contador <= 3)
            			return esValido=true;
    			}	
    	}
		return esValido;
	}

	@Override
	public Boolean esEliminable() {
		// TODO Auto-generated method stub
		if(this.instanceOf(UsuarioAdministrador))
			return false;
	}

	@Override
	public void esBloqueable() {
		// TODO Auto-generated method stub
		
	}


}