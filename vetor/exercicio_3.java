package vetor;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class exercicio_3 {
    public static void main(String[] args) throws Exception {
        System.out.println("digite as alturas ");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        /*
        3 Escreva um programa que receba a altura de 10 atletas. Esse programa deve
        imprimir a altura daqueles atletas que tem altura maior que a média.
        */

        int vet[] = new int[10];
        int soma=0;
        int media=0;
        for(int i=0; i<10; i++){
            vet[i]= entrada.nextInt();
        }
        Arrays.sort(vet);
        for(int i=0; i<10; i++){
            soma= soma+vet[i];
        }
        media = (soma/10);
        System.out.println("alturas acima da media ");
        for(int i=0; i<10; i++){
            if(vet[i]> media){
                System.out.println(vet[i]);
            }
        }
    }
}
