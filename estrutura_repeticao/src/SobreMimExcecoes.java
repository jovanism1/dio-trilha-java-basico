import java.util.Locale;
import java.util.Scanner;

public class SobreMimExcecoes {
    public static void main(String[] args)  {

        //criando o objeto scanner
        try{   // try vai verificar a entrada de dados e se for errado vai pro catch
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        //ToUpperCase converte tudo que for digitado para maiusculo
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
    } catch(Exception InputMismatchException ){
    System.out.println("o campo idade e altura tem que ser numerico");
    } //se eu entrar com letra  no lugar de numero, me mostra a mensagem do catch
    
    }
    
}

