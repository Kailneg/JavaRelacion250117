package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double dato = LeerNumero("Introduce Km/h:");
		dato = KilometrosHoraAMetrosSegundo(dato);
		System.out.println("M/s: " + dato);
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
		} while (error || d <= 0);
		
		return d;
	}
	
	public static double KilometrosHoraAMetrosSegundo(double kmh) {
		return kmh*0.27777777777778d;
	}
}
