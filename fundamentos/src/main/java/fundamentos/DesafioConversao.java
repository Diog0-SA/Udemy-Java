package fundamentos;

import java.util.Scanner;

// AULA - 38, 39, 40
public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Abrindo Scanner.
		
		// Pegando os 3 salários:
		
		System.out.print("Salário 1: ");
		String s1 = input.nextLine().replace(",", ".");
		
		System.out.print("Salário 2: ");
		String s2 = input.nextLine().replace(",", ".");
		
		System.out.print("Salário 3: ");
		String s3 = input.nextLine().replace(",", ".");	
		
		input.close(); // Fechando Scanner.
		
		// Convertendo os salários:
		
		double sa1 = Double.parseDouble(s1);
		double sa2 = Double.parseDouble(s2);
		double sa3 = Double.parseDouble(s3);
		
		// Média e soma dos salários:
		
		double media = (sa1 + sa2 + sa3) / 3;
		double soma = sa1 + sa2 + sa3;
		
		// Mostrando os resultados: 
		
		System.out.println("Os 3 salários digitados foram: " 
				+ "\nSalário 1: " + s1
				+ "\nSalário 2: " + s2
				+ "\nSalário 3: " + s3);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		
		//System.out.println(Locale.getDefault()); Para saber a localização do java
		
	}
}
