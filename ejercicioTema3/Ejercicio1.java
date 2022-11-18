package ejercicioTema3;

public class Ejercicio1 {
	public static void main(String[] args) {
		Integer listanumeros[] = new Integer[15];
		Integer x = 2;
		for (int i = 0; i < listanumeros.length; i++) {
			listanumeros[i] = x;
			x += 2;

		}

		for (int j = 0; j < listanumeros.length; j++) {

			System.out.println(listanumeros[j]);

		}
	}
}
