package exerciciosEstruturaDeControle;
import java.util.Scanner;
/*
 Refatorar o exercício 04, utilizando a estrutura switch. 
 
 13/08/24
 */
public class cinco {

		public static void main(String[] args) {
			/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

			int contadorDeDivisores = 0;
			Scanner scanner = new Scanner(System.in); // Abrindo scanner

			System.out.println("\nDigite um numero para verificar se é primo:");
			int numero = scanner.nextInt();

			scanner.close(); // Fechando Scanner
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					contadorDeDivisores++;
				}
			}

			switch (contadorDeDivisores) {

			case 0:
				System.out.println("O numero " + numero + " é um numero primo.");
				break;

			default:
				System.out.println("O numero " + numero + "  não é um numero primo.");

			}

	}
}
  
