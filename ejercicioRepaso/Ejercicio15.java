package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un numero del 0 al 9");
		Integer num = scanner.nextInt();
		Integer numale = (int) (Math.random() * 10);

		if (num == numale) {
			System.out.println("Has acertado tu puntacion es de 10");

		} else {
			for (int i = 9; num != numale; i--) {
				System.out.println("Te has equivocado, dime otro");
				num = scanner.nextInt();
				if (num == numale) {
					System.out.println("Has acertado tu puntacion es " + (i));

				}

			}

		}
		scanner.close();

	}
}
