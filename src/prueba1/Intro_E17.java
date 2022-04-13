/*
 17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package prueba1;

import java.util.Scanner;

public class Intro_E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int elemento;
        System.out.println("Ingresa la cantidad de elementos");
        elemento = lee.nextInt();
        
        for (int i = 1; i < elemento + 1; i++) {
            for (int j = 1; j < elemento + 1; j++){
                
                if (i > 1 && i < elemento && j > 1 && j < elemento ){
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
                System.out.println("");
            
        }
        
    }
    
}
