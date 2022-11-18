package ejercicioTema3;



public class Ejercicio12 {
public static void main(String[] args) {
	Integer [][]tablanumero= new Integer[10][10];
	Integer x=1;
	for (int i = 0; i < tablanumero.length; i++) {
		for (int j = 0; j < tablanumero.length; j++) {
			x=i*j;
			tablanumero[i][j]=x;
		}
	}
	for (int i = 0; i < tablanumero.length; i++) {
		System.out.println();
		for (int j = 0; j < tablanumero.length; j++) {
			System.out.print(tablanumero[i][j]+"\t");
		}
	}
}
}
