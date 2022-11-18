package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer listanumeros[] = new Integer[6];
		System.out.println("Dime un numero");
		Integer x=scanner.nextInt();
		for (int i = 0; i < listanumeros.length; i++) {
			
			listanumeros[i] = x*x;//porque no con scanner^2
			x+=1;
		}
		for (int j = 0; j < listanumeros.length; j++) {
			System.out.println(listanumeros[j]);
		}
	scanner.close();
	}
}
