package strings;
import java.util.Scanner;
import java.util.Locale;
public class exercicio_1 {
   public static void main(String[] args) {
    System.out.println("Hello, World!");
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);

    /*
     * 1) Faça um programa que receba uma frase, calcule e mostre a quantidade de
        vogais da frase digitada. O programa deverá contar vogais maiúsculas e
        minúsculas.
     */
    System.out.println("digite uma frase ");
    String frase = entrada.nextLine();
    int quant =0;
    for(int x=0; x< frase.length(); x++){// length() comando que faz percorrer ate o final de forma automatica
        if(frase.charAt(x) == 'a' || frase.charAt(x) == 'e' || frase.charAt(x) == 'i' || frase.charAt(x) == 'o' || frase.charAt(x) == 'u'|| frase.charAt(x) == 'A'|| frase.charAt(x) == 'E'|| frase.charAt(x) == 'I'|| frase.charAt(x) == 'O'|| frase.charAt(x) == 'U'){
            quant++;
        }
    }
    System.out.println("a frase digitada é  "+frase);
    System.out.println("a frase digitada contam   "+quant+" vogais");


   } 
}
