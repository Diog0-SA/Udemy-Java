package desafioData;
// Aula 95 - 28/08/24
public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		/*
		String data = dia + " / " + mes + " / " + ano;
		return data;
		*/
		return String.format("%d/%d/%d\n", ano, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.print(obterDataFormatada());
	}
	
	 // O System.out.println() só funciona com o terminal, 
	//   por isso é mais interessante retornar uma String 
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
}
