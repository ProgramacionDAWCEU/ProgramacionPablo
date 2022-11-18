package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime cuantos numeros me vas a decir");
		Integer listanumero[] = new Integer[scanner.nextInt()];
		for (int i = 0; i < listanumero.length; i++) {
			System.out.println("Dime un numero");
			listanumero[i] = scanner.nextInt();
		}
		for (int i = 0; i < listanumero.length; i++) {
			System.out.print(listanumero[i] + " ");
		}
		scanner.close();
	}
}
