package es.Ejercicios;

public class Recursividad_MaximoDivisor {

    public static void main(String[] args) {
        int x = 80;
        int z = 70;

        System.out.println("El MCD con iteracion es = " + mcd(x, z));
        System.out.println("El MCD con recursividad = " + mcdR(x, z));

    }

    public static int mcdR(int a, int b) {
        int mayor = 0;
        
        //CasoBase
        if (a == 0) {
            mayor = b;
        } else if (b == 0) {
            mayor = a;
        } else {
            int min = a <= b ? a : b;
            int max = a <= b ? b : a;

            mayor = mcdR(min, max - min);

        }

        return mayor;
    }

    public static int mcd(int a, int b) {
        int mayor = 0;
        int r = (a > b) ? a : b;

        for (int i = 1; i < r; i++) {
            if (a % i == 0 && b % i == 0) {
                mayor = i;
            }
        }

        return mayor;

    }

}
