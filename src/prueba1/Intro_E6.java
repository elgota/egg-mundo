/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeUno;
        int numeDos;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos número enteros. El mayor se mostrará... ");
        numeUno = leer.nextInt();
        numeDos = leer.nextInt();
        
        if (numeDos < numeUno) {
            System.out.println("El primer número " + numeUno + " es mayor que el otro. ");
        } else if (numeDos > numeUno) { 
            System.out.println("El segundo número " + numeDos + " es mayor que el otro. ");
        } else if (numeDos == numeUno) {
                System.out.println("Los dos son iguales.");
                }
        
        
        
        
        
    }
    
}
