package aulaSobreSwitch;
//Aula 83 - continue 1 - 12/08/24
public class aula83 {

	public static void main(String[] args) {
		
		// Se o continue rodar ele reinicia a repetição, é como se fosse um "passa"
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for (int i = 1; i < 10; i++) {
			if(i == 5) continue; // Pode ser sem as chaves também
			
			System.out.println(i);
		}
	}
}
