public class funcionario {
    float salario;
    String assalariado;
    float total;

    String dados_assalariado(){
       // System.out.print("O nome do assalariado é: "+this.assalariado);
        //System.out.print("valor do salario é "+ aumenta());
        return" nome do assalariado é "+this.assalariado+"\n"+"valor do salario com reajuste é: "+aumenta();
    }

     float aumenta(){
        float porc=0;
        
        if(salario < 1500){
            porc =((this.salario*25)/100);
            total=(porc+ this.salario);
        }else{
            if(salario > 1499 && salario <3000){
                porc =((this.salario *20)/100);
                total=(porc+ this.salario);
            }else{
                if(salario > 2999 && salario <4500){
                    porc =((this.salario*20)/100);
                    total=(porc+ this.salario);
                }
            }
        }
        return total;
    }
}