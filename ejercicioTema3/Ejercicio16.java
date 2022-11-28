package ejercicioTema3;

import java.util.Scanner;

public class Ejercicio16 {
public static void main(String[] args) {
	   Scanner scanner= new Scanner(System.in);
       
       System.out.println("Introduzca una palabra");
       
       String[] cadena= scanner.nextLine().split("");
       
       
       for (int i = cadena.length-1; i >=0 ; i--) {
		System.out.print(cadena[i]);
	}
           
         scanner.close();  
       }
       
}

