package ee6;


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);



        circulo calc1 = new circulo();
        System.out.println("digite o raio ");
        calc1.setraio(entrada.nextDouble());

        System.out.println("resultado");
        calc1.imprimi();
    }
}
