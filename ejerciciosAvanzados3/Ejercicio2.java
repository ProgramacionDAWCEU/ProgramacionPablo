package ejercicioAvanzadosTema3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// fila derecha columna izquierda
		Scanner scanner = new Scanner(System.in);
		String[][] tablanumero = new String[3][3];
		Integer fila;
		Integer colum;
		Integer juga = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int x = 0; x < 3; x++) {
				tablanumero[i][x] = "-";
				System.out.print(tablanumero[i][x] + "\t");

			}
		}
		System.out.println("");

		for (int i = 0; i < tablanumero.length; i++) {

			for (int j = 0; j < tablanumero.length; j++) {

				if (juga == 1) {
					do {

						System.out.println("\n\nDime la coordenada la fila jugador " + juga);
						colum = scanner.nextInt();
						System.out.println("Dime la coordenada de la columna jugador " + juga);
						fila = scanner.nextInt();

					} while (tablanumero[colum][fila] == "0" || tablanumero[colum][fila] == "1");

					tablanumero[colum][fila] = "0";

					for (int y = 0; y < 3; y++) {
						System.out.println();
						for (int x = 0; x < 3; x++) {

							System.out.print(tablanumero[y][x] + "\t");
						}

					}

					for (int j2 = 0; j2 < tablanumero.length; j2++) {
						if (tablanumero[j2][0] == tablanumero[j2][1] && tablanumero[j2][0] == tablanumero[j2][2]
								&& tablanumero[j2][0] != "-") {
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][j2] == tablanumero[1][j2] && tablanumero[0][j2] == tablanumero[2][j2]
								&& tablanumero[0][j2] != "-") {
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][0] == tablanumero[1][1] && tablanumero[0][0] == tablanumero[2][2]
								&& tablanumero[0][j2] != "-" && tablanumero[j2][0] != "-") {
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][2] == tablanumero[1][1] && tablanumero[0][2] == tablanumero[2][0]
								&& tablanumero[0][2] != "-" && tablanumero[2][0] != "-") {
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						}
					}

					juga++;

				} else if (juga == 2) {

					do {
						System.out.println("\n\nDime la coordenada la fila jugador " + juga);
						colum = scanner.nextInt();
						System.out.println("Dime la coordenada de la columna jugador " + juga);
						fila = scanner.nextInt();
					} while (tablanumero[colum][fila] == "0" || tablanumero[colum][fila] == "1");

					tablanumero[colum][fila] = "1";

					for (int y = 0; y < 3; y++) {
						System.out.println();
						for (int x = 0; x < 3; x++) {

							System.out.print(tablanumero[y][x] + "\t");
						}

					}
					juga = 1;
					for (int j2 = 0; j2 < tablanumero.length; j2++) {

						if (tablanumero[j2][0] == tablanumero[j2][1] && tablanumero[j2][0] == tablanumero[j2][2]
								&& tablanumero[j2][0] != "-") {
							juga = 2;
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;

						} else if (tablanumero[0][j2] == tablanumero[1][j2] && tablanumero[0][j2] == tablanumero[2][j2]
								&& tablanumero[0][j2] != "-") {
							juga = 2;
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][0] == tablanumero[1][1] && tablanumero[0][0] == tablanumero[2][2]
								&& tablanumero[0][j2] != "-") {
							juga = 2;
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][0] == tablanumero[1][1] && tablanumero[0][0] == tablanumero[2][2]
								&& tablanumero[0][j2] != "-" && tablanumero[j2][0] != "-") {
							juga = 2;
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						} else if (tablanumero[0][2] == tablanumero[1][1] && tablanumero[0][2] == tablanumero[2][0]
								&& tablanumero[0][2] != "-" && tablanumero[2][0] != "-") {
							juga = 2;
							System.out.println("Ha ganado el jugador " + juga);
							juga = 3;
							break;
						}

					}

				}
			}
		}

		scanner.close();

	}
}
