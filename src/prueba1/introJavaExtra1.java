/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class introJavaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double min, horas, dias;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa el tiempo en minutos: ");
        min = lee.nextDouble();
        horas = min * 0.0166;
        dias = min * 0.000694;
        System.out.println(min + " minutos equivalen a " + horas + " horas y " + dias + " día/s.");
    }
}
