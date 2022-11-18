package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime cuantos numeros me vas a decir");
		Integer num = scanner.nextInt();
		Integer listanumero[] = new Integer[num];

		for (int i = 0; i < listanumero.length; i++) {
			System.out.println("Dime un numero");
			listanumero[i] = scanner.nextInt();
		}

		for (int i = 0, j = 1; i < listanumero.length - 1 && i != listanumero.length/2; i++, j++) {
			num = listanumero[i];
			listanumero[i] = listanumero[listanumero.length - j];
			listanumero[listanumero.length - j] = num;
		}
		for (int i = 0; i < listanumero.length; i++) {
			System.out.print(listanumero[i] + " ");
		}
		scanner.close();
	}
}
