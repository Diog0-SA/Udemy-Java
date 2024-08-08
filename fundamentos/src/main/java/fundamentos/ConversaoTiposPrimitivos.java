package fundamentos;
// AULA - 34 e 35
public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		// AULA 34
		
		/*
		 * Ordem crescente de armazenamento:
		 * 		byte, short, int, long
		 * 
		 * Nessa ordem não há perigo de perder informações. 
		 * Agora de trás pra frente há perigo de perder informaçãoes.
		 * 
		 * Na ordem a converção é feita de forma implicita(pela IDE, automaticamente).
		 * Mas de trás pra frente tem que ser feita de forma explicita(pelo programador).
		 * ------------------------------------------------------------------------------
		 * 
		 * De int para float não há problema, já que adiciona casas decimais.
		 * 	Ou seja, adiciona informação. (De foram implicita).
		 * 
		 * Mas de float para int há problema, já que retira casas decimais.
		 * 	Ou seja, retira informação. (De forma explicita).
		 * 
		 */
		// ----------------------------------------------------------------
		// AULA 35
		
		double a = 1; // Conversão de forma implicita
		System.out.println(a);
		
		float b = (float) 1.12345; // Conversão de forma explicita (cast)
	//		float b = 1.0f; também pode converter assim.
		System.out.println(b);
		
		/*
		int c = 4;
		byte d = c;
		
		Isso da erro poque int não cabe no byte, e mesmo que o valor caiba no byte
		não adianta, porque o java não vê os valores, ele vê o tipo apenas. 
		*/
		
		int c = 4; // Se eu colocar um número maior que o byte suporta vai perder informações.
		byte d = (byte) c; // Mas com a conversão explicita fuciona.
		System.out.println(d);
		
		
	}
}
