package vetor;
import java.util.Scanner;
import java.util.Arrays;
public class exercicio_2 {
    /*
2. Faça um programa que crie um vetor de inteiros de 10 posições, leia os
valores deste vetor e exiba o vetor na tela ordenado. Usar o comando for
each neste programa.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        System.out.println("digite dez numero");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }
        System.out.println("ordendo");
        Arrays.sort(vet);
        for (int ord : vet) {
            System.out.println(ord);
        }
    }
}
