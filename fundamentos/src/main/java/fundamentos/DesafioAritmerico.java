package fundamentos;

public class DesafioAritmerico {

	public static void main(String[] args) {
		
		/*
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // Potência, primeiro o valor e depois o número da potência.
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		-----------------------------------------------*/
		
				// Primeira forma:
		
		float a = ((float)Math.pow(6 * (3 + 2), 2)) / (3 * 2);
		float b = (float) Math.pow(((1-5) * (2-7)) / 2, 2);
		float c = a - b;
		float d = ((float)Math.pow(c, 3)) / ((float)Math.pow(10, 3));
		
				//Segunda forma:
				
		System.out.println(d);
		
		double numA =(double) Math.pow((6*(3 + 2)), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = (double) Math.pow(superiorA - superiorB, 3);
		
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
	}
}
