package aulaSobreSwitch;
// Aula 80 - switch 1(sem break) - 12/08/24
public class aula80 {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		
		/*default:
			System.out.println("Sei nada");
			Se o default estiver encima e for executado, vai executar todos abaixo
			*/
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
			
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
			
		case "roxa":
			System.out.println("Sei o Heian Godan...");
			
		case "verde":
			System.out.println("Sei o Heian Yodan...");
			
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
			
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
			
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			// break; Se colocar o break não aparece o default, 
			// Mas essa aula é sem o break
			
		/*default:
			System.out.println("Sei nada");*/
		}
		
		int idade = 2; // A variavel usada deve ser inicializada antes
		switch(idade) {
		
		case 3:
			System.out.println("Sabe programar");
		
		case 2:
			System.out.println("Sabe falar");
			
		case 1:
			System.out.println("Sabe andar");
			
		case 0: 
			System.out.println("Sabe respirar");
		}
	}
}
