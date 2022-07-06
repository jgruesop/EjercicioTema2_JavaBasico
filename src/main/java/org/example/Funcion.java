package org.example;

public class Funcion {
    public static void main(String[] args) {
        double precio = getPrecioConIVA(10000);
        System.out.println(precio);

    }

    private static double getPrecioConIVA(double price) {
        return price * 0.19;
    }
}