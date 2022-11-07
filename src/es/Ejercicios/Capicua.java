package es.Ejercicios;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        //Escribe una aplicacion que solicite al usuario un numero comprendido 
        // entre 0 y 9999. Indicar si el numero introducido es capicua
        Scanner sc = new Scanner(System.in);
        System.out.println("***VERIFICADOR DE NUMERO CAPICUA****");
        System.out.print("Ingresa un numero entero entre 0 y 9999: ");
        int entero = Integer.parseInt(sc.next());

        //Variable para calcular la UNIDAD del numero
        int unidad = entero%10;
        //Variable para calcular la DECENA del numero
        int decena = (entero%100)/10;
        //Variable para calcular la CENTENA del numero
        int centena = (entero%1000)/ 100;
        //Variable para calcular el millar del numero
        int uMillar = entero / 1000;
        
        //Verificar sea de dos cigra
        if (entero >= 0 && entero < 10000) {
            //Comprobar en caso que el numero sea DOS CIFRAS
            if ((uMillar == 0 && centena == 0) && (unidad == decena)) {
                System.out.println("El numero: " + entero + " SI es CAPICUA");
            //Comprobar en caso que el numero sea TRES CIFRAS
            } else if ((uMillar == 0 && centena != 0) && (centena == unidad)) {
                System.out.println("El numero: " + entero + " SI es CAPICUA");
            //Comprobar en caso que el numero sea CUATRO CIFRAS
            } else if ((uMillar == unidad) && (centena == decena)) {
                System.out.println("El numero: " + entero + " SI es CAPICUA");
            }else{
                System.out.println("El numero: " + entero + " NO es CAPICUA");
            }
        } else {
            System.out.println("Debes ingresar un numero entre 0 y 9999");
        }

    }

}
