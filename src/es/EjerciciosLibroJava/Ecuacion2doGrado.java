package es.EjerciciosLibroJava;

import java.util.Scanner;

public class Ecuacion2doGrado {

    public static void main(String[] args) {
        /**
         * 1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus
         * soluciones reales. Si no existen, debe indicarlo.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("*Ecuacion de 2do Grado completas*");
        System.out.println("Ingresar coeficientes: ");
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        double xUno = 0;
        double xDos = 0;
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("NO existen soluciones reales");
        } else {
            if (a < 0) {
                System.out.println("NO es posible realizar una division entre cero");
            } else {
                xUno = -b + (Math.sqrt(d)) / 2 * a;
                xDos = -b - (Math.sqrt(d)) / 2 * a;
                System.out.printf("xUno =  %.2f%n", xUno);
                System.out.printf("xDos = %.2f%n" , xDos);
            }
        }

    }

}
