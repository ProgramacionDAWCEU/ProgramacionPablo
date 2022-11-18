package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String listapalabra[] = new String[3];
		String frase = "";
		for (int i = 0; i < listapalabra.length; i++) {
			System.out.println("Dime una palabra");
			listapalabra[i] = scanner.nextLine();
			frase = frase + listapalabra[i];
		}
		System.out.println(frase + " ");
		scanner.close();
	}
}
