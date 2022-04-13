/*
 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package prueba1;

import java.util.Scanner;

public class introJavaExtra4 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 10 para mostrar su equivalente en nº romano... ");
        int numeRom = lee.nextInt();
        equivalenteRomano(numeRom);
    }
    
    public static void equivalenteRomano (int num){
        if (num > 0 && num <= 10){
            switch (num){
                case 1: System.out.println("El número "+num+" es el I en Romano.");
                    break;
                case 2: System.out.println("El número "+num+" es el II en Romano.");
                    break;
                case 3: System.out.println("El número "+num+" es el III en Romano.");
                    break;
                case 4: System.out.println("El número "+num+" es el IV en Romano.");
                    break;
                case 5: System.out.println("El número "+num+" es el V en Romano.");
                    break;
                case 6: System.out.println("El número "+num+" es el VI en Romano.");
                    break;
                case 7: System.out.println("El número "+num+" es el VII en Romano.");
                    break;
                case 8: System.out.println("El número "+num+" es el VIII en Romano.");
                    break;
                case 9: System.out.println("El número "+num+" es el IX en Romano.");
                    break;
                case 10: System.out.println("El número "+num+" es el X en Romano.");
                    break;
                    
                    
            }
        } else {
            System.out.println("El número no está en el rango del 1 al 10.");
        }
    }
    
}
