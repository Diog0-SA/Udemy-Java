package atribuicaoPorValorxReferencia;
// aula 109 - 23/09/24
public class AtribuicaoPorValorxReferencia1 {
	/*
	 Atribuição por:
	  Valor = tipos primitivos
	  referencia = objetos
	 ---
	 Quando um área de memória não tem mais uma referência
	  o "Coletor de lixo" limpa a área da memória.
	 ---
	 Todos os objetos tem um métodos "clone".
	 
	 Você pode definir como o clone vai clonar.
	 ---
	 um método static só pode acessar outro método static
	 */
	public static void main(String[] args) {
		int a = 2;
		int b = a;
		
		a++;
		b--;
		
		System.out.println(a); // 3
		System.out.println(b); // 1
	}
}
