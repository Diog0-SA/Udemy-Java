package exerciciosEstruturaDeControle;
//import java.time.LocalDate;
import java.util.Calendar;
/*
 Criar um programa informa se o ano atual é um ano bissexto;
 
 12/08/24
*/
public class ex2 {

	public static void main(String[] args) {
		
		// Pegando ano atual do computador
		Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        
		
		// int anoAtual = 2000; Ano manipulavel
		
        // Verificando se é bissexto
		if ((anoAtual % 4 == 0 && anoAtual % 100 != 0) || anoAtual % 400 == 0) {
		    System.out.println(anoAtual + " é um ano bissexto.");
		} else {
		    System.out.println(anoAtual + " não é um ano bissexto.");
		}
		
		/* Usando o LocalDate e o isLeapYear()
		LocalDate data = LocalDate.of(anoAtual, 1, 1);

        if (data.isLeapYear()) {
            System.out.println(anoAtual + " é um ano bissexto.");
        } else {
            System.out.println(anoAtual + " não é um ano bissexto.");
        }
        */
    }
		 
	
}
