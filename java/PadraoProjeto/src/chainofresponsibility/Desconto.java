package chainofresponsibility;

import strategy.Orcamento;

public interface Desconto {
	double desconto(Orcamento orcamento);
	void setPoximo(Desconto proximo);
}
