/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fraseOcho;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase... ");
        fraseOcho = leer.nextLine();
        
        if (fraseOcho.length() == 8) {
            System.out.println("La frase tiene la longitud CORRECTA.");
        } else {
            System.out.println("La frase es INCORRECTA.");
        }
            
        
    }
    
}
