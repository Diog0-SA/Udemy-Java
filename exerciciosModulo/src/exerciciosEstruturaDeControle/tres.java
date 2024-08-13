package exerciciosEstruturaDeControle;

import java.util.Scanner;

/*
 Criar um programa que receba duas notas parciais, 
 calcular a média final. Se a nota do aluno for maior ou 
 igual a 7.0 imprime no console "Aprovado", 
 se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
  caso contrário imprime no console "Reprovado"
  
  12/08/24
 */
public class tres {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		// Pegando nota 1
		System.out.print("Digite a primeira nota: ");
		double n1 = scanner.nextDouble();
		
		// Pegando nota 2
		System.out.print("Digite a segunda nota: ");
		double n2 = scanner.nextDouble();
		
		// Calculando média
		double media = (n1 + n2) / 2;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aprovado.");
		}
		else if(media < 7 && media > 4) {
			System.out.println("Recuperação.");
		}
		else if(media > 10 || media < 0) {
			System.out.println("Média inválida");
		}
		else {
			System.out.println("Reprovado.");
		}
		
		scanner.close(); // Fechando scanner
	}
}
