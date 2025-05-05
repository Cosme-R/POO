package ee7;

public class livro {
    private int codigo;
    private int ano ;
    private double preco;
    private String titulo ;
    private String editora;
    public double getpreco;
   

    public livro(){

    }

    public livro( int codigo, int ano, double preco, String titulo, String editora){
        this.codigo=codigo;
        this.ano=ano;
        this.preco=preco;
        this.titulo=titulo;
        this.editora=editora;

    }

   

    public int getcodigo() {
        return codigo;
    }
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getano() {
        return ano;
    }
    public void setano(int ano) {
        this.ano = ano;
    }

    public double getpreco() {
        return preco;
    }
    public void setpreco(Double preco) {
        this.preco = preco;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String geteditora() {
        return editora;
    }

    public void seteditora(String editora) {
        this.editora = editora;
    }














    void imprimi(){
        System.out.println("codigo do livro: "+codigo);
        System.out.println("titulo do livro: "+titulo);
        System.out.println("editora: "+editora);
        System.out.println("ano: "+ano);
        System.out.println("preço: "+preco);
    }    




}
