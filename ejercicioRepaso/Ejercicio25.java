package ejercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
		String juego = scanner.nextLine();
		Integer mano = random.nextInt(1, 4);
		String manopapel = "papel";
		String manopiedra = "piedra";
		String manotijeras = "tijeras";
		if (juego.equalsIgnoreCase(manopapel)) {

			switch (mano) {
			case 1:
				System.out.println("La máquina saca piedra tu ganas.");
				break;
			case 2:
				System.out.println("La máquina saca tijeras tu pierdes.");
				break;
			case 3:
				System.out.println("La máquina saca papel empatáis.");
				break;
			}

		} else if (juego.equalsIgnoreCase(manopiedra)) {
			switch (mano) {
			case 1:
				System.out.println("La máquina saca piedra empatáis.");
				break;
			case 2:
				System.out.println("La máquina saca tijeras tu ganas.");
				break;
			case 3:
				System.out.println("La máquina saca papel tu pierdes.");
				break;
			}

		} else if (juego.equalsIgnoreCase(manotijeras)) {
			switch (mano) {
			case 1:
				System.out.println("La máquina saca piedra tu pierdes.");
				break;
			case 2:
				System.out.println("La máquina saca tijeras empatáis.");
				break;
			case 3:
				System.out.println("La máquina saca papel tu ganas.");
				break;
			}
		}
		scanner.close();
	}
}
