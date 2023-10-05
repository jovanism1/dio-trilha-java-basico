//Case 4: O RH deverá realizar uma ligação, com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda,
//deve-se imprimir: "CONSEGUIMOS CONTATO COM _[CANDIDATO] ``` APÓS **_**[TENTATIVA]`** TENTATIVA(S)" ;**
//Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O _[CANDIDATO]_".

package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase4 {

	public static void main(String[] args) {
		/*analisarCandidato(1900.0);// aqui setei valores para o metodo
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		// Array com a lista de candidatos
		//imprimirSelecionados();
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};//candidatos do metodo main
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
			
		}
	}
static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	//método auxiliar
		static boolean atender() {
			return new Random().nextInt(3)==1;	//Random busca um numero aleatorio entre 1 e 3 
		}
	
	
		static void imprimirSelecionados() {
			String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
			
			System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
			
			for(int indice=0; indice < candidatos.length;indice++) {
				System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
				//(indice+1) é pra lista iniciar em 1 e nao em 0
			}
			System.out.println("-------------------------------------------");
			System.out.println("Forma abreviada for each");
			
			for(String candidato: candidatos) {//String candidato: é uma variavel temporaria
				//interage com todos os elementos do array mas nao mostra o indice
				System.out.println("O candidato selecionado foi "+ candidato);
				
			}
		}
	
		static void selecaoCandidatos() {// seleciona o candidado com base no salario pretendido
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int candidatosSelecionados = 0;// ate o momento tenho 0 candidatos selecionados
		int candidatosAtual =0;//indice do array
		double salarioBase=2000.0;
		while(candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
			//regra de interrupção onde os selecionados tem que ser <5 e
			//o candidato atual tem que ser menor do que os candidatos da lista
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido= valorPretendido();
			System.out.println("O candidato" + candidato + "solicitou este valor de salario "+ salarioPretendido);
			if(salarioBase >=salarioPretendido) {
				System.out.println("o candidato "+candidato+ "foi selecionado para a vaga");
				candidatosSelecionados++;
			 }
			candidatosAtual++;//para avaliar o proximo candidato
		  }
		}
		
		static double valorPretendido() {
		     return ThreadLocalRandom.current().nextDouble(1800, 2200);
		}
		
		/*static void analisarCandidato(double salarioPretendido) {//metodo para analisar o candidato
			double salarioBase = 2000.0;
			if(salarioBase > salarioPretendido) {
				candidatosSelecionados++;
			}*/
			
	static void analisarCandidato(double salarioPretendido) {//metodo para analisar o candidato
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if  (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
	}

}
