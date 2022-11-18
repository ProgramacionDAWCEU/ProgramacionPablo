package ejercicioRepaso;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num;
        Integer num1; 
        Integer num2; 
        do {
            System.out.println("Introduzca un numero del 1 al 10");
            num = scanner.nextInt();
           
            
            while ( num < 0 || num > 10 ) {
                System.out.println("numero erroneo , repita");
                    num = scanner.nextInt();
                }
            num1=num*9;
            num2=num*10;
            
            String cadena = "";
            int z = 0;
            for (int i = num; i <= num1; i = i + num) {
                cadena = cadena + i + "+";
                z = z + i;
            }
            Integer ultimo = num2;
            cadena = cadena + ultimo;
            z = z + num2;
            System.out.println(cadena + "=" + z);
            
            
            if ( num == 0) {
                System.out.println("adios");
                break;
            }
        } while (num >= 1 && num <= 10);
        
        scanner.close();
        
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Dime un numero natural");
//		Integer num = scanner.nextInt();
//		Integer i = 0;
//		String cadena = "";
//		Integer num1 = num * 10;
//		Integer num2 = num * 9;
//
//		
//			
//		if (num >= 1 && num <= 10) {
//			while (num >= 1 && num <= 10){
//				 for (int x = num; x <= num2; x = x + num) {
//						cadena = cadena + x + " + ";
//						i = x + i;
//
//					}
//					cadena = cadena + num1;
//					i = i + num1;
//					System.out.println(cadena + " = " + i);
//					System.out.println("Dime otro numero");
//					num = scanner.nextInt();
//					cadena = "";
//					num1 = num * 10;
//					num2 = num * 9;
//					i = 0;
//					
//					
//			 }
//		}
//		 
//		 else(num < 0 || num > 10) {
//				System.out.println("No es correcto dime otro");
//				num = scanner.nextInt();
//			}
//		if (num == 0) {
//			System.out.println("adios");
//		}
//
//	}
}
