package es.Ejercicios;

public class Recursividad_Potencia {

    public static void main(String[] args) {

        System.out.println(" La Recursividad potencia = " + rPotencia(5, 5));
        System.out.println(" La potencia = " + potencia(5, 5));
    }

    public static int rPotencia(int a, int n) {
        int result = 0;
        if (n < 1) {
            result = 1;
        } else {
            result = a * rPotencia(a, n - 1);
        }
        return result;
    }

    public static int potencia(int a, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= a;
        }

        return result;

    }

}
