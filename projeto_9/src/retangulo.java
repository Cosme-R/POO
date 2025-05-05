public class retangulo {
    float base;
    float altura;

    float area(){
        float resul;
        resul = ((this.base)* (this.altura));
        return resul;
    } 
    float perimetro(){
        float resultad;
        resultad=( 2*(this.base + this.altura));
        return resultad;
    }
    void mostrar(){
        System.out.println("a base digitada é: "+ this.base);
        System.out.println("a altura digitada é: "+ this.altura);
        System.out.println("a area é igual a: "+area());
        System.out.println("o perimetro é igual a: "+perimetro());
    }

}
