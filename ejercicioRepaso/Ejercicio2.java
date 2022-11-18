package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un nombre de una ciudad");
		String ciudad1 = scanner.next();
		System.out.println("Dime un nombre de una ciudad");
		String ciudad2 = scanner.next();
		System.out.println("Dime un nombre de una ciudad");
		String ciudad3 = scanner.next();
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		
		if (longitud1 > longitud2 && longitud1 > longitud3 && longitud2 > longitud3) {
			System.out.println(ciudad1 +" "+ ciudad2 +" " + ciudad3);

		} else if (longitud2 > longitud1 && longitud2 > longitud3 && longitud1 > longitud3) {
			System.out.println(ciudad2 +" "+ ciudad1 +" "+ ciudad3);

		} else if (longitud3 > longitud1 && longitud3 > longitud2 && longitud1 > longitud2) {
			System.out.println(ciudad3 +" "+ ciudad1 +" "+ ciudad2);

		} else if (longitud3 > longitud1 && longitud3 > longitud2 && longitud2 > longitud1) {
			System.out.println(ciudad3 +" "+ ciudad2 +" "+ ciudad1);
			
		} else if (longitud2 > longitud1 && longitud2 > longitud3 && longitud3 > longitud1) {
			System.out.println(ciudad2 +" "+ ciudad3 +" "+ ciudad1);
			
		} else {
			System.out.println(ciudad1 +" "+ ciudad3 +" "+ ciudad2);

		}
		scanner.close();
	}
}
