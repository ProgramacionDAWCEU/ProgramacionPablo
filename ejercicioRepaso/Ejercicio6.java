package ejercicioRepaso;

public class Ejercicio6 {
	public static void main(String[] args) {

		String cadena = "";
		Integer i = 0;
		for (int x = 3; x <= 27; x = x + 3) {
			cadena = cadena + x + " + ";
			i = x + i;

		}
		cadena = cadena + 30;
		i = i + 30;
		System.out.println(cadena + " = " + i);
	}
}