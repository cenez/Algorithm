package decorator;

import strategy.Orcamento;

public class ISS extends Imposto {
	public ISS() { super(); }
	public ISS(Imposto imposto) {
		super(imposto);
	}
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.025 + calcularOutroImposto(orcamento);
	}
}
