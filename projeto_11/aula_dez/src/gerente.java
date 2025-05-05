public class gerente {
    static float salario;

    public gerente(){
        this.salario = salario;
    }

    static void aumenta_salario(){
        float porc =((salario*10)/100);
        float total=(porc+salario);
        System.out.print("salario com aumento de 10% : ");
        System.out.print(total);
    }

    static void aumenta_salario(float taxa){
        float porc =((salario*taxa)/100);
        float total=(porc+salario);
        System.out.print("salario com aumento de " + taxa+ "% :");
        System.out.print(total);
        System.out.println(" \n ");
    }

}


