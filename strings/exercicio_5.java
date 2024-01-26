package strings;
import java.util.Scanner;
import java.util.Locale;

public class exercicio_5 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);        
        /*
         5) Faça um programa que receba uma frase e mostre cada palavra dela em uma linha
        separada.
         */
        System.out.println("digite uma frase ");
        String frase = entrada.nextLine();
        int quant=0;
        for(int x=0; x< frase.length(); x++){// length() comando que faz percorrer ate o final de forma automatica
            if(frase.charAt(x) == ' '){
                quant++;
            }
        }
        quant++;
        String[] array=frase.split(" ");
        System.out.println(" ");
        for(int x =0; x  < quant; x++){
            System.out.println( array[x]);
        }
    }
}
