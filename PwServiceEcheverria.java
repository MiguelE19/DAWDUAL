package pio.daw.Echeverria.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceEcheverria {
	
	private BasicPasswordEncryptor passwordEncryptor;
	
	public PwServiceEcheverria () {
        passwordEncryptor = new BasicPasswordEncryptor(); 
	}
	
		
	    public String encriptarContraseña(String contraseña) {
	        return passwordEncryptor.encryptPassword(contraseña);
	    }
	    
	    public boolean verificarContraseña(String contraseña, String contraseñaEncriptada) {
	        return passwordEncryptor.checkPassword(contraseña, contraseñaEncriptada);
	    }
	}


