package e3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);

        quadrado are1 = new quadrado();
        System.out.println("digite o tamanho ");
        are1.settamanho(entrada.nextFloat());
        System.out.println("digite o valor lado");
        are1.setlado(entrada.nextFloat());
        System.out.println(are1.area());

        
        
    }
}
