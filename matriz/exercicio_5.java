/*
         * 5 Elabore um programa que preencha uma matriz 6x4 com números inteiros,
         * calcule e
         * mostre quantos elementos dessa matriz são maiores que 30 e, em seguida, monte
         * uma segunda matriz com os elementos diferentes de 30. No lugar do número 30
         * da
         * segunda matriz, coloque o número zero.
 */

import java.util.Scanner;
import java.util.Locale;
public class exercicio_5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
       // System.out.println("digite os elementos");
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite os elementos");
        int mat[][] = new int[6][4];
        int cont = 0;
        for (int c = 0; c < 4; c++) {
            for (int l = 0; l < 6; l++) {
                mat[l][c] = entrada.nextInt();
            }
        }
        System.out.println("matriz ");
        for (int c = 0; c < 4; c++) {
            for (int l = 0; l < 6; l++) {
                System.out.print(mat[l][c] + " ");
            }
            System.out.println(" ");
        }

        for (int c = 0; c < 4; c++) {
            for (int l = 0; l < 6; l++) {
                if (mat[l][c] > 29) {
                    cont++;
                }
            }
        }
        System.out.println("quantos elementos sao maior que 30  " + cont);

        System.out.println("substituindo os numeros 30  ");
        for (int c = 0; c < 4; c++) {
            for (int l = 0; l < 6; l++) {
                if (mat[l][c] != 30) {
                    System.out.print(mat[l][c] + " ");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println(" ");
        }
    }
}
