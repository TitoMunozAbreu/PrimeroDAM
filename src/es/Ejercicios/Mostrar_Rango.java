
package es.Ejercicios;

public class Mostrar_Rango {

    public static void main(String[] args) {
        
//        System.out.println("Rango recursividad: " + mostrarRango(20,20));
           mostrarRango(20, 10);
           
    }
    

    
    public static void mostrarRango(int a, int b){
        int mayor = a > b ? a : b;
        int menor = (a > b) ? b : a;
        boolean trueFalse = (a == b);
        System.out.println("Son iguales?: " + trueFalse);
        
        for (int i = menor+1; i < mayor; i++) {
            System.out.println(i);
        }

    }
}
