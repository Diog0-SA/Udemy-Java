package aulaSobreSwitch;
// Aula 82 - break 1 - 12/08/24
public class aula82 {

	public static void main(String[] args) {
		
		
		// Break não é exclusivo do switch
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
