package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String frase;
	Boolean fin;
	String fraf="";
	do {
		System.out.println("Dime una frase");
		frase=scanner.nextLine();
		fraf=fraf+frase+" ";
		
		fin=frase.equalsIgnoreCase("fin");
	}while(!fin);
	System.out.println(fraf);
	scanner.close();
}
}
