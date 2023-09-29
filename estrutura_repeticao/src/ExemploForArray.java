public class ExemploForArray {
    public static void main(String[] args){

        String alunos[] = {"jovani","julia","mirela","maria"};
// em arrays o indice inicia em 0
        for(int x =0; x<alunos.length;x++){
            System.out.println("O aluno no indice x= " + x +" é " + alunos[x]);
        }
        /*Forma abreviada do codigo acima, seria for each
         * 
         * //Forma abreviada
	for(String aluno : alunos) 
    acima é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
    {
	  System.out.println(alunos);
	}
         */
    }
}
