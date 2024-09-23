package desafioMembrosClasseXInstancia;
//Desafio - aula 107 - 23/09/24
public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){
		// Construtor explicito
		
		 nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		// Construtor explicito
		
		 nome = nomeInicial;
		 preco = precoInicial;
	}
	
	Produto(){} // Construtor padrão
	
	double precoComDesconto(){
		return preco * (1 - desconto); 
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente); 
	}
}

