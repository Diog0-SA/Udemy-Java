package fundamentos;

public class TipoString {
	
	public static void main(String[] args) { 
		System.out.println("Olá pessoal.".charAt(2));
		
		String s = "Boa tarde"; // A String é uma variável imutavél.
		//s = s.toUpperCase();  Isso não é uma mutação do valor original, é uma substituição. Por isso funciona.
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // Diferencia maiuscula de minuscula.
		System.out.println(s.length()); // Quantos caracteres tem.
		System.out.println(s.equals("boa tarde")); // Compara se é igual ou não.
		System.out.println(s.equalsIgnoreCase("boa tarde")); // o mesmo de cima mas não  diferencia maiusculas e minusculas. 
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario); 
		// Outra forma melhor. %s = String     %d = Valores inteiros        %f = valores reais
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase); // Pode fazer desse jeito, atribuindo diretamente a frase
		
		System.out.println("Frase qualquer".contains("qual")); // Vê se tem o que foi digitado na frase.
		System.out.println("Frase qualquer" .indexOf("qual")); // Vê quando começa o que foi digitado.
		System.out.println("Frase qualquer" .substring(6)); // Indica o inicio
		System.out.println("Frase qualquer" .substring(6 , 8)); // Indica o final também *exclui o ultimo, nesse caso o 8.
		
	}
}
