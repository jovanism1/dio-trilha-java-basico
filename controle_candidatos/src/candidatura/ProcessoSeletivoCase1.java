package candidatura;

public class ProcessoSeletivoCase1 {

	public static void main(String[] args) {
		analisarCandidato(1900.0);// aqui setei valores para o metodo
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
		
		// TODO Auto-generated method stub
		System.out.println("Processo Seletivo");
	}
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

