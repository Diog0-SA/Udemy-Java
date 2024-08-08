package fundamentos;

/**
 *
 * @author Diogo Silva Almeida
 * aula 21
 */
public class AreaCircunferencia {
        public static void main(String[] args) {
        	
        	double raio = 3.4;
        	final double PI = 3.14159; 
        	/* Com o final não se pode mudar o valor da variavel;
        	   Variavéis imutaveis constumam estar sempre em letras maiúsculas;
        	*/
        	double area = PI * raio * raio;
        	
        	System.out.println(area);
        	
        	raio = 10;
        	// O tipo uma vez atribuido a uma variavel não se pode mudar, portanto não se coloca novamente o tipo quando declarar ela novamente;
        	area = PI * raio * raio;
        	System.out.println("Área = " + area + "m2."); // O '+' 'junta' o que está no print, inclusive tipos diferentes;
    }
}
