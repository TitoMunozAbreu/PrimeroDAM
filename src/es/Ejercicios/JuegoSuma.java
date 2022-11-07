package es.Ejercicios;

import java.util.Scanner;

public class JuegoSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** JUEGO DE LA SUMA **");

        int a = 0;
        int b = 0;
        int aciertos = 0;
        int sumRandom = 0;
        int sumJugador = 0;
        String gameOver = "** GAME OVER **";

        do {
            a = (int) (Math.random() * 100 + 1);
            b = (int) (Math.random() * 100 + 1);
            sumRandom = a + b;
            System.out.print(a + " + " + b + " = ");
            sumJugador = Integer.parseInt(sc.next());
            if (sumRandom == sumJugador) {
                aciertos++;
            }

        } while (sumRandom == sumJugador);

        System.out.println(gameOver);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("La suma: " + a + " + " + b + " = " + sumRandom);

    }

}
