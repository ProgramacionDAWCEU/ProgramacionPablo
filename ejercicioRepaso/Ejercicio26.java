package ejercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Integer victorias = 0;
		Boolean afirmativo;
		String manopapel = "papel";
		String manopiedra = "piedra";
		String manotijeras = "tijeras";

		do {

			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			String juego = scanner.nextLine();
			Integer mano = random.nextInt(1, 4);

			if (juego.equalsIgnoreCase(manopapel)) {

				switch (mano) {

				case 1:
					System.out.println("La máquina saca piedra tu ganas");
					victorias++;
					break;
				case 2:
					System.out.println("La máquina saca tijeras tu pierdes");
					break;
				case 3:
					System.out.println("La máquina saca papel empatáis");
					break;
				}

			} else if (juego.equalsIgnoreCase(manopiedra)) {

				switch (mano) {
				case 1:
					System.out.println("La máquina saca piedra empatáis");
					break;
				case 2:
					System.out.println("La máquina saca tijeras tu ganas");
					victorias++;
					break;
				case 3:
					System.out.println("La máquina saca papel tu pierdes");
					break;
				}

			} else if (juego.equalsIgnoreCase(manotijeras)) {

				switch (mano) {
				case 1:
					System.out.println("La máquina saca piedra tu pierdes");
					break;
				case 2:
					System.out.println("La máquina saca tijeras empatáis");
					break;
				case 3:
					System.out.println("La máquina saca papel tu ganas");
					victorias++;
					break;
				}

			}

			System.out.println("¿Quieres jugar otra vez?");
			String caso = scanner.nextLine();
			afirmativo = caso.equalsIgnoreCase("si");

		} while (afirmativo);

		System.out.println("Has ganado " + victorias + " veces");
		scanner.close();
	}
}
