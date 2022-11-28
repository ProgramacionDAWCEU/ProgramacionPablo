package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu nombre entero");
		String[] nombre1 = scanner.nextLine().split(" ");

		for (int i = 0; i < nombre1.length; i++) {
			System.out.println(nombre1[i]);
		}
		scanner.close();	
	}
}
