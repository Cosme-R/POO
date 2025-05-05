package e5;

public class funcionario {
    private int idade;
    private int anos_servico;
    private int salário;

    public funcionario() {
    }

    public funcionario(int idade, int anos_servico, int salário) {
        this.idade = idade;
        this.anos_servico = anos_servico;
        this.salário = salário;
    }


    public int getidade() {
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }

    public int getanos_servico() {
        return anos_servico;
    }
    public void setanos_serviço(int anos_servico) {
        this.anos_servico = anos_servico;
    }

    public int getsalário() {
        return salário;
    }
    public void setsalário(int salário) {
        this.salário = salário;
    }

    public void imprimi(){
        if(idade >59 && anos_servico > 34){
            System.out.println("idade: "+idade+"\nanos de serviço: "+anos_servico);
            System.out.println("salario: "+ salário);
            System.out.println("pode se aposentar");
        }else{
            System.out.println("idade: "+idade+"\nanos de serviço: "+anos_servico);
            System.out.println("salario: "+ salário);
            System.out.println("não pode se aposentar");
        }

    }
}
