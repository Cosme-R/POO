/*
 *       mostra maior e menor elemento de uma matriz 
 */
import java.util.Scanner;
import java.util.Locale;

public class exercicio_6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("digite os elementos");
        Scanner entrada = new Scanner(System.in);

        int mat[][] = new int[6][3];

        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 6; l++) {
                mat[l][c] = entrada.nextInt();
            }
        }
        int menor = mat[0][0];
        int maior = mat[0][0];
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 6; l++) {
                if (mat[l][c] < menor)
                    menor = mat[l][c];
            }
        }
        System.out.println("menor elemenoto é   " + menor);
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 6; l++) {
                if (mat[l][c] > maior)
                    maior = mat[l][c];
            }
        }
        System.out.println("o maior elemenoto é   " + maior);

    }
}
