/*  estrutura condicional composta
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if(nota >=7){
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
    
}
*/


/*condição ternaria com o mesmo codigo acima
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "reprovado";
        system.out.println(resultado);
    }
    
}
 * 
 */


/*estrutura condicional encadeada
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        if(nota >=7){
            System.out.println("Aluno Aprovado");
        }
        else if(nota>=5 && nota<7){
            System.out.println("Aluno em recuperação");
        }
        else 
        System.out.println("Aluno reprovado");
    
    }
    
}
*/

/*condição ternaria com o mesmo codigo acima
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota<7 ? "recuperação" : "reprovado";
        system.out.println(resultado);
    }
    
}
*/
