public class quadrado {
    float lado;
    float perimeq;
    float areaq;

    void perímetroquadrado(){
        this.perimeq = this.lado * this.lado;
    }

    void areaquadrado(){
        this.areaq = (lado * lado);
    }
    void impres(){
        System.out.println("lado é igual a: "+lado);
        System.out.println("perimetro do quadrado é: "+this.perimeq);
        System.out.println("area do quadrado é: "+areaq);
    }


}
