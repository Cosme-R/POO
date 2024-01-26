
 /*
         3) Faça um programa que carregue uma matriz 10x15 com números inteiros e some
        cada uma das linhas, armazenando o resultado das somas em um vetor. A seguir,
        multiplique cada elemento da matriz pela soma da linha e mostre a matriz resultante.
 */
        


import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;

public class exercicio_3 {
    public static void main(String[] args) throws Exception {
        System.out.println("digite os elementos ");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int l, c, soma;
        int mat[][] = new int [5][10]; 
        int somaLinhas[] = new int [5];
        int somaColunas[] =new int[10];
        // preenche a matriz
        for(l = 0; l < 5; l++){
            for(c = 0; c < 10; c++){
                mat[l][c] = entrada.nextInt();
            }
        }

        // impressão das estruturas
        System.out.println("Matriz:");
        for(l = 0; l < 5; l++){
            for(c = 0; c < 10; c++){
                System.out.print("  "+ mat[l][c]);
            }
            System.out.println(" ");
        }

        // letra a) soma das linhas
        for(l = 0; l < 5; l++){
            soma = 0;
            for(c = 0; c < 10; c++){
                soma += mat[l][c];
            }
            somaLinhas[l] = soma;
        }

        // letra b) soma das colunas
        for(c = 0; c < 10; c++){
            soma = 0;
            for(l = 0; l < 5; l++){
                soma += mat[l][c];
            }
            somaColunas[c] = soma;
        }

        System.out.println("Vetor com a soma das linhas:\n");
        for(l = 0; l < 5; l++){
            System.out.println("Linha "+ l+"\n "+ somaLinhas[l]);
        }

        System.out.println("Vetor com a soma das colunas:\n");
        for(c = 0; c < 10; c++){
            System.out.println("Coluna: "+ c+" \n"+ somaColunas[c]);
        }
    }
}