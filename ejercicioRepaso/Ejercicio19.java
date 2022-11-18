package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer opc;
		Integer din;
		Integer total;
		do {
			System.out.println("\n 1 - Pasar de Pesetas a Euros \n 2 - Pasar de Euros a Pesetas \n 3 - Salir");
			opc = scanner.nextInt();

			if (opc == 1) {
				System.out.println("Dime la cantidad que quieres pasar");
				din = scanner.nextInt();
				total = din / 166;
				System.out.println("Son " + total + " euros");

			} else if (opc == 2) {
				System.out.println("Dime la cantidad que quieres pasar");
				din = scanner.nextInt();
				total = din * 166;
				System.out.println("Son " + total + " pesetas");

			} else if (opc == 3) {
				System.out.println("Adios");
			}

		} while (opc !=3);
		scanner.close();
	}
}
