package strategy;

public class CalculadorDeImposto {
//	public CalculadorDeImposto(Orcamento orcamento) {
//		double icms = orcamento.getValor() * 0.1;//Problema? Vários impostos
//	}
//	public CalculadorDeImposto(Orcamento orcamento, String tipoImposto) {
//		double imposto = 0;
//		if(tipoImposto.equals("ICMS"))
//			imposto = orcamento.getValor() * 0.1;
//		else if(tipoImposto.equals("ISS"))
//			imposto = orcamento.getValor() * 0.025;
//		System.out.println("Iposto: "+imposto); 
//		//Problema? Número de impostos pode crescer. Deve-se criar classes ISS, ICMS...
//	}
	
	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {
		System.out.println("Imposto devido: "+imposto.calcular(orcamento));
	}
}
