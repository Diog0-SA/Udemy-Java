package membrosClasseXInstancia;
// Aula 106 - membros Classe X Instancia 2 - 19/09/24
public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415; // O valor de pi(com o static) agora está relacionado diretamente a classe
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio , 2); 
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio , 2); 
	}
}
