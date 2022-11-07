package es.Ejercicios;

import java.util.Scanner;

public class vocal {

    public static void main(String[] args) {
        /*
       Ejercicio 3. Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, 
        el programa termina cuando se introduce un espacio.
         */

        //Creamos la variable para para solicitar datos
        Scanner sc = new Scanner(System.in);
        //Variable guarda el valor por teclado
        String cadena;
        boolean stop = true;
        String vocal = "";
        String noVocal = "";
        System.out.println("Para finalizar pulsa ingresa un espacio");
        do {

            System.out.print("Ingresa caracteres:");
            cadena = sc.nextLine();
            vocal = "";
            noVocal = "";
            for (int i = 0; i < cadena.length(); i++) {
                char letras = cadena.toLowerCase().charAt(i);
                SEGUNDO:
                switch (letras) {
                    case 'a','e','i','o','u':
                        ;
                        vocal += letras;
                        break SEGUNDO;
                    default:
                        noVocal += letras;
                        break SEGUNDO;
                }
            }
            System.out.println("Vocal ingresadas: " + vocal);
            System.out.println("NO Vocal ingresadas: " + noVocal);

        } while (!cadena.equals(" "));

    }

}
