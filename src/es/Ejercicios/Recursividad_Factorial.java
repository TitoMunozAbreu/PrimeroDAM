
package es.Ejercicios;

import java.math.BigDecimal;

public class Recursividad_Factorial {

    public static void main(String[] args) {
        
        System.out.println("Factorial recursivo = "+factorial(8));
    }
    
    public static int factorial (int n){
       int r = 0;
        
        if(n < 2){
            r = 1;
        }else{
            r = n * (factorial(n-1)); 
        }
        return r;
    }
    
}
