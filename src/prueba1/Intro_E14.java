/*
14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package prueba1;

import java.util.Scanner;

public class Intro_E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int suma;
        int i;
        Scanner lee = new Scanner(System.in);
        suma = 0;
        i = 0;
        
       do {
        
        System.out.println("Ingresa un número para suma");
        num = lee.nextInt();
        // Para detectar si es número negativo
        if (num < 0) {
            System.out.println("No se admiten números negativos. Vuelve a intentar.");
            
        } else { 
        suma += num;
        i = i + 1;
        
        if (num == 0) {
            System.out.println("Se capturó el numero cero. El resultado es " + suma);
            break;
        }
        }
        
        
    } while (i != 5);
              
       
        System.out.println("Llegaste al límite de números ingresados. El resultado es " + suma);
    }
    
}
