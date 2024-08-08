package fundamentos;
// AULA - 36
public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		// Uma forma de conversão com wrappers.
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); 
		
		//------------------------------------------------------------
		
		// Uma forma de conversão com tipo primitivo.
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//------------------------------------------------------------
		
		// Uma forma de conversão contatendando com uma String vazia(não recomendado)
		
		int num3 = 10;
		System.out.println(("" + num3).length());
		
		//------------------------------------------------------------
		
		// foi usado apenas inteiros mas funciona com qualquer tipo de número.
		
		
	}
}
