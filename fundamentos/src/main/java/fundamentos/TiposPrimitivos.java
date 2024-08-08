package fundamentos;
/* AULA - 25 e 26*/

/*
 * Aula 25
 * 
 * Em java temos 8 tipos primitivos. 
 * Onde 6 são numéricos e 1 é de caracter e o booleano
 * ------
 * 
 * 1 - byte    - Inteiro         - Representa 1 byte. 
 * 2 - short   - Inteiro         - Representa 2 byte.
 * 3 - int     - Inteiro         - Representa 4 byte (É o padrão do java). 
 * 4 - long    - Inteiro         - Representa 8 byte // A diferença dos 4 é a capacidade.
 * 5 - double  - Ponto Flutuante - Representa 8 byte (É o padrão do java).
 * 6 - float   - Ponto Flutuante - Representa 4 byte.
 * 7 - char    - Caracteres.
 * 8 - boolean - Verdadeiro ou falso. 
 * 
 * 1 byte = 8 bits / 1 bit é 0 ou 1.
 * 
 * Pode-se transformar um tipo com menor capacidade de armazenamento em um maior sem problemas.
 * Mas o contrário pode dar problema.
 * */

// Aula 26
public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // O uso dos underlines serve para facilitar a leitura separando as casas decimais.
		// É preciso colocar um l ou L no final de um número long.
		
		// Tipos numéricos reais:
		float salario = 11_445.44F; // O float precisa colocar um f ou F no final também.
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano:
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere:
		char status = 'A'; // Tipo char so aceita um único caracter
		
		// Dias de empresa:
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// Número de viagens:
		System.out.println("Voos: " + numeroDeVoos / 2);
		
		// Pontos por real:
		System.out.println("Pontos acumulados por venda: " + pontosAcumulados / vendasAcumuladas);
		
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}


