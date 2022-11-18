package ejercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime las veces que queires que lance el dado");
		Integer num = scanner.nextInt();
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			Integer y = random.nextInt(1, 7);
			System.out.println("El resultado es " + y);
		}
		scanner.close();
	}
}
