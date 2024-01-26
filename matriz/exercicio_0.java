 /*
        *0  Fazer um programa para ler um número inteiro N e uma matriz de ordem N
        contendo números inteiros. Em seguida, mostrar a diagonal principal e a
        quantidade de valores negativos da matriz.
*/
import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;
public class exercicio_0 {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = 0;
        int diagonal=0; 
        int negativos =0;
        System.out.println("digite o tomanho da matriz  ");
        n = entrada.nextInt();
        int mat [][] = new int[n][n];
        System.out.println("digite os elementos da matriz ");
        //entrada de dados
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                mat[l][c]=entrada.nextInt();
            }
        }
        // numeros negativos 
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                if( mat[l][c] <0){
                    negativos++;
                }
            }
        }
        System.out.println("quantidade de numeros negativos "+ negativos);
        //impressão dos numeros  em diagonal na  matriz
        System.out.print("numeros que estão na diagonal  ");
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {

                System.out.print( mat[diagonal][diagonal]+" ");
                diagonal ++;
            }
            //System.out.println(" ");
        }
    }
}