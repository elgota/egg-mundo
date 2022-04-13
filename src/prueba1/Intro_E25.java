/*
25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package prueba1;

import java.util.Scanner;
public class Intro_E25 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[][]cuadradoMagico = new int[3][3];
        int sumaFila = 0;
        int sumaCol = 0;
        int sumaD = 0;
        int sumaDI = 0;
        int aux = 3;
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadradoMagico[i][j]= lee.nextInt();
                //cuadradoMagico[i][j]=(int)(Math.random()*9); //ALEATORIO
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ "+cuadradoMagico[i][j]+" ]");
            }
            System.out.println("");
        }
        //Sumar fila
        for (int i = 0; i < 3; i++) {
            sumaFila = sumaFila + cuadradoMagico[0][i];
        }
        //Suma columna
        for (int i = 0; i < 3; i++) {
            sumaCol = sumaCol + cuadradoMagico[i][0];
            
        }
        //Suma diagonal
        for (int i = 0; i < 3; i++) {
            sumaD = sumaD + cuadradoMagico[i][i];
            
        }
        //Suma diagonal invertida
        for (int i = 0; i < 3; i++) {
            sumaDI = sumaDI + cuadradoMagico[i][(aux-1)-i];
        }
        
        System.out.println("La suma de la fila es " + sumaFila);
        System.out.println("La suma de la columna es " + sumaCol);
        System.out.println("La suma de la diagonal principal es " + sumaD);
        System.out.println("La suma de la diagonal invertida es " + sumaDI);
        
        //Comprobar si es mágico*
        if(sumaFila == sumaCol && sumaD == sumaDI ){
            k =+ 1;
        } 
        System.out.println(""+ k);
        if (k > 0) {
            System.out.println("ES un cuadrado mágico...");
        } else {
            System.out.println("NO ES un cuadrado mágico...");
        }
    //FIN MAIN    
    }
    
}
