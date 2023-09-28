// estrutura condicional simples nao tem o else

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorsolicitado = 30.0;

        if(valorsolicitado < saldo){
            saldo = saldo - valorsolicitado;
            System.out.println("Novo saldo = "+saldo);
        }
        else{
        System.out.println("saldo insuficiente " +saldo);
    }
}
}