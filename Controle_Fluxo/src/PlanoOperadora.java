/*Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
O sistema terá 03 planos: BASIC, MIDIA , TURBO;
BASIC: 100 minutos de ligação;
MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
*/
// se fosse usar o if teriamos saidas repetidas de codigo nos tres if
// Modo condicional convencional
/*public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
    }
}
        */
        //para nao ter que repetir linhas, criamos um switch case 
        // em ordem especifica sem o break onde ao ser selecionado
        // uma opçao ele junta com a proxima opção.
        // Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}

			
		
	

