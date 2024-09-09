package desafioData;
//Aula 95 - 28/08/24
public class DataTeste {

	public static void main(String[] args) {
		/*
		Data d1 = new Data();
		d1.dia = 28;
		d1.mes = 8;
		d1.ano = 2024;
		
		Data d2 = new Data();
		d2.dia = 11;
		d2.mes = 11;
		d2.ano = 1111;
		*/
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		var d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();

		
	}
}
