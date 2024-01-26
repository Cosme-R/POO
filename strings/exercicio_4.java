package strings;
import java.util.Scanner;
import java.util.Locale;
public class exercicio_4 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        //4) Faça um programa para criptografar uma frase dada pelo usuário. Na criptografia, a frase
        //deverá ser invertida e as consoantes deverão ser trocadas por #. 

        System.out.println("digite uma frase ");
        String frase = entrada.nextLine();
        String ivertido = "";

        int f  =frase.length();  
        f--;
        for(f = f; f>-1; f--){
            ivertido = ivertido + frase.charAt(f);
        }
        ivertido = ivertido.replace("b", "*");
        ivertido = ivertido.replace("c", "*");
        ivertido = ivertido.replace("d", "*");
        ivertido = ivertido.replace("f", "*");
        ivertido = ivertido.replace("g", "*");
        ivertido = ivertido.replace("h", "*");
        ivertido = ivertido.replace("j", "*");
        ivertido = ivertido.replace("k", "*");
        ivertido = ivertido.replace("l", "*");
        ivertido = ivertido.replace("m", "*");
        ivertido = ivertido.replace("n", "*");
        ivertido = ivertido.replace("p", "*");
        ivertido = ivertido.replace("q", "*");
        ivertido = ivertido.replace("r", "*");
        ivertido = ivertido.replace("s", "*");
        ivertido = ivertido.replace("t", "*");
        ivertido = ivertido.replace("v", "*");
        ivertido = ivertido.replace("w", "*");
        ivertido = ivertido.replace("x", "*");
        ivertido = ivertido.replace("y", "*");
        ivertido = ivertido.replace("z", "*");

        System.out.println(ivertido);


    }
}
