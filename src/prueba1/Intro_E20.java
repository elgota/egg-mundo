/*
 Funciones en Java
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package prueba1;

/**
 *
 * @author Admin
 */
public class Intro_E20 {

    public static void main(String[] args) {
        int [] cienEnteros = new int[100];
        for (int i = 0; i < 99; i++) {
            cienEnteros[i] = (int) (Math.random() * 100);
            //int numero = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 99; i++) {
            System.out.println(" [ " + cienEnteros[i] + " ] ");
            
        }
    }
    
}
