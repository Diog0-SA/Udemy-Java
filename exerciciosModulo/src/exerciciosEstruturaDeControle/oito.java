package exerciciosEstruturaDeControle;
import java.util.Scanner;

/*
 Criar um programa que receba uma palavra e imprime no console letra por letra.
 
 13/08/24
 */
public class oito {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		// Recebendo palavra
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		scanner.close(); // Fechando scanner
		
		char letras[] = palavra.toCharArray();
			
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
}