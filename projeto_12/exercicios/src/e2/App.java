package e2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);

        bola bo1 = new bola();
        System.out.println("digite a cor ");
        bo1.setcor(entrada.next());
        System.out.println("digite o material ");
        bo1.setmaterial(entrada.next());
        System.out.println("digite a cricunferencia ");
        bo1.setcircunferência(entrada.nextInt());
        bo1.imprime();
        
    }
}
