package es.Ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Recursividad_Fecha {

    public static void main(String[] args) {
        
        System.out.println("Horas vividas Recursiva = " + fechaRecursiva(1991));
        

    }

    
    public static int fechaRecursiva(int fn) {
        int horasVividas;

         if(fn == 2022){
         horasVividas = 1;
         }else{
         horasVividas = 12 *30 *24 + fechaRecursiva(fn+1);
         }

        return horasVividas;
    }

}
