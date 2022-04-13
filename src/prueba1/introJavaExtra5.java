/*
 5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class introJavaExtra5 {

   
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el costo del tratamiento: ");
        int tratamiento = lee.nextInt();
        System.out.println("Qué tipo de socio sos? A/ B/ C");
        String socio = lee.next();
        descuentoSocio(tratamiento,socio);
        
    }
    
    public static void descuentoSocio (int tratam, String soc){
        
        double costo;
        if (soc.equals("A")){
            costo = tratam / 2;
            System.out.println("Tienes un 50% de descuento en el tratamiento. Te corresponde abonar: $ "+costo);
        } else if (soc.equals("B")) {
            costo = tratam * 0.65;
            System.out.println("Tienes un 35% de descuento en el tratamiento. Te corresponde abonar: $ "+costo);
            
        } else {
            System.out.println("No tienes ningún tipo de descuento...");
        }
        
        
    }
    
}
