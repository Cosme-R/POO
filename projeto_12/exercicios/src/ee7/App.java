package ee7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);



        livro liv1 = new livro();
        System.out.println("digite o codigo, ano, preço, titulo e editora do livro 1 ");
        liv1.setcodigo(entrada.nextInt());
        liv1.setano(entrada.nextInt());
        liv1.setpreco(entrada.nextDouble());
        liv1.settitulo(entrada.nextLine());
        liv1.seteditora(entrada.next());

        System.out.println("digite o codigo, ano, preço, titulo e editora do livro 2 ");
        livro liv2 = new livro(entrada.nextInt(), entrada.nextInt(), entrada.nextDouble(), entrada.next(), entrada.next());
       
       
        System.out.println("resultado");
        if(liv1.getpreco() > liv2.getpreco){
            liv1.imprimi();
        }else{
            liv2.imprimi();
        }
    }
}
