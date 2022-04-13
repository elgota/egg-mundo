/*
 19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package prueba1;

import java.util.Scanner;
public class Intro_E19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de dinero en euros...");
        double euros = lee.nextFloat();
        double [] divisa = new double[3];
        System.out.println("El cambio a divisas.. ");
        divisa[0] = euros * 0.86; System.out.println("Equivale a " + divisa[0] + " libras.");
        divisa[1] = euros * 1.28611; System.out.println("Equivale a U$S " + divisa[1]);
        divisa[2] = euros * 129.852; System.out.println("Equivale a " + divisa[2] + " yenes.");
    }
    
}
