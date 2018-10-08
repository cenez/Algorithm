package strategy;

public class ICMS implements Imposto {
//	public double calculaICMS(Orcamento orcamento) {
//		return orcamento.getValor() * 0.1;
//	}
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
