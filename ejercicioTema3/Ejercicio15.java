package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Dime un enlace");
	String[] enlace =scanner.nextLine().split("//");
	String[] demas =enlace[1].split("\\.");
	System.out.println(enlace[0]+"//");
	for (int i = 0; i < demas.length; i++) {
		System.out.println(demas[i]);
	} 
	scanner.close();
}
}
