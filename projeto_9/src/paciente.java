public class paciente {
    float peso;
    float altura;
    String enfermo;
   // String classifica;

    float calculaimc(){
        float imc;
        imc = (this.peso/(this.altura*this.altura));
        return imc;
    }
    void clasifica(){
        if (calculaimc() < 20){
            System.out.print("voce esta magro ");
        }else{
            if(calculaimc() >19 && calculaimc()<25){
                System.out.print("voce esta normal ");
            }else{
                if(calculaimc()>24 && calculaimc() <30){
                    System.out.print("voce esta acima do peso ");
                }else{
                    if(calculaimc() >29 && calculaimc() <35){
                        System.out.print("voce esta obeso ");
                    }else{
                        if(calculaimc() >34){
                            System.out.print("voce esta muito obeso ");
                        }
                    }
                }
            }
        }
        
    }

    void imprimir(){
        System.out.println("o nome do paciente é "+enfermo);
        System.out.print("seu imc é ");
        System.out.print(calculaimc()+" ");
        clasifica();
    }

}
