package es.Ejercicios;

import java.util.Scanner;

public class NumeroLetras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       

        System.out.println("CONVERTIDOR DE NUMEROS A LETRAS");
        System.out.print("Ingresa un numero entero entre 1 y 99: ");
        int entero = Integer.parseInt(sc.next());

        //Variable para almacenar la unidad del numero
        int unidad = entero % 10;
        //Variable para almacenar la decena del numero
        int decena = entero / 10;

        //Variable para mostrar el numero en letras 
        String numeroletra = "";

        //Comprobar que el numero se encuentre en el rango establecido
        if (entero > 0 && entero < 100) {
            //Comprobar si el numero decena igual a uno y la unidad entre 0 o 9
            if (decena == 1 && unidad != 0) {
                switch (entero) {
                    case 11:
                        numeroletra += "once ";
                        break;
                    case 12:
                        numeroletra += "doce ";
                        break;
                    case 13:
                        numeroletra += "trece ";
                        break;
                    case 14:
                        numeroletra += "catorce ";
                        break;
                    case 15:
                        numeroletra += "quince ";
                        break;
                    case 16:
                        numeroletra += "dieciseis ";
                        break;
                    case 17:
                        numeroletra += "diecisiete ";
                        break;
                    case 18:
                        numeroletra += "dieciocho ";
                        break;
                    case 19:
                        numeroletra += "diecinueve ";
                        break;
                }

            }
            //
            if (decena > 0 && unidad == 0 || decena > 1 && unidad  > 0 ) {
                switch (decena) {
                    case 1:
                        numeroletra += "diez ";
                        break;
                    case 2:
                        numeroletra += "veinte ";
                        break;
                    case 3:
                        numeroletra += "treinta ";
                        break;
                    case 4:
                        numeroletra += "cuarenta ";
                        break;
                    case 5:
                        numeroletra += "cincuenta ";
                        break;
                    case 6:
                        numeroletra += "sesenta ";
                        break;
                    case 7:
                        numeroletra += "setenta ";
                        break;
                    case 8:
                        numeroletra += "ochenta ";
                        break;
                    case 9:
                        numeroletra += "noventa ";
                        break;
                }
            }
            // Comprobar para agregar  la letra "y"
            if (decena > 1 && unidad > 1) {
                numeroletra += "y";
            }
            //verifica si el numero contiene es UNIDAD
            if (decena < 1 && unidad > 0 || decena > 1 && unidad > 0) {
                switch (unidad) {
                    case 1:
                        numeroletra += " uno";
                        break;
                    case 2:
                        numeroletra += " dos";
                        break;
                    case 3:
                        numeroletra += " tres";
                        break;
                    case 4:
                        numeroletra += " cuatro";
                        break;
                    case 5:
                        numeroletra += " cinco";
                        break;
                    case 6:
                        numeroletra += " seis";
                        break;
                    case 7:
                        numeroletra += " siete";
                        break;
                    case 8:
                        numeroletra += " ocho";
                        break;
                    case 9:
                        numeroletra += " nueve";
                        break;
                }
            }
            System.out.println(entero + " = " + numeroletra);
        } else {
            System.out.println("Debes ingresar un numero entre 1 y 99");
        }

    }
}
