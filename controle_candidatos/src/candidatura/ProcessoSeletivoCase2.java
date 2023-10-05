package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase2 {

	public static void main(String[] args) {
		/*analisarCandidato(1900.0);// aqui setei valores para o metodo
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		// Array com a lista de candidatos
		selecaoCandidatos();
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
