/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá un número para saber su dobre, triple y raíz cuadrada... ");
        numero = leer.nextInt();
        System.out.println("El doble del número " + numero + " es " + numero * 2);
        System.out.println("El triple de " + numero + " es " + numero * 3);
        System.out.println("La raiz cuadrada de " + numero + " es ");
        System.out.println(Math.sqrt(numero));
        
    }
    
}
