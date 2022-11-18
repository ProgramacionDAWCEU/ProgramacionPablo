package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime cuantos numeros me vas a decir");
		Integer num = scanner.nextInt();
		Integer listanumero[] = new Integer[num];
		Integer listanumero2[] = new Integer[num];
		for (int i = 0; i < listanumero.length; i++) {
			System.out.println("Dime un numero");
			listanumero[i] = scanner.nextInt();

		}

		for (int i = listanumero.length - 1, cont = 0; i >= 0; i--, cont++) {

			listanumero2[cont] = listanumero[i];

		}
		for (int i = 0; i < listanumero2.length; i++) {

			System.out.print(listanumero2[i] + " ");
		}

		scanner.close();
	}
}
