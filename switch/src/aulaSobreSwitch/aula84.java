package aulaSobreSwitch;
// Aula 84 - break 2(rotulado) - 12/08/24
public class aula84 {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { // é como dar um nome para o laço
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		
		System.out.println("Fim!");
	}
}
