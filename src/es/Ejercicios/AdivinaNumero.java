package es.Ejercicios;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        /*
        Ejercicio 1. Crea una aplicación que permita adivinar un número. 
        La aplicación genera un número aleatorio del 1 al 100. 
        A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, 
        a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
         */

        //Creamos la variable para para solicitar datos
        Scanner sc = new Scanner(System.in);
        //Variable numero random del 1 al 100
        int numRandom = (int) (Math.random() * (100 - 1) + 1);
        //Variable numero ingresado
        int numJugador = 0;
        //Variable contador contiens 10 intentos;
        int contador = 10;
        //Variable booleana gameOver
        boolean gameOver = true;

        System.out.println("** ADIVINA EL NUMERO ENTRE 1 Y 100 **");

        do {
            System.out.println("TIENES " + contador + " INTENTOS");
            System.out.print("Ingresa un numero:");

            numJugador = Integer.parseInt(sc.next());

            if (numJugador != numRandom) {
                contador--;
                if (numJugador > numRandom) {
                    System.out.println("El numero a adivinar es menor a: " + numJugador);
                } else {
                    System.out.println("El numero a adivinar es mayor a: " + numJugador);
                }
            } else {
                System.out.println("ENHORABUENA " + numRandom + " ERA EL NUMERO HA AVDIVINAR");
                gameOver = false;
            }
        } while (gameOver);

    }

}
