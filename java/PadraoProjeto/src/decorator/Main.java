package decorator;

import strategy.Orcamento;
public class Main {

//	public static void main(String[] args) {
//		IImposto iss = new ISS();
//		IImposto icms = new ICMS();
//		Orcamento orcamento = new Orcamento(5000);
//		
//		double valor = iss.calcular(orcamento)+ icms.calcular(orcamento);
//		
//		System.out.println(valor);
//
//	}
	public static void main(String[] args) {
		Imposto imposto = new ISS(new ICMS(new IPI()));
		Orcamento orcamento = new Orcamento(5000);
		
		double valor = imposto.calcular(orcamento);
		
		System.out.println(valor);

	}
}
