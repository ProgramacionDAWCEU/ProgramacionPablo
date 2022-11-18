package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Dime cuantos numeros me vas a decir");
	Integer listanumero[] = new Integer[scanner.nextInt()];
	Integer num;
	for (int i = 0; i < listanumero.length; i++) {
		System.out.println("Dime un numero");
		listanumero[i] = scanner.nextInt();
	}
	for (int i = 0; i < listanumero.length-1; i++) {
		for (int j = i; j < listanumero.length; j++) {
			if(listanumero[j]<listanumero[i]) {
				num=listanumero[j];
				listanumero[j]=listanumero[i];
				listanumero[i]=num;
			}
		}
			
			
		
	}
	for (int i1 = 0; i1 < listanumero.length; i1++) {
		System.out.print(listanumero[i1] + " ");
	}
	scanner.close();
	}
}




