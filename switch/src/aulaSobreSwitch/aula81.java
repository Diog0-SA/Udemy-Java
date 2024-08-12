package aulaSobreSwitch;
import java.util.Scanner;
// Aula 81 - switch 2(com break) - 12/08/24
public class aula81 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		
		/*case 10:
			conceito = "A";
			break;
			
		case 9:
			conceito = "A";
			break;*/
		
		case 10: case 9: // Forma otimizada para economizar codigo
			conceito = "A";
			break;
			
		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: case 5:
			conceito = "C";
			break;	
			
		case 4: 
		case 3: // Outra forma, dá na mesma
			conceito = "D";
			break;
			
		case 2: case 1: case 0:
			conceito = "E";
			break;
			
		default:
			conceito = "Conceito não encontrado";
		}
		
		entrada.close();
		System.out.println("Conceito é " + conceito);
	}
}
