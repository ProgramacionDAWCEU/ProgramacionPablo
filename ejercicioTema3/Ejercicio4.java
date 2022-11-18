package ejercicioTema3;



public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre = "blas";
        Integer numero = nombre.compareTo("lemniscata");
        System.out.println(numero);
        if (numero < 0) {
            System.out.println("1");
        }
        else if (numero > 0) {
            System.out.println("2");
        }
        System.out.println("3");
    }
	}

