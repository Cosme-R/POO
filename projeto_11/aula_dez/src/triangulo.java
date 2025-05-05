public class triangulo {
    static double base;
    static double altura;

    public triangulo(double d,  double e){
        this.base = d;
        this.altura = e;
    }

    static void area(){
        double area = ((base * altura) / 2);
        System.out.println("a area do triangulo é " + area);
    }
}
