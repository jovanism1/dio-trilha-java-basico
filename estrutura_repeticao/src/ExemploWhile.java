// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;//classe para simular valores aleatorios
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();//valordoce recebe um valor aleatorio gerado
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {//criado um metodo valor aleatorio
	return ThreadLocalRandom.current().nextDouble(2, 8);//vai gerar valores aleatorios entre 2 e 8
   }
}

