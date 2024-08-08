package fundamentos;

// AULA - 33
public class Wrappers {

	public static void main(String[] args) {
		
		// Byte
		Byte b = 100;
		Short s = 1000;
		Integer i =10000;  // int
				 //Integer.parseInt(entrada.next() /*Somente next é String*/);
		Long l = 100000L;
		
		/*
		Para transformar tipos primitivos em objetos basta colocar a primeira 
		letra como maiúscula. Menos o int que vira "Integer".
		*/
		
		System.out.println(b.byteValue()); // Mostra o valor do byte
		System.out.println(s.toString());  // Converte para String
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		// ----------------------------------------------------------------
		
		// Float e Double
		Float f = 123.0f;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		// ----------------------------------------------------------------
		
		// Boolean
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		
	//	System.out.println(bo.toUpperCase()); Isso vai dar erro, boolean não é String.
		System.out.println(bo.toString().toUpperCase()); // Agora da certo porque virou String.
		
		// ----------------------------------------------------------------
		
		// Char
		Character c = '#';
		System.out.println(c + "...");
		
	}
}
