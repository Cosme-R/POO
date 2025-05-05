package ex_1alimento;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        alimentos alimento[] = new  alimentos[10];
        int sai =0;

        do{
            System.out.println("digite 1 para registrar os alimentos ");
            System.out.println("digite 2 para ver os alimentos em natura");
            System.out.println("digite 3 para ver os alimentos precessados ");
            System.out.println("digite 4 para ver os alimentos ultraprecessados ");
            System.out.println("digite 5 para ver todos os alimentos");
            System.out.println("digite 6 para sair");
            int opcao = entrada.nextInt();
            switch(opcao){
                case 1 :
                    for( int x = 0; x < alimento.length; x++){
                        alimento[x] = new alimentos();
                        int cond =0 ; 
                        String clase;
                        do{
                            System.out.println("digite a classe (natura, processado ou ultraprocessado): ");
                            clase = entrada.nextLine();
                            if(clase.equals("natura") || clase.equals("processado") || clase.equals("ultraprocessado")  ){
                                cond = 5;
                            }else{
                                System.out.println("clase invalida");
                            }
                        }while(cond <= 0 );
                        alimento[x].setClassicacao(clase);
                        System.out.println("Digite o Nome: ");
                        alimento[x].setNome(entrada.nextLine());
                        System.out.println("Digite o preço: ");
                        alimento[x].setPreco(entrada.nextDouble());
                        entrada.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("alimentos classe: natura");
                    double totaln =0; 
                    for( int x = 0; x < alimento.length; x++){
                        if(alimento[x].getClassicacao().equals("natura")){
                            totaln =+ totaln+ alimento[x].getPreco();
                            System.out.println("nome: "+alimento[x].getNome());
                            System.out.println("preço: "+alimento[x].getPreco());                          
                        }
                    }
                    System.out.println("valor total: "+totaln+"\n\n\n");
                    break;
                case 3:
                    System.out.println("alimentos classe: processado");
                    double totalp =0; 
                    for( int x = 0; x < alimento.length; x++){
                        if(alimento[x].getClassicacao().equals("processado")){
                            totalp =+ totalp+ alimento[x].getPreco();
                            System.out.println("nome: "+alimento[x].getNome());
                            System.out.println("preço: "+alimento[x].getPreco());
                        }
                    }
                    System.out.println("valor total: "+totalp+"\n\n\n");
                    break;
                case 4:
                System.out.println("alimentos classe: ultraprocessado");
                double totalu =0; 
                for( int x = 0; x < alimento.length; x++){
                    if(alimento[x].getClassicacao().equals("ultraprocessado")){
                        totalu =+ totalu+ alimento[x].getPreco();
                        System.out.println("nome: "+alimento[x].getNome());
                        System.out.println("preço: "+alimento[x].getPreco());
                    }
                }
                System.out.println("valor total: "+totalu+"\n\n\n");
                break;
            case 5:
                System.out.println("todos os alimentos: ");
                double total =0; 
                for( int x = 0; x < alimento.length; x++){
                    total =+ total+ alimento[x].getPreco();
                    System.out.println("classe: "+alimento[x].getClassicacao());
                    System.out.println("nome: "+alimento[x].getNome());
                    System.out.println("preço: "+alimento[x].getPreco());
                    
                    
                }
                System.out.println("valor total: "+total+"\n\n\n");
                break;
            case 6:
                sai = 2;
                break;

            }
        }while(sai<=0);

    }
}