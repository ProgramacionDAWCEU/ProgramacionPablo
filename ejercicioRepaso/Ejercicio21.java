package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer dim;
		do {
			System.out.println("Dime las dimension del cuadrado porfa");
			dim = scanner.nextInt();
		} while (dim <= 0);

		for (int i = 1; i <= dim; i++) {
			System.out.println();
			for (int j = 1; j <= dim; j++) {
				if (j == i) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}

			}

		}
		scanner.close();
	}

}
