package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {



	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Dime un número entero");
	        Integer num1 = scanner.nextInt();
	        System.out.println("Dime otro número entero");
	        Integer num2 = scanner.nextInt();
	        Integer opcion;
	        do {
	            System.out.println(" *** MENÚ *** ");
	            System.out.println("1.SUMAR");
	            System.out.println("2.RESTAR");
	            System.out.println("3.MULTIPLICAR");
	            System.out.println("4.DIVIDIR");
	            System.out.println("0.SALIR");
	            System.out.println("Que opción del menú quieres?");
	            opcion = scanner.nextInt();
	            if (opcion == 1) {
	                Integer sum = num1 + num2;
	                System.out.println("La suma es " + sum);
	            } else if (opcion == 2) {
	                Integer res = num1 - num2;
	                System.out.println("La resta es " + res);
	            } else if (opcion == 3) {
	                Integer multi = num1 * num2;
	                System.out.println("La multiplicacion es " + multi);
	            } else if (opcion == 4 && num2 != 0) {
	                Integer div = num1 / num2;
	                System.out.println("La division es " + div);
	            } else if (opcion == 4 && num2 == 0) {
	                System.out.println("La division no es posible");
	            } else if (opcion == 0) {
	                System.out.println("adios");
	               
	            }



	       } while (opcion > 0 && opcion < 5);
	        scanner.close();



	   }
}
