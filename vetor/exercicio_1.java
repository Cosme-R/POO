package vetor;


import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

/*Faça um programa que carregue um vetor de dez números reais, calcule e
mostre a quantidade de números negativos e a soma dos números positivos
desse vetor. Usar o comando for each neste programa.
 */

public class exercicio_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

       int vet[] = new int [10];
       int negativo=0;
       int soma = 0;
       System.out.println("digite os numeros");
       for(int i=0; i<10; i++){
         vet[i] = entrada.nextInt();
       }
       Arrays.sort(vet);
       System.out.println("quantidade de numeros negativos");
        for(int i=0; i<10; i++){
            if(vet[i] < 0){
             negativo++;
            }
        }  
        System.out.println(negativo);
        System.out.println("soma dos numeros positivos ");
        for(int i=0; i<10; i++){
            if(vet[i] > 0){
             soma =soma + vet[i] ;
            }
        }
        System.out.println(soma);

    }
}
