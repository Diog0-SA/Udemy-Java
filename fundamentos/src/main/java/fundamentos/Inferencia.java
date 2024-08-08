package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a=12.57;
		System.out.println(a);
		
		var b = 4.5;
		// com o 'var' o java infere(supoem) o tipo da variavel pelo dado inserido
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; Erro, porque não se pode mudar o tipo depois de delarada
		
		double d;// variavel declarada
		d=123.65;//variavel inicializada
		System.out.println(d);// variavel usada
		
		/*var e;
		e = 123.45;
		Não funciona com o var, o var precisa da inicialização para saber o tipo
		*/
		
		var f =12; // inteiro
		//f=12.01; ERRO- ponto flutuante pode receber inteiro e transformar em real. 
		// Mas o contrario não é possível;
		System.out.println(f);
	}
}
