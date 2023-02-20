package es.Ejercicios;

import java.util.Scanner;

public class DivisoresPrimos {

    public static void main(String[] args) {
        //Diseñar una funcion a la que se le pase un numero entero y devuelva
        // el numero de divisores primos que tiene.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i < numero; i++) {
            if(Divisor(numero, i)){
                if(Primo(i)){
                    System.out.println(i);
                }
            }
        }
        

    }

    private static boolean Primo(int n) {

        int contador = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return contador < 2;

    }

    private static boolean Divisor(int ref, int n) {
        return ref % n == 0;

    }

}
