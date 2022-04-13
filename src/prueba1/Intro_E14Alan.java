/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Intro_E14Alan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, suma;
        
        suma = 0;
        
        for(int i = 0; i<20; i++) {
            System.out.println("ingrese un numero: ");
            num = scan.nextInt();
            
            if(num == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            } else if(num > 0) {
                suma += num;
            }
            
            System.out.println(suma);
        }
    }
}    
    

