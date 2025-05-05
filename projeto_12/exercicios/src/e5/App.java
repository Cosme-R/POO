package e5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);


        System.out.println("primeiro funcionario");
        funcionario func1 = new funcionario();
        System.out.println("digite a idade ");
        func1.setidade(entrada.nextInt());
        System.out.println("digite tempo de serviço");
        func1.setanos_serviço(entrada.nextInt());
        System.out.println("digite o salario");
        func1.setsalário(entrada.nextInt());
        System.out.println("segundo funcionario");
        funcionario func2 = new funcionario(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());



        System.out.println("\n\nprimeiro funcionario");
        func1.imprimi();
        System.out.println("\n\nsegundo funcionario");
        func2.imprimi();
    }
}
