package ejercicioRepaso;

import java.util.Scanner;

public class Ejerciocio24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer num;
		Integer r;
		Integer suma = 0;
		do {
			System.out.println("Dime un numero que quieras");
			num = scanner.nextInt();
		} while (num <= 0);

		for (int i = 1; i <= num; i++) {
			r = i % 2;
			if (r == 1) {
				suma = suma + i;
			}
		}
		System.out.println("La suma es " + suma);
		scanner.close();
	}

}
