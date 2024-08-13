package exerciciosEstruturaDeControle;
import java.util.Scanner;

/*
 Crie um programa que recebe 10 valores e ao final imprima o maior número. 
 
 13/08/24
 */
public class ex9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		// Variavel
		int maior = 0;
		
		for(int i = 01; i <= 10; i++) {
			
			// Pegando número
			System.out.printf("Digite o %d° número: ", i);
			int n = scanner.nextInt();
			
			// Definindo o maior
			
			if(n > maior) maior = n;
		}
		
		scanner.close(); // Fechando scanner
		
		// Mostrando o maior valor
		System.out.println("O maior valor foi: " + maior);
	}
}
