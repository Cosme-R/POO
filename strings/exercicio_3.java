package strings;
import java.util.Scanner;
import java.util.Locale;
public class exercicio_3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);  
        //3) Faça um programa para criptografar uma frase dada pelo usuário (a
        //criptografia troca as vogais da frase por *).

        System.out.println("digite uma frase ");
        String frase = entrada.nextLine();
        frase = frase.replace("a", "*");
        frase = frase.replace("e", "*");
        frase = frase.replace("i", "*");
        frase = frase.replace("o", "*");
        frase = frase.replace("u", "*");
        frase = frase.replace("A", "*");
        frase = frase.replace("E", "*");
        frase = frase.replace("I", "*");
        frase = frase.replace("O", "*");
        frase = frase.replace("U", "*");
        System.out.println("a frase criptografada é " + frase );


        //System.out.println(" a frase é "+crip);
          


    }
}
