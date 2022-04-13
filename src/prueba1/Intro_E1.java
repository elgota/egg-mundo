/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeUno;
        int numeDos;
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá 2 números enteros: ");
        numeUno = leer.nextInt();
        numeDos = leer.nextInt();
        
        suma = numeUno + numeDos;
        System.out.println("El resultado es " + suma);
        
        
    }
    
}
