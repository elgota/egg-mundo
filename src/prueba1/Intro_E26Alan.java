package prueba1;
import java.util.Scanner;

public class Intro_E26Alan {

public static void main(String[] args) {
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        int[] res;
        llenarMatriz(M, 10, 10);
        llenarMatriz(P, 3, 3);
       res = encontrarSubMat(M, P, 10,10,3,3);
        System.out.println("se encontro el incio de P en M en la posicion"
                          +"["+res[0]+"]["+res[1]+"]");
    }
    public static int[] encontrarSubMat(int[][] mat, int[][] sub,int film,int colm, int fils,int cols) {
        int[] res = new int[2];
        inicializarVecRes(res,2);
        for(int i=0; i<=film-fils; i++) {
            for(int j=0; j<=colm-cols; j++) {
                if(mat[i][j] == sub[0][0]) {
                    if(verifSubMatriz(mat, sub, i,j, fils, cols)) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
        }
        return res;
    }
    public static void inicializarVecRes(int[] v, int tam) {
        for(int i=0; i<tam; i++) {
            v[i] = -1;
        }
    }
    public static boolean verifSubMatriz(int[][] m,int[][] s, int f,int c, int fil, int col) {
        for(int i=0; i<fil; i++) {
            for(int j=0; j<col; j++) {
                if(m[i+f][j+c] != s[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void llenarMatriz(int[][] m, int fil, int col) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los elementos de la matriz");
        for(int i=0; i<fil; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("["+i+"]["+j+"] : ");
                m[i][j] = scan.nextInt();
            }
        }
    }

}















