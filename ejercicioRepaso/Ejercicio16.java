package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = scanner.nextLine();
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.substring(i, i+1));
		}
		
		scanner.close();
	}

}
