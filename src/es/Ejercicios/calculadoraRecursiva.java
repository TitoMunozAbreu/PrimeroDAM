package es.Ejercicios;

public class calculadoraRecursiva {

    public static void main(String[] args) {

        int n = 10;
        System.out.println("Suma recursiva = " + sumaR(n));
    }

    public static int sumaR(int n) {
        int sum = 0;

        if (n < 2) {
            sum = 1;
        } else {
            sum = n + sumaR(n - 1);
        }
        return sum;
    }

}
