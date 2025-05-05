package e4;
public class aluno {

    private float matricula;
    private float nota1;
    private float nota2;


    public void setmatricula(float matricula) {
        this.matricula = matricula;
    }
    public float getmatricula() {
        return matricula;
    }

    public void setnota1(float nota1){
        this.nota1 = nota1;
    }
    public float getnota1(){
        return nota1;
    }

    public void setnota2(float nota2){
        this.nota2 = nota2;
    }
    public float getnota2(){
        return nota2;
    }

    float media(){
        float media = ((nota1 + nota2)/2);
        return media;
    }
    public void imprime(){
        System.out.println("matricula: "+matricula+"\nmedia: "+media());
    }

}
