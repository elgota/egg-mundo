/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package prueba1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Intro_E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresá una nota para comprobar si es válida.");
        nota = lee.nextInt();
        while (nota < 0 || nota > 10 ) {
            System.out.println("La nota no es válida. Ingresa un valor de nuevo");
            nota = lee.nextInt();
        }
        
        System.out.println("La nota es correcta!");
        
        
   
    }
    
}
