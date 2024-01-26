 /*
         * 4 Faça um programa que carregue uma matriz 8x6 de inteiros, calcule e mostre
         * a
         * média dos elementos das linhas pares da matriz.
*/

import java.util.Scanner;
import java.util.Locale;

public class exercicio_4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("digite os elementos");
        Scanner entrada = new Scanner(System.in);

        int mat[][] = new int[8][6];
        int soma = 0;
        int cont = 0;
        for (int c = 0; c < 6; c++) {
            for (int l = 0; l < 8; l++) {
                mat[l][c] = entrada.nextInt();
            }
        }
        for (int c = 0; c < 6; c++) {
            for (int l = 0; l < 8; l++) {
                System.out.print(mat[l][c] + "  ");
            }
            System.out.println(" ");
        }
        for (int c = 0; c < 6; c++) {
            for (int l = 0; l < 8; l++) {
                soma = soma + mat[l][c];
            }
            System.out.println("a media da linha " + cont + " é " + soma / 2);
            soma = 0;
            cont++;
        }
    }
}
