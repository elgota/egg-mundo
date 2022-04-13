/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IntroJavaExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas ");
        int N = lee.nextInt();
        double []alturaP = new double[N];
        for (int i = 0; i < N; i++) {
          System.out.println("Ingresa la altura de la persona "+(i+1));
          alturaP[i]= lee.nextDouble();
            System.out.println("La altura de la persona "+i+" es igual a "+alturaP[i]);
        }
        calculaPromedio(alturaP, N);
    }
    
    public static void calculaPromedio (double []alturaP, int N){
        
        double promedio, k=0, sumAltura=0;
        for (int i = 0; i < N; i++) {
            if (alturaP[i]<= 1.60){
                sumAltura = alturaP[i] + sumAltura;
                k = k + 1;
            }
        }
        
        promedio = sumAltura / k;
        System.out.println("El promedio de las personas que miden 1,60 Mts es "+promedio);
    }
    
    
}
