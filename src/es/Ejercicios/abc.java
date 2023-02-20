package es.Ejercicios;

import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Ingresar numero:");
        int num = sc.nextInt();

        for (int i = num; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */
        System.out.print("Ingresa una letra MAYUSCULA:");
        char abc = sc.next().charAt(0);
        
        for (char i = abc; i >= 'A'; i--) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

}
