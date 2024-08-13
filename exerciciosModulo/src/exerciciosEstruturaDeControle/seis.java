package exerciciosEstruturaDeControle;
import java.util.Random;
import java.util.Scanner;

/*
 Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
 O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, 
 imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
 
 13/08/24
 */
public class seis {

	public static void main(String[] args) {
		
		// Gerando o número
		Random PC = new Random();
		int n = PC.nextInt(101);
		
		// Boas vindas
		System.out.println("------BEM VINDO!------");
		System.out.println("Nesse jogo o computador pensará num número entre 0 e 100.");
		System.out.println("Seu objetivo é acertar esse número com até 10 tentativas.");
		System.out.println("Boa sorte!");
		System.out.println("---------------------------------------------------");
		
		
		Scanner jogador = new Scanner(System.in); // Abrindo Scanner
		
		for(int i = 1; i <= 10; i++) {
			
			// Pegando o palpite
			System.out.print("Tente adivinhar um número de 0 - 100. palpite: ");
			int palpite = jogador.nextInt();
			
			// Verificando o palpite
			if(palpite == n) {
				System.out.println("---------------------------------------------------");
				System.out.println("PARABÉNS!!! VOCÊ CONSEGUIU, o número era: " + palpite);
				System.out.printf("Você acertou o número com %d tentativas", i);
				break;
				
			}
			else if(palpite > n) {
				System.out.println("O número é menor que " + palpite);
			}
			else {
				System.out.println("O número é maior que " + palpite);
			}
	
			// Número de tentativas
			System.out.println("Esta é sua " + i + "° tentativa!");
			System.out.println("----------");
		}
		
		jogador.close(); // Fechando Scanner
		
		System.out.println("Fim de jogo.");
	}
}
