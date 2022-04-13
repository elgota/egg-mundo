/*
 23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
package prueba1;
import java.util.Scanner;

public class Intro_E23 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[][]matriz = new int [4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random()* 9);
                
            }
            
        }
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz[i][j] + " ]");
                }
                System.out.println("");
            }
        
    }
    
}
