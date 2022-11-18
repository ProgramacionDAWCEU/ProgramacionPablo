package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer numero;
		do {
			System.out.println("*** MENÚ *** \n 1. Abrir \n 2. Guardar \n 3. Modificar \n 4. Salir");
			numero = scanner.nextInt();
			if (numero == 4) {
				System.out.println("BYE BYE");
			} else if (numero >= 1 && numero <= 3) {
				System.out.println("Has seleccionado una de las tres primeras opciones, vuelve a elegir");
			} else {
				System.out.println("Has seleccionado una opcion incorrecta");
			}
		} while (numero < 4 || numero < 1 || numero > 4);
		scanner.close();

	}

}
