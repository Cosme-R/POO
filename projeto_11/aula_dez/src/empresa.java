public class empresa {
    static String Nome;
    static String Endereco;
    static String Cidade; 
    static String Estado;
    static float VPatrimonial;
    static int Qdfuncionario;

    public empresa(){

    }

    public empresa( String Nome,String Endereço,String Cidade, String Estado,float VPatrimonial,int Qdfuncionario){
        this.Nome = Nome;
        this.Endereco = Endereço;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.VPatrimonial = VPatrimonial;
        this.Qdfuncionario =Qdfuncionario;
    }

    static String impri(){
        return "nome "+ Nome+ "\nendereço"+Endereco+"\ncidade"+Cidade+"\nestado"+Estado+"\nvalor patrimonial"+VPatrimonial+"\nquantidade de funcionarios"+Qdfuncionario;
    }

}
