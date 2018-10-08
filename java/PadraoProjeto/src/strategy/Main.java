package strategy;

public class Main {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(1000);
		
		CalculadorDeImposto calculaImposto = new CalculadorDeImposto();
		calculaImposto.realizarCalculo(orcamento, iss);
		calculaImposto.realizarCalculo(orcamento, icms);
		
	}
}
