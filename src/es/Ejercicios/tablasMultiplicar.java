
package es.Ejercicios;

public class tablasMultiplicar {

    public static void main(String[] args) {
        
        int multiplicacion = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("TABLA DE MULTIPLICAR x" + i);
            for (int j = 1; j <= 10; j++) {
                multiplicacion = i*j;
                System.out.println("\t" + i + " x " + j + " = " + multiplicacion);                
            }
            
        }
    }
    
}
