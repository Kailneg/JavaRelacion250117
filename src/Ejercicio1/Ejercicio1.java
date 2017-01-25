package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double dato = LeerNumero("Introduce grados centígrados");
		System.out.println("Grados Fahrenheit: " + CelsiusAFahrenhet(dato));

	}
	
	public static double LeerNumero(String texto) {
		boolean error = true;
		double d = 0;
		String aux = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(texto);
			aux = sc.nextLine();
			try {
				d = Double.parseDouble(aux);
				error = false;
			} catch (Exception e) {
				System.out.println("Dato introducido no correcto.");
				error = true;
			}
		} while (error);
		
		return d;
	}
	
	public static double CelsiusAFahrenhet(double celsius) {
		return 32 + (9 * celsius / 5);
	}

}
