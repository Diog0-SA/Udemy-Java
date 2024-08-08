package fundamentos;

import java.util.Scanner;

//AULA - 30
public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!"); 
		// Apenas o print não pula linha.
		
		System.out.println("Bom");
		System.out.println("dia!");
		// Com o ln pula linha depois que a sentença é executada.
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		// Com o f significa que é o print formatado. Não pula linha.
		
		Scanner entrada = new Scanner(System.in);
		// Essa linha é para ler o que o usuário digitar.
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close(); // O scanner precisa ser fechado para não rodar pra sempre.
		// Após o "next" é necessario especificar o tipo certo que será lido.
		
		/* 
		 * O nextInt() e nextDouble() tem um problema. Eles não leem o enter(\n). 
		 * Portanto precisamos colocar uma leitura vazia para ler o \n. 
		 * (Exemplo embaixo do int de idade)
		 * */
	}
}
