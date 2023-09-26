public class Sobremim {
    public static void main(String[] args){
String nome = args [0];
String sobrenome = args [1];
int idade = Integer.valueOf(args [2]);
double altura = Double.valueOf(args[3]);

System.out.println("OLa, me chamo " + nome + " " +sobrenome);
System.out.println("Minha idade é " + idade + "anos" );
System.out.println("Minha altura é " + altura + "centimetros" );

/*para passar os argumentos a serem exibidos, tem que entrar em executar, 
 * adicionar configuração e criar a linha dos argumentos
 * "args": ["jovani","aparecido", "40", "1;63"]
 */


}
}