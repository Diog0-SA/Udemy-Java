package exerciciosEstruturaDeControle;
import java.util.Scanner;

/*
 * Criar um programa que receba um número e verifique se ele 
 * está entre 0 e 10 e é par; 
 * 
 * 12/08/24
 */
public class ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		// Pegando o número
		System.out.print("Digite um número entre 0 e 10: ");
		int n = scanner.nextInt();
		
		scanner.close(); // Fechando scanner
		
		// Verificando se está entre 0 e 10
		if(n <= 10 && n >= 0) {
			System.out.println("Está entre 0 e 10.");
		}
		// Caso seja maior que 10
		else if(n > 10) {
			System.out.println("é maior que 10.");
		}
		// Caso seja menor que 0
		else {
			System.out.println("é menor que 0.");
		}
		// Verificando se é par
		if(n % 2 == 0) {
			System.out.println("é par.");
		}
		// Caso seja impar
		else {
			System.out.println("é impar.");
		}
	}
}
