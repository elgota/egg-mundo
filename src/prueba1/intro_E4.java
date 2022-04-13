/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class intro_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gradosC;
        int gradosF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresá una temperatura en grados Cº ");
        gradosC = leer.nextInt();
        gradosF = 32 + (9 * gradosC/ 5);
        System.out.println("La temperatura en Fº es " + gradosF);
    }
    
    
    
    
   
    
    
}
