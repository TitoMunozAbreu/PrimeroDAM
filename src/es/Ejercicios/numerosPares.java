package es.Ejercicios;

import java.util.Scanner;

public class numerosPares {

    public static void main(String[] args) {
        /*
        Ejercicio 4. Escribir un programa que imprima todos los 
        números pares entre dos números que se le pidan al usuario.
         */

        //Creamos la variable para para solicitar datos
        Scanner sc = new Scanner(System.in);
        System.out.println("** NUMEROS PARES ENTRE DOS NUMEROS");
        System.out.print("Ingresa un numero:");
        int a = Integer.parseInt(sc.next());
        System.out.print("Ingresa un numero:");
        int b = Integer.parseInt(sc.next());;
        int resta = a - b;
        int par = 0;

        if (resta < 0) {
            resta *= -1;
        }
        int contador = resta;

        System.out.println("Numeros pares entre " + a + " y " + b + ":");
        while (contador > 0) {
            if (resta % 2 == 0) {
                System.out.println(resta);
            }
            resta--;
            contador--;
        }

    }

}
