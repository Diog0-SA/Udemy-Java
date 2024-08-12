package aulaSobreSwitch;
// Aula 85 - continue(rotulado) - 12/08/24
public class aula85 {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { // é como dar um nome para o laço
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					continue externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		
		System.out.println("Fim!");
	}
}
