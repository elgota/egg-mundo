/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido.
 */
package prueba1;

import java.util.Scanner;

public class Intro_E21 {

    public static void main(String[] args) {
        int N;
        int busca;
        int veces = 0;
        int pos = 0;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector...");
        N = lee.nextInt();
        int [] vector = new int[N];
        //Relleno vector
        for (int i = 0; i < N-1; i++) {
            vector[i] = (int)(Math.random()*30); 
        }
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector[i] + " ]");
            
        }
        System.out.println("");
        System.out.println("Ahora ingresa un número para buscar... ");
        busca = lee.nextInt();
        
        for (int i = 0; i < N; i++) {
            pos = pos + 1;
            if (busca == vector[i]){
                
                veces = veces + 1;
                System.out.println("El número se encuentra en la posición " + pos);
                
                
            } 
        }
        
        if (veces >= 1) {
            System.out.println("Se repite " + veces + " vez/veces.");
        }
        System.out.println("");
        
    }
    
}
