package es.Ejercicios;

import java.util.Scanner;

public class mayorMenorIgualCero {

    public static void main(String[] args) {
        /*
        Ejercicio 2. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
        El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
         */

        //Creamos la variable para para solicitar datos
        Scanner sc = new Scanner(System.in);
        //Variable almacena numero por teclado
        int num = 0;
        //Variable contador para la veces a solicitar el numero
        int contador = 5;
        //Variable mayor a cero
        int mayorCero = 0;
        //Variable menor a cero
        int menorCero = 0;
        //Variable igual a cero
        int igualCero = 0;

        do {
            //Solicitar numero
            System.out.print("Introducir numero:");
            //Almacenamos el numero
            num = Integer.parseInt(sc.next());

            //Comprobar que el num sea igual a cero
            if (num == 0) {
                igualCero++;
                contador--;
                //Comprobar que el num sea mayor a cero
            } else if (num > 0) {
                mayorCero++;
                contador--;
                //Comprobar que el num sea menor a cero
            } else {
                menorCero++;
                contador--;
            }

        } while (contador != 0);

        if (mayorCero != 0) {
            System.out.println("numeros introducidos mayor a cero = " + mayorCero);
        }if (menorCero != 0) {
            System.out.println("numeros introducidos menor a cero = " + menorCero);
        }if (igualCero != 0) {
            System.out.println("numeros introducidos igual a cero = " + igualCero);
        }

    }

}
