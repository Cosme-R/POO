package e1;


public class pessoa {
    private String nome;
    private int idade;

    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getnome() {
        return nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }
    public int getidade() {
        return idade;
    }
    public void imprime(){
        System.out.println("nome: "+nome+"\nidade: "+idade);
    }
}
