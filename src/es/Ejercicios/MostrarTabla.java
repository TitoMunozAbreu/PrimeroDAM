
package es.Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MostrarTabla {

    public static void main(String[] args) {
        mostrarTabla();
    }
    
    public static void mostrarTabla(){
        double[] n = new double[5];
        Scanner escribir = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = Double.parseDouble(escribir.next());
        }
        System.out.println(Arrays.toString(n));
        
    }
    
}
