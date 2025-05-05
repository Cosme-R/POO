import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o numero 1 pra calcular o salario");
        System.out.println("digite o numero 2 pra calcular o imc");
        System.out.println("digite o numero 3 pra calcular dados do retangulo");
        System.out.println("digite o numero 4 pra fazer as 4 operaçoes");
        System.out.println("digite o numero 5 pra calcular os dados do quadrado");
        int seleciona = entrada.nextInt();

        switch(seleciona){  
            case 1:
                funcionario c = new funcionario();
                System.out.println("digite o nome do funcionario ");
                c.assalariado = entrada.nextLine();
                System.out.println("digite o salario ");
                c.salario = entrada.nextFloat();
                System.out.println(c.dados_assalariado());
                break;
            case 2:
                paciente p = new paciente();
                System.out.println("digite o nome do paciemte ");
                p.enfermo = entrada.next();
                System.out.println("digite o seu peso ");
                p.peso = entrada.nextFloat();
                System.out.println("digite sua altura");
                p.altura = entrada.nextFloat();
                p.imprimir();
                break;
            case 3:
                retangulo r = new retangulo();
                System.out.println("digite a base ");
                r.base = entrada.nextFloat();
                System.out.println("digite a altura ");
                r.altura = entrada.nextFloat();
                r.mostrar();
                break;
            case 4:    
                calculadora o = new calculadora();
                System.out.println("digite um numero ");
                o.nume1 = entrada.nextFloat();
                System.out.println("digite outro numero");
                o.nume2 = entrada.nextFloat();
                o.operacao();
                break;
            case 5:        
                quadrado q = new quadrado();
                System.out.println("digite o valor do lado");
                q.lado = entrada.nextFloat();
                q.impres();
            break;    
        }        
    }
}
