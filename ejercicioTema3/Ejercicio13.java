package ejercicioTema3;

public class Ejercicio13 {
public static void main(String[] args) {
	Integer [][]tablanumero= new Integer[10][10];
	Integer x=0;
	Integer y=1;
	Integer multi=0;
	for (int i = 0; i < tablanumero.length; i++) {
		x++;
		for (int j = 0; j < tablanumero.length	; j++) {
			multi=x*y;
			tablanumero[j][i]=multi;
			y++;
			if(y>10) {
				y=1;
			}
			
		}
	}
	for (int i = 0; i < tablanumero.length; i++) {
		System.out.println();
		for (int j = 0; j < tablanumero.length; j++) {
			System.out.print(tablanumero[j][i]+"\t");
		}
	}
}
}
