/*
16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
package prueba1;

import java.util.Scanner;
public class Intro_E16 {

    public static void main(String[] args) {
    Scanner lee = new Scanner(System.in);
    String fraseForma;
    int correctas = 0;
    int incorrectas = 0;
    boolean especial = true;
    do {
        System.out.println("Ingresa una frase fija de 5 caracteres máximo ");
        fraseForma = lee.next();
        if (fraseForma.length() > 5){
            System.out.println("La frase excede los 5 caracteres. Prueba otra vez :)");
            fraseForma = lee.next();
        } else if (fraseForma.equals("&&&&&")){
            especial = false;
            correctas += 1;
            incorrectas -= 1;
        }
        System.out.println("[ " + fraseForma + " ]");
        
        if (fraseForma.substring(0,1).equals("X") && fraseForma.substring(4).equals("O") ){
            
            correctas += 1;
        } else {
            incorrectas += 1;
        }
        
        
    }while(especial);
    //Declaro cuántas frases está ok y cuantas no
        System.out.println("Las frases OK son " + correctas);
        System.out.println("Las frases con ERROR son " + incorrectas);
    
    
    }
    
    
    
}
