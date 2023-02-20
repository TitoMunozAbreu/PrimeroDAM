
package es.EjerciciosLibroJava;

public class MostrarCifrasReves{

    public static void main(String[] args) {
        
        int n = 60542018;
        int d = 0;
        do {            
            d = n%10;
            System.out.println(d);
            n /= 10;
        } while (n>0);
        

    }
    
}
