package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String contraseña;
		do {
			System.out.println("Dime una contraseña");
			contraseña = scanner.nextLine();
			if (contraseña.length() >= 8) {
				String cambio = contraseña.replaceAll("a", "4")
						.replaceAll("e", "3")
						.replaceAll("i", "1")
						.replaceAll("o", "0")
						.replaceAll("t", "7");
				System.out.println(cambio);
				
			}

		} while (contraseña.length() < 8);
		scanner.close();
	}
}
