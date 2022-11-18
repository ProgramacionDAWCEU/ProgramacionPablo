package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Dime un enlace");
	String enlace =scanner.nextLine();
	Integer b =enlace.lastIndexOf("/");
	Integer w= enlace.indexOf(".");
	Integer p = enlace.lastIndexOf(".");
	Integer l =enlace.length();
	System.out.println(enlace.substring(0,b+1));
	System.out.println(enlace.substring(b+1,w));
	System.out.println(enlace.substring(w+1,p));
	System.out.println(enlace.substring(p+1,l));
	scanner.close();
}
}
