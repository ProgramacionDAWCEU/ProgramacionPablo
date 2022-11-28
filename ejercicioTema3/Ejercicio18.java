package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime el numero que quieras");

		String num = scanner.nextLine();
		String[] listanumeros = num.split("");

		Boolean verdad = true;

		String[] listanumero2 = num.split("");

		for (int i = listanumeros.length - 1, cont = 0; i >= 0; i--, cont++) {

			listanumero2[cont] = listanumeros[i];
		}

		for (int i = 0; i < listanumeros.length; i++) {
			if (!listanumero2[i].equals(listanumeros[i])) {
				verdad = false;
				break;

			}
		}

		if (verdad == false) {
			System.out.println("El numero no es capicua");
		} else {
			System.out.println("Es capicua");
		}
		scanner.close();
	}
}
