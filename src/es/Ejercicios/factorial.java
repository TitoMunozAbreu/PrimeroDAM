package es.Ejercicios;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar numero positivo:");

        long num = Long.parseLong(sc.next());
        long multi = 1;
        System.out.print(num);

        for (long i = num; i > 1; i--) {
            System.out.print(" x " + i);
            multi *= i;
        }
        System.out.println(" = " + multi);

    }

}
