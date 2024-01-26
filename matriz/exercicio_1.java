 /* 
        1) Seja a matriz inteira valores (5x2). Preenchê-la por leitura, apresentar seus valores,
        e o produto de todos os seus elementos diferentes de zero.
 */

import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;

public class exercicio_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite os elementos ");
        int mat [][] = new int [5][2];
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                mat[l][c]=entrada.nextInt();
            }
        }
        System.out.println("matriz sem o elemento zero");
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                if(mat[l][c] == 0 ){
                    System.out.print(mat[l][c]+"  ");
                }
            }
            System.out.println("  ");
        }
    }
}