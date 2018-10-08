package decorator;

import strategy.Orcamento;

public class ICMS extends Imposto {
	public ICMS() { super(); }
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calcularOutroImposto(orcamento);
	}
}
