package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Introduzca una palabra");
        
        String cadena= scanner.nextLine();
        Integer l = cadena.length();
        
        
        for(Integer i=l-1; i>-1; i--) {
            
            
            System.out.print(cadena.substring(i,l));
            l=l-1;
            
            
        }
        scanner.close();

	}
}
