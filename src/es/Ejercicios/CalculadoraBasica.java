package es.Ejercicios;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

public class CalculadoraBasica {

    public static void main(String[] args) {
        //Crear la clase scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\t** CALCULADORA BASICA **");
        //Solicitar 1er numero
        System.out.print("Ingresar primer numero:");
        int a = Integer.parseInt(sc.next());
        //Solicitar 2do numero
        System.out.print("Ingresar segundo numero:");
        int b = Integer.parseInt(sc.next());
        System.out.print("Ingresar Operador(+-*/):");
        char operacion = sc.next().charAt(0);
        int total = 0;

        switch (operacion) {
            //Verificar el operando ingresado
            case '+':
                total = a + b;
                System.out.println("SUMA = " + total);
                break;
            case '*':
                total = a * b;
                System.out.println("MULTIPLICACION = " + total);
                break;
            case '/':
                total = a / b;
                System.out.println("DIVISION = " + total);
                break;
            case '-':
                total = a - b;
                System.out.println("RESTA = " + total);
                break;
            default:
                System.out.println("NO has ingresado un operando valido"); 

        }

    }

}
