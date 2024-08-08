package fundamentos;
/* AULA - 27 */
public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		//s.toUpperCase(); // Conversão de toda string para letras maiusculas.
		// Não altera o valor original, só sera maiuscula o que for escrito na linha da função.
		
		s = s.replace("X" , "Senhora"); // Substitui.
		
		s= s.toUpperCase(); // Desse jeito sim muda o original.
		
		s= s.concat("!!!"); // Concatena.
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase()); // Pode-se colocar a função junto do print também.
		
		// ou 
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X" , "Gui");
		System.out.println(y);
		
		// Pode-se quebrar linha antes e depois do ponto.
		// Antes:
		String h = "Bom dia X"
				.replace("X" , "Gui")
				.toUpperCase();
		System.out.println(h);
		
		// Depois:
		String i = "Bom dia X".
				replace("X" , "Gui").
				toUpperCase();
		System.out.println(i);
		
		// Tipos primitivos não tem o operador ".".
		
	}
}
