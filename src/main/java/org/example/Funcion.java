package org.example;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el valor de un articulo: ");
        double numero = sc.nextDouble();

        double resul = getPrecioConIVA(numero);

        System.out.println("El valor final con el 19% de IVA es $" + resul);

    }

    private static double getPrecioConIVA(double price) {
        double total = price + (price * 0.19);
        return total;
    }
}