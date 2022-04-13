/*
 18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package prueba1;

import java.util.Scanner;
public class Intro_E18 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int numero;
        int veces;
        int k = 0;
        String caracter = "*";
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa un número entre el 1 y 20");
            numero = lee.nextInt();
            if (numero < 1 || numero > 20){
                System.out.println("El número no es válido, ingresa otro número diferente...");
                numero = lee.nextInt();
            } 
            System.out.print("[ " + numero + " ]");
            for (int j = 0; j < numero; j++) {
                System.out.print(" * ");
                
            }
            System.out.println("");
            
            
            
        }
    }
    
}
