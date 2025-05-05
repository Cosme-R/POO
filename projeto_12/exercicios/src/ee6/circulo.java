package ee6;

public class circulo {
    private static  double raio;
    private static double area;
    private static double perimetro;

   
    
    public double getraio() {
        return raio;
    }
    public void setraio(Double raio) {
        this.raio = raio;
    }





    public double getarea(){
        double resul;
        resul = (3.141516*(raio*raio));
        return this.area = resul;
    }
    
   

    static double calperimetro(){
        double resu;
        resu = (2*(3.141516*raio));
        perimetro = resu;
        return resu;
    }



    static void imprimi(){
        System.out.println("raio: "+raio);
        System.out.println("area: "+area);
        System.out.println("perimetro: "+calperimetro());
    }    




}
