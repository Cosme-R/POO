public class calculadora {
    float nume1;
    float nume2;

    void operacao(){
        float soma = nume1 + nume2;
        float subtracao = nume1 - nume2;;
        float multipliccao = nume1 * nume2;;
        float divisao = nume1 / nume2;

        System.out.println("a soma entre "+ nume1 +" + "+ nume2+" = "+soma);
        System.out.println("a subtracao entre "+ nume1 +" - "+ nume2+" = "+subtracao);
        System.out.println("a multipliccao entre "+ nume1 +" x "+ nume2+" = "+multipliccao);
        System.out.println("a divisao entre "+ nume1 +" / "+ nume2+" = "+divisao);
    }
}
