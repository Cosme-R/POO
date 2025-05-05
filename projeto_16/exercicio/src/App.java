import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        doadores doador[] = new doadores[2];

        for( int x = 0; x < doador.length; x++){
            doador[x] = new doadores();

            System.out.println("Digite o codigo: ");
            doador[x].setCodigo(entrada.nextInt());
            
            System.out.println("Digite o Nome: ");
            doador[x].setNome(entrada.next());
             
            System.out.println("Digite o endereço: ");
            doador[x].setEndereço(entrada.nextLine());
            
            System.out.println("Digite a cidade: ");
            doador[x].setCidade(entrada.next());
             
            System.out.println("Digite o valor: ");
            doador[x].setValor(entrada.nextDouble());
            entrada.nextLine();
        }
        System.out.println("\n\n\nDado dos doadores");
        for( int x = 0; x < doador.length; x++){
            
            if(doador[x].getValor()> 199 ) {
                System.out.println("Codigo do doador: "+doador[x].getCodigo());
                System.out.println("Come do doador: "+doador[x].getNome());
            }
        }  

    }
}