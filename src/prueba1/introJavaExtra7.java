/*
 7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package prueba1;

import java.util.Scanner;


public class introJavaExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        System.out.println("Cuántos números quieres ingresar? ");
        int n = lee.nextInt();
        int k = 0;
        
        int num;
        int numeMin=0;
        while(k != n){
            System.out.println("Ingresa un número ");
            num = lee.nextInt();
            k = k + 1;
            /*if (numeMin < num){
                numeMin = num;
                System.out.println("El número mínimo es "+numeMin);
                k = k + 1;
        }*/
    }
    
  
    }
}
