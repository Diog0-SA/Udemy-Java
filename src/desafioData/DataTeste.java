package desafioData;
//Aula 95 - 28/08/24
public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 28;
		d1.mes = 8;
		d1.ano = 2024;
		
		Data d2 = new Data();
		d2.dia = 11;
		d2.mes = 11;
		d2.ano = 1111;
		
		System.out.printf("%d/%d/%d\n", d1.ano, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.ano, d2.mes, d2.ano);

		
	}
}
