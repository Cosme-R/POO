 /*
        2) Seja a matriz inteira números (7x5). Preenchê-la por leitura, apresentar seus
        valores, bem como o menor elemento de sua última linha.
*/

import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;

public class exercicio_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int mat [][] = new int [7][5];
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                mat[l][c]=entrada.nextInt();
            }
        }
        for (int l=0;l< mat.length;l++){
            for (int c=0;c< mat[l].length;c++) {
                System.out.print(mat[l][c]+"  ");
            }
            System.out.println("  ");
        }
        int aux= mat[6][0];
        for (int c=0;c< 5;c++){
            //mat[6][c];

            if(mat[6][c]<aux){
                aux = mat[6][c];
            }
        }
        System.out.println(" menor ");
        System.out.println(aux);
    }
}