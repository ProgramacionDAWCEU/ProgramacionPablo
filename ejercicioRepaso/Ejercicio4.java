package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el precio del producto");
		Double precio = scanner.nextDouble();
		System.out.println("Dime la cantidad del producto que quieres");
		Double cantidad = scanner.nextDouble();
		Double subtotal = precio + cantidad;
		Double descuento = 0.0;
		Double total = 0.0;
		if (cantidad > 100) {
			descuento = subtotal * 0.4;

		} else if (cantidad <= 100 && cantidad >= 25) {
			descuento = subtotal * 0.2;

		} else if (cantidad <= 24 && cantidad >= 10) {
			descuento = subtotal * 0.1;

		} else {
			System.out.println("No se aplica ningun descuento");

		}
		total = subtotal - descuento;
		System.out.println("Subtotal = " + precio + " + " + cantidad + " = " + subtotal);
		System.out.println("Descuento = " + " de " + subtotal + " = " + descuento);
		System.out.println("Total = " + subtotal + " - " + descuento + " = " + total);
		scanner.close();
	}
}
