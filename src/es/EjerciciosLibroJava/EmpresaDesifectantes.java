package es.EjerciciosLibroJava;

import java.util.Scanner;

public class EmpresaDesifectantes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Una empresa que se dedica a la venta de desinfectantes necesita un
         * programa para gestionar las facturas. En cada factura figura: el
         * código del artículo, la cantidad vendida en litros y el precio por
         * litro. Se pide de 5 facturas introducidas: Facturación total,
         * cantidad en litros vendidos del artículo 1 y cuantas facturas se
         * emitieron de más de 600 €. *
         */

        facturar(5);

    }

    private static void facturar(int cant) {
        int contador = 0;
        double totalLitros = 0;
        double totalFacturado = 0;
        double mayorFacturado = 0;
        double factura = 0;
        double litrosArticuloUno = 0;

        do {
            System.out.print("Ingresar codigo articulo:");
            int codArticulo = Integer.parseInt(sc.next());;

            System.out.print("Ingresar litros:");
            double litros = Double.parseDouble(sc.next());

            if (cant == 5) {
                litrosArticuloUno += litros;
            }

            totalLitros += litros;

            System.out.print("Ingresar precio x litro:");
            double precioLitro = Double.parseDouble(sc.next());

            factura = precioLitro * litros;
            totalFacturado += factura;

            if (mayorFacturado < factura) {
                mayorFacturado = factura;
            }
            cant--;
        }while(cant> 0);
        
        System.out.printf("Total Facturado:  %,.2f€%n", totalFacturado);
        System.out.printf("Litros vendidos Art. #1:  %,.2fLts%n", litrosArticuloUno);
        System.out.printf("Faturas mayores a 600EUR:  %,.2f€%n", mayorFacturado);

    }

}
