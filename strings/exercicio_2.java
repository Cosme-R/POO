package strings;
import java.util.Scanner;
import java.util.Locale;

public class exercicio_2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);        
        /*
         * 2) Faça um programa que receba uma frase, calcule e mostre a quantidade de
         * palavras da frase digitada.
         */
        System.out.println("digite uma frase ");
        String frase = entrada.nextLine();
        int quant =0;
       
        for(int x=0; x< frase.length(); x++){// length() comando que faz percorrer ate o final de forma automatica
            if(frase.charAt(x) == ' '){
                quant++;
            }
        }
        quant++;
        System.out.println("a frase digitada é  "+frase);
        System.out.println("a frase digitada contem   "+quant+" frases");

    }
}
