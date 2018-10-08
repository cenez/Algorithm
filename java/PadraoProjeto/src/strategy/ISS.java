package strategy;

public class ISS implements Imposto {
//	public double calculaISS(Orcamento orcamento) {
//		return orcamento.getValor() * 0.025;
//	}
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.025;
	}
}
