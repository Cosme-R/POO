package e2;
public class bola {

    private String Cor;
    private String material;
    private float circunferência;

    public void setcor(String cor) {
        this.Cor = cor;
    }
    public String getcor() {
        return Cor;
    }

    public void setmaterial(String material) {
        this.material = material;
    }
    public String getmaterial() {
        return material;
    }

    public void setcircunferência(float circunferência) {
        this.circunferência = circunferência;
    }
    public float getcircunferência() {
        return circunferência;
    }


    void imprime(){
        System.out.println("bola \n cor: "+Cor);
        System.out.println("material: "+material+"\ncircunferencia: "+circunferência);
    }
}
