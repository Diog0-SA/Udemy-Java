package aulaSobreFor;
// Aula 77 - for 3 - 12/08/24
public class aula77 {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		A variavel "i" está limitada a esse bloco, ela não 
//		funciona fora. para funcionar é preciso declarar fora do laço
//			
//		}
		
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Saiu do for...");
		System.out.println(i);
		
		
		// é possivel criar depois do laço for
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		int j = 105;
		System.out.println(j);
		
		
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
	}
}
