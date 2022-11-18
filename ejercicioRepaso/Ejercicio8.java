package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = scanner.nextLine();
		Boolean empie = frase.startsWith("hola");
		Boolean termin = frase.endsWith("hastaluego");
		String fra;
		Integer h;

		while (!empie || !termin) {
			System.out.println("No te entiendo");
			frase = scanner.nextLine();
			empie = frase.startsWith("hola");
			termin = frase.endsWith("hastaluego");
			
		}
		h = frase.lastIndexOf("h");
		fra = frase.substring(4, h - 1);
		System.out.println(fra);
		

		scanner.close();
	}

}
