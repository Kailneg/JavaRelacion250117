package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double cateto1 = LeerNumero("Introduce cateto 1:");
		double cateto2 = LeerNumero("Introduce cateto 2:");
		double hipotenusa = CalcularHipotenusa(cateto1, cateto2);
		System.out.println("Hipotenusa: " + hipotenusa);
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
	
	public static double CalcularHipotenusa (double cateto1, double cateto2) {
		double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}
}
