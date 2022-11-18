package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean empie;
		Boolean termin;

		do {
			System.out.println("Cuentame cositas...");
			String texto = scanner.nextLine();
			empie = texto.startsWith("hola");
			termin = texto.endsWith("hastaluego");
			if (empie && termin) {
				String msg = texto.substring(4, texto.lastIndexOf("hastaluego"));
				System.out.println("Te he entendido: " + msg.trim());

			} else if (texto.startsWith("hola") && texto.endsWith("adios")) {
				String msg = texto.substring(4, texto.lastIndexOf("adios"));
				System.out.println("Te he entendido: " + msg.trim());
				break;
			}
			else {
				System.out.println("No te entiendo. Repite");
			}

		} while (true);
		
		scanner.close();
	}

}
