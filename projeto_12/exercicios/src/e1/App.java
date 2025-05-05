package e1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);

        pessoa pe1 = new pessoa();
        System.out.println("digite o nome ");
        pe1.setnome(entrada.nextLine());
        System.out.println("digite a idade ");
        pe1.setidade(entrada.nextInt());
        pe1.imprime();
        

    }
}
