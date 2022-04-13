/*
10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase: ");
        frase = lee.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("La frase es CORRECTA!");
        } else {
            System.out.println("La frase es INCORRECTA. No comienza con A");
        }
        
    }
    
}
