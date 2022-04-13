/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
*/
package prueba1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Intro_E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroLimite;
        int sumaNum;
        int num;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa el número límite... ");
        numeroLimite = lee.nextInt();
        sumaNum = 0;
        
        while (sumaNum < numeroLimite) {
            System.out.println("Ingresa un número para sumar... ");
            num = lee.nextInt();
            sumaNum = sumaNum + num;
            System.out.println("La suma es... " + sumaNum);
        }
        
        System.out.println("Superaste el número límite. El resultado es " + sumaNum);
        
    }
    
}
