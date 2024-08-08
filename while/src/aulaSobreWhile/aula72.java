package aulaSobreWhile;
import java.util.Scanner;
// aula 72 - 08/08/04 - while 2

public class aula72 {

	public static void main(String[] args) {
		// Excercio/ desafio "opcional"
		
		Scanner scanner = new Scanner(System.in);
		String digitado = "a";
	
		while(!digitado.equals("sair")) {
			System.out.println("Digite algo ['sair' termina]: ");
			digitado = scanner.nextLine().toLowerCase();
		}
		System.out.println("Programa finalizado.");
		scanner.close();
	}
	
}