package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime una frase");
		String[] palabra = scanner.nextLine().toLowerCase().split(" ");
		palabra[0] = palabra[0].toLowerCase();
		System.out.print(palabra[0]);
		String[] letras;
		for (int j = 1; j < palabra.length; j++) {
			letras = palabra[j].split("");
			for (int i = 0; i < letras.length; i++) {
				letras[0] = letras[0].toUpperCase();
				System.out.print(letras[i]);
			} 

		}
		scanner.close();
	}
}
