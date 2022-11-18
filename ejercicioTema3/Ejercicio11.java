package ejercicioTema3;

public class Ejercicio11 {
public static void main(String[] args) {
	Integer[][] tablanumero= new Integer [10][5];
	Integer x = 1;
for (int i = 0; i < tablanumero.length-5; i++) {
	for (int j = 0; j < tablanumero.length; j++) {
		tablanumero[j][i]=x;
		x++;
	}
}
for (int i = 0; i < tablanumero.length-5; i++) {
	System.out.println();
	for (int j = 0; j < tablanumero.length; j++) {
		System.out.print(tablanumero[j][i]+"\t");
	}
	
}








}
}
