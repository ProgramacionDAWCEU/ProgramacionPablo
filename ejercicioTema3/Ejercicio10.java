package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer num;

		do {
			System.out.println("Dime de cuanto quieres el tamaño de la array");
			num = scanner.nextInt();

		} while (num <= 2);
		Integer listanumero[] = new Integer[num];
		Integer x = 0;
		Integer x1 = 1;

		for (int i = 0; i < listanumero.length - 1; i++) {
			listanumero[i] = x;
			listanumero[i + 1] = x1;
			x1 = x + x1;
			x = x1 - x;
		}

		for (int i = 0; i < listanumero.length; i++) {
			System.out.print(listanumero[i] + " ");
		}

		scanner.close();
	}
}
