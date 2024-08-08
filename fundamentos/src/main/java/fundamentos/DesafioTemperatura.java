package fundamentos;

/**
 * @author Diogo Silva Almeida
 * aula - 22 e 23
 * Desafio: Conversão de fahrenheit em celsius
 * */

/*
 * Dica: No terminal quando se digita 'JShell' abre o interpretador java
 * */

public class DesafioTemperatura {
	public static void main(String[] args) {  
		
		// main é o ponto de entrada do java
		
		/*
		 * (ºF - 32) x 5/9 = ºC
		 * Variavel = F e C
		 * Constante(final)= 32 e 5/9
		 * */
		
		// Se a divisão for feita por números inteiros o resultado será inteiro, se for por real a mesma regra;
		final double DI = 5/9.0; 
		final int TRINTADOIS = 32;
		int F = 77;
		double C = (F - TRINTADOIS) * DI;
		
		System.out.println(F + "°F em Celsius(°C) é igual a " + C);
		
		F=0;
		C = (F-TRINTADOIS) * DI;
		
		System.out.println(F + "°F em Celsius(°C) é igual a " + C);
	}
}
