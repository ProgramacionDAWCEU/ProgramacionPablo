package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio12 {
	   public static void main(String[] args) {
	        Scanner scanner= new Scanner(System.in);
	        System.out.println("Dime un numero mayor que 0");
	        Integer num= scanner.nextInt();
	        System.out.print(" ");
	        for(int con1=1-num*2;con1<num;con1++) {
	            System.out.print("_");
	        }
	        
	        for (int con2=0; con2<num; con2++){
	            System.out.println();
	            for(int con3=0; con3<num;con3++)
	            System.out.print("|__");
	            System.out.print("|");
	        }
	        scanner.close();
	    }
}
