package exerciciosEstruturaDeControle;
import java.util.Scanner;
/*
 Criar um programa que receba um número e diga se ele é um número primo.
 
 13/08/24
 */
public class quatro {
    
	// Verifica se um número é primo
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false; 
        }
        
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        scanner.close();  

        
        if (Primo(numero)) {
            System.out.printf("O número %d é primo", numero);
        } else {
            System.out.printf("O número %d não é primo", numero);
        }
    }
}