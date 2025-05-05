import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o numero 1 primerio exercicio");
        System.out.println("digite o numero 2 pra segundo exercicio");
        System.out.println("digite o numero 3 pra terceiro exercicio");
        System.out.println("digite o numero 4 quarto exercicio");
       
        int seleciona = entrada.nextInt();

        switch(seleciona){  
            case 1:
            gerente a = new gerente();
            System.out.println("digite o salario ");
            a.salario  = entrada.nextFloat();
            System.out.println("digite a taxa");
            int taxa= entrada.nextInt();
            gerente.aumenta_salario(taxa);
            gerente.aumenta_salario();

                break;
            case 2:
            System.out.println("digite os dados do triangulo ");
                triangulo tri = new triangulo(entrada.nextDouble(),entrada.nextDouble());
                triangulo.area();
                break;
            case 3:
                System.out.println("empresa 1 ");
                System.out.println(" digite o nome, enderço, cidade, estado, valor patrimonial, quantidade de funcionario ");
        
                empresa em1 = new empresa();
                em1.Nome  = entrada.next();
                em1.Endereco  = entrada.next();
                em1.Cidade  = entrada.next();
                em1.Estado  = entrada.next();
                em1.VPatrimonial  = entrada.nextFloat();
                em1.Qdfuncionario  = entrada.nextInt();
                
                
                System.out.println("empresa 2 ");
                System.out.println(" digite o nome, enderço, cidade, estado, valor patrimonial, quantidade de funcionario ");
                empresa em2 = new empresa(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.nextFloat(), entrada.nextInt());
                
        
                System.out.println("empresa com o maior valor patrimonial ");
                if(em1.VPatrimonial > em2.VPatrimonial){
                    System.out.println(em1.impri());
                }else{
                    System.out.println(em2.impri());
                }
                break;
            case 4:    
                System.out.println("digite os dados do aluno 1");
                aluno alu1 = new aluno();
                alu1.codigo = entrada.nextInt();
                alu1.nome = entrada.next();
                alu1.nota1 = entrada.nextFloat();
                alu1.nota2 = entrada.nextFloat();
            
                System.out.println("digite os dados do aluno 2");
                aluno alu2 = new aluno(entrada.nextInt(),entrada.next(),  entrada.nextFloat(),  entrada.nextFloat());
                
                System.out.println("alunos aprovados");
        
                if(alu1.media>5){
                    System.out.println("aprovado");
                    System.out.println();
                }
        
                if(alu2.media>5){
                    System.out.println("aprovado");
                    System.out.println(alu2.impr());
                }
                break;
               
        }

    }
}
