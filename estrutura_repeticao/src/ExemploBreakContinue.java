public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero =1;numero <=5;numero++){
            if (numero ==3)
            //break; para a execuçao quando chegar no numero 3
            continue;// vai continuar a execuçao e ignorar o numero 3
            //que nao sera impresso
            System.out.println("numero é " + numero);
        }
    }
}
