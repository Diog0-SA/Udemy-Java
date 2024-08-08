package aulaSobreWhile;
import java.util.Scanner;
// aula 73 - 08/08/24 - DO WHILE

public class aula73 {

	public static void main(String[] args) {
		// O DO WHILE será executado ao menos uma vez 
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas... ");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor")); // Apenas a expressão
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
