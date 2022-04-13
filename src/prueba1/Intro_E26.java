/*
26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
package prueba1;
import java.util.Scanner;

public class Intro_E26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int [][]matrizM = new int[10][10];
        int [][]matrizP = new int[3][3];
        boolean salir = false;
        int fila = 0;
        int col = 0;
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int)(Math.random()* 9);
                
            }
        }
        for (int i= 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("[ "+ matrizM[i][j]+ " ]");
        }
                System.out.println("");
    }
        
        System.out.println("MATRIZ M");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa un número para la posición "+ i + " y " + j);
                matrizP[i][j] = lee.nextInt();
            }
            
        }
        System.out.println("La matriz P qued1a así: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ "+ matrizP[i][j] + " ]" );
                
            }
            System.out.println("");
        }
        
        // Comprobar submatriz
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j+1] == matrizP[0][1] && matrizM[i][j+2] == matrizP[0][2]){
                    System.out.println("Se encontró la matriz pequeña a partir de la posicion " + i  + ", " + j );
                    k = k + 1;
                } if (matrizM[i+1][j] == matrizP[1][0] && matrizM[i+1][j+1] == matrizP[1][1] && matrizM[i+1][j+2] == matrizP[1][2]){
                    System.out.println("La 2da fila COINCIDE... ");
                    
                } if (matrizM[i+2][j] == matrizP[2][0] && matrizM[i+2][j+1] == matrizP[2][1] && matrizM[i+2][j+2] == matrizP[2][2]){
                    System.out.println("La 3ra fila COINCIDE... ");
                } 
                
                
        }
        }
        
        if (k < 1){
            System.out.println("No está la matriz pequeña...");
        }
    
    }
}
//Los métodos los nombro con un verbo
        
  


