package exercicios;

import java.util.Scanner;

/*
 Criar um programa que receba um número e diga se ele é um número primo. 
 
 12/08/24
 */
public class quatro {

	public static void main(String[] args) {
		
		// Não terminado, tenho que ir a faculdade
		
		Scanner scanner = new Scanner(System.in); // Abrindo Scanner
		
		// Pegando número
		System.out.print("Digite um número: ");
		double n = scanner.nextDouble();
		
		scanner.close(); // Fechano Scanner
		
		// Verificando se é primo
		if(n == 29) {
			System.out.printf("O número %d é primo", n);
		}
		else {
			System.out.printf("O número %d não é primo", n);
		}
	}
}
