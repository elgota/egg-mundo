/*
24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package prueba1;

import java.util.Scanner;

public class Intro_E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[][]matriz = new int [3][3];
        int[][]matrizA= new int [3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*9);
            }
           
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ "+matriz[i][j]+" ]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j]= -1 * matriz[i][j] ;
            }
           
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ "+matrizA[i][j]+" ]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matrizA[i][j]){
                k = k + 1;
                    
        }
            }
            
        }
     
        if(k == 9){
            System.out.println("Es una matriz anti-simétrica...");
        }
        //fin main
    }
    
}
