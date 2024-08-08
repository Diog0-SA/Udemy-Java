package fundamentos;
// AULA - 32
public class PrimitivoVsObjetos {

	
	public static void main(String[] args) {
		
	//	String s = new String ("texto");  também pode ser criada assim.
		String s = "texto"; // Isso é um objeto.
		s.toUpperCase(); // Isso é um comportamento do objeto.
		
		/*
		int a = 123;  Isso não é um objeto porque é um tipo primitivo, tipos primitivos não são objetos.
		a. ??? Não aparece nada.
		*/
		
		// Wrappers
		// São a "versão objeto" dos tipos primitivos.
		
		int a = 123;
		System.out.println(a);
		
		
		
		// Tudo em java são objetos. MENOS tipos primitivos.
	}
}
