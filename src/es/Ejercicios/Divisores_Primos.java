package es.Ejercicios;

public class Divisores_Primos {

    public static void main(String[] args) {
        //Mostrar los divisores primos de un numero entero
        
        int numero = 128;
        
        for (int i = 2; i < numero; i++) {
            if(numero % i == 0 ){
                if(esPrimo(i)){
                    System.out.println(i);
                }
            }
        }
    }

//    public static boolean divisores(int ref,int n) {
//            return (ref % n == 0);
//    }

    public static boolean esPrimo(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return (contador < 3);
    }
}
