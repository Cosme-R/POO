package e4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);

        aluno alu = new aluno();
        System.out.println("digite a matricula ");
        alu.setmatricula(entrada.nextFloat());

        System.out.println("digite a nota 1");
        alu.setnota1(entrada.nextFloat());
        System.out.println("digite a nota 2");
        alu.setnota2(entrada.nextFloat());
        alu.imprime();

    }
}
