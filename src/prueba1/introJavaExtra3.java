/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package prueba1;

import java.util.Scanner;

public class introJavaExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese una letra para comprobar si es vocal... ");
        String letra = lee.next();
        detectarVocal(letra);
    }
    
    public static void detectarVocal(String vocal) {
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u") ){
            System.out.println("Se detectó una VOCAL.");
        } else {
            System.out.println("No se detectó una VOCAL.");
        }
    
}
    
}
