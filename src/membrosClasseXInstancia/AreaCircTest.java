package membrosClasseXInstancia;
//Aula 106 - membros Classe X Instancia 2 - 19/09/24
public class AreaCircTest {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi=10;
		a1.raio = 10;
		System.out.println(a1.area());
		/*
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi=5; // Não muda apenas a de 'a2', e sim de toda a classe
		a2.raio = 100;
		System.out.println(a2.area());*/
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
