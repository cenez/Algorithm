package templatemethod;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondicionado implements Imposto {
	
	@Override
	public double calcular(Orcamento orcamento) {
		if(excedeLimitesNo(orcamento))
			return taxaMaxima(orcamento);
		else return taxaMinima(orcamento);
	}
	
	abstract boolean excedeLimitesNo(Orcamento orcamento);
	abstract double taxaMaxima(Orcamento orcamento);
	abstract double taxaMinima(Orcamento orcamento);
}
