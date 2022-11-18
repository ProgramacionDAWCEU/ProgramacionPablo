package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n;
		int x = 0;
		int y = 1;
		int z = 0;
		do {
			System.out.println("Dime un numero");
			n = scanner.nextInt();
			if (n > 2) {
				for (int i = 0; i < n; i++) {
					System.out.print(z + " ");
					x = y;
					y = z;
					z = x + y;
				}
			}

		} while (n <= 2);
		
		scanner.close();
	}
}
