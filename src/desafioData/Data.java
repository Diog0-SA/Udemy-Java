package desafioData;
// Aula 95 - 28/08/24
public class Data {

	public int dia;
	public int mes;
	public int ano;
	
	public String obterDataFormatada(){
		/*
		String data = dia + " / " + mes + " / " + ano;
		return data;
		*/
		return String.format("%d/%d/%d\n", dia, mes, ano);
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
	
	public Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
}
