
package es.Ejercicios;

import java.util.Scanner;

public class ContadorWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       //Variable contador
       int contador = 1;
       int numero;
       int suma = 0;
       int promedio = 0;
       
       while(contador <=10){
           System.out.print("Ingresar numero:");
           numero = Integer.parseInt(scan.next());
           suma += numero;
           promedio = suma /contador;
           
           contador++;

       }
        System.out.println("La suma = " + suma);
        System.out.println("Promedio = " + promedio);

    }
    
}
