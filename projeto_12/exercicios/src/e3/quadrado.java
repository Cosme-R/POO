package e3;
public class quadrado {
    private float tamanho;
    private float lado;

    public void settamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public float gettamanho() {
        return tamanho;
    }

    public void setlado(float lado) {
        this.lado = lado;
    }
    public float getlado() {
        return lado;
    }

    public float area(){
        float resul=(lado * lado);
        return resul;
    }

}
