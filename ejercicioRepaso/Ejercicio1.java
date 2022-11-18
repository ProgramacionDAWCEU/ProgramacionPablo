package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Dime tu nombre");
	String nombre = scanner.next();
	System.out.println("Dime tu año de nacimiento");
	Integer año = scanner.nextInt();
	Integer edad= 2030-año; 
	System.out.println("Hola "+ nombre + ", en el año 2030 tendras "+ edad+ " años");
	scanner.close();
}
}
