package aulaSobreWhile;
import java.util.Scanner;
// aula 74 - 08/08/24 - Desafio while
public class aula74 {

	public static void main(String[] args) {
		
		// Variaveis
		double notaTemporario;
		double total = 0;
		int notasValidas = 0;
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		do {
			
			System.out.print("Digite a nota= ");
			notaTemporario = scanner.nextDouble();
			
			if(notaTemporario <= 10 && notaTemporario >= 0) { // Verificação para ver se a nota é válida
				total += notaTemporario;
				notasValidas++;
			}
			else {                                  // Se não for válida
				System.out.println("Nota invalida");
			} 
			
			
		}while(notaTemporario != -1);
		
		scanner.close(); // Fechando scanner
		
		// Print finais 
		System.out.println("----------------------------");
		System.out.println("A soma de todas as notas foram: " + total);
		System.out.printf("Ao todo foram digitadas %d notas válidas", notasValidas);
		System.out.println("\nA média das notas digitados é: " + total/notasValidas);
		System.out.println("\nPrograma finalizado.");
	}
}