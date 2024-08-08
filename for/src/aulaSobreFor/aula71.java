package aulaSobreFor;
// Aula 71 - 08/08/24 - for 1

public class aula71 {

	public static void main(String[] args) {
		/*
		int contador = 0;
		while(contador <= 20){
			System.out.printf("i = %d\n", contador);
			contador += 2;
		}
		*/
		
		for(int contador = 0; contador <= 20; contador +=2) {
			System.out.printf("i = %d\n", contador);
		}
		
		// Não é obrigatorio ter as 3 partes do for
		
		int x = 2;
		for(; x < 10;) {
			System.out.println("X = " + x);
			x++;
		}
		
		/*
		for(;;) ou for(;true;) {
			System.out.println("fim");
		} 
		
		laço infinito
		*/

	}
}
