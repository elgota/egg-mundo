/*
 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package prueba1;

import java.util.Scanner;

public class introJavaExtra2 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int A, B, C, D, aux;
        System.out.println("Ingresa un valor diferente para A, B, C, D ");
        A = lee.nextInt(); B = lee.nextInt(); C = lee.nextInt(); D = lee.nextInt();
        System.out.println("A = " + A + " B= " + B + " C= " + C + " D=" + D );
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Las variables quedan de la siguiente manera. A= " + A + " B= " + B + " C= " + C + " D= " + D);
                
    }
    
    
    
    
}
