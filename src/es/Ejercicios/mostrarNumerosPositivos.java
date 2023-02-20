package es.Ejercicios;

import java.util.Scanner;

public class mostrarNumerosPositivos {

    public static void main(String[] args) {
        /*
     Diseñar un programa que pida al usuario un número positivo y lo muestre    
    unidad a unidad. Por ejemplo, para el número 123, debe mostrar primero el 3,
    a continuación el 2, y por último el 1.   
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar numero positivo:");
        int num = sc.nextInt();

        while (num > 0) { 
            
            int n = num % 10;
            System.out.println(n);
            num /= 10;
        }


    }
}
