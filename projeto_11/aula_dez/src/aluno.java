

public class aluno {
    static int codigo;
    static String nome;
    static float nota1;
    static float nota2;
    static float media;

    public aluno(){

    }
    public aluno(int codigo,String nome,float nota1,float nota2){
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    void calculo(){
        this.media = ((nota1 + nota2)/2);
    }

    String verifica(){
        String resul;

        if(media >5){
            resul ="aprovado";
        }
        else{
            resul = "reprovado";
        }
        return resul;
    }
    static String impr(){
        return"codigo "+codigo+"\nnome "+nome+"\nnota1 "+nota1+"\nnota2 "+nota2+"\nmedia "+media;
    }

}
