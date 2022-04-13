/*
 22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package prueba1;

import java.util.Scanner;


public class Intro_E22 {

  
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int N;
        int unD=0;
        int dosD=0;
        int tresD=0;
        int cuatroD=0;
        int cincoD=0;
        System.out.println("Ingresa el tamaño del vector...");
        N = lee.nextInt();
        int []vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i]=(int)(Math.random() * 10000);
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        
        for (int i = 0; i < N; i++) {
            if (vector[i] > 0 && vector[i] < 9) {
            unD = unD + 1;
        } else if (vector[i] > 9 && vector[i] < 99){
            dosD =dosD + 1;
        } else if (vector[i] > 99 && vector[i] < 999){
            tresD = tresD + 1;
        } else if (vector[i] > 999 && vector[i] < 9999){
            cuatroD = cuatroD + 1;
        } else if (vector[i] > 9999 && vector[i] < 99999)
            cincoD = cincoD + 1;
        }
        System.out.println("");
        System.out.println(" [ " + unD + " ] son números de 1 dígito.");
        System.out.println(" [ " + dosD + " ] son números de 2 dígitos.");
        System.out.println(" [ " + tresD + " ] son números de 3 dígitos.");
        System.out.println(" [ " + cuatroD + " ] son números de 4 dígitos.");
        System.out.println(" [ " + cincoD + " ] son números de 5 dígitos.");
        
    }
    
}
