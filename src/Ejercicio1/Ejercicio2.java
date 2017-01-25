package Ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double radio = LeerNumero("Introduce radio:");
		double longitud = LongitudCircunferencia(radio);
		double area = AreaCircunferencia(radio);
		System.out.println("Longitud: " + longitud + "\n¡rea: " + area);

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
	
	public static double LongitudCircunferencia (double radio){
		return 2*Math.PI*radio;
	}
	
	public static double AreaCircunferencia (double radio) {
		return Math.PI*Math.pow(radio, 2);
	}
}
