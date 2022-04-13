/*
15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package prueba1;

import java.util.Scanner;
public class Intro_E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lee = new Scanner(System.in);
       int numeUno;
       int numeDos, orden, resultado;
       boolean decision;
       String salir;
       System.out.println("Ingresá 2 números... ");
       numeUno = lee.nextInt();
       numeDos = lee.nextInt();
       
       
        
        decision = true;
       do {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        orden = lee.nextInt();
        switch (orden) {
            
             case 1: resultado = numeUno + numeDos;
                 System.out.println("La suma es " + resultado);
                 break;
             case 2: resultado = numeUno - numeDos; 
                System.out.println("La diferencia es " + resultado);
                break;
             case 3: resultado = numeUno * numeDos;
                 System.out.println("El producto es " + resultado) ;
                 break;
             case 4: resultado = numeUno / numeDos;
                 System.out.println("La división es " + resultado);
                 break;
             case 5: 
                 System.out.println("Seguro quieres salir? S/N");
                 salir = lee.next();
                 decision = !salir.equals("S");
             
       }       
             
                    
                             
    
    } while(decision);
        
        
        System.out.println("Adios!"); 
        
        
    }
    
}
