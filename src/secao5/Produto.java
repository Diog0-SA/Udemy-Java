package secao5;
// Aula 93 - 27/08/24
public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		// Construtor explicito
		
		 nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		// Construtor explicito
		
		 nome = nomeInicial;
		 preco = precoInicial;
		 desconto = descontoInicial;
	}
	
	Produto(){} // Construtor padrão
	
	double precoComDesconto(){
		return preco * (1 - desconto); 
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente); 
	}
}
