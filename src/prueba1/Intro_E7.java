/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
7. Crear un programa que dado un numero determine si es par o impar
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int parOImpar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá un número: ");
        parOImpar = leer.nextInt();
        if (parOImpar % 2 == 0) {
            System.out.println("El número " + parOImpar + " es PAR ");
            
        } else {
            System.out.println("El número " + parOImpar + " es IMPAR ");
        }
    }
    
}
