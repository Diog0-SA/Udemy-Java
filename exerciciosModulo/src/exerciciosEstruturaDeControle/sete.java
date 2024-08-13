package exerciciosEstruturaDeControle;
import java.util.Scanner;
/*
 Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
 caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while. 
 
 13/08/24
 */

public class sete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		// Variaveis
		double n = 0;
		double soma = 0;
		
		while(n >= 0) {
			
			// Recebendo os números
			System.out.print("Insira valores positivos[negativo encerra]: ");
			n = scanner.nextDouble();
			
			// Soma dos valores
			if(n > 0) soma += n;
			System.out.println("A soma dos valores é: " + soma);
			
			// Apenas para ficar mais fácil de ver
			System.out.println("---");
		}
		
		// Encerramento
		System.out.println("Fim do programa!");
		scanner.close(); // Fechando scanner
	}
}
