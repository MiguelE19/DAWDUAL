package pio.daw.Echeverria.encriptador;

public class PWServiceEcheverriaTest {

	public static void main(String[] args) {
		PwServiceEcheverria servicio = new PwServiceEcheverria();
		String password = "miSuperContraseña";
		String passwordEncriptada = servicio.encriptarContraseña(password);
		System.out.println("Prueba alumno Echeverria");
		System.out.println("La contraseña encriptada es:" +passwordEncriptada);
		//Vamos a verificarlo
		boolean esValida = servicio.verificarContraseña(password, passwordEncriptada);
		System.out.println("La contraseña es valida:" +esValida);
		

	}

}
