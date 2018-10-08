package templatemethod;

import strategy.Orcamento;

//public class IOF implements Imposto {
//
//	@Override
//	public double calcular(Orcamento orcamento) {
//		if(orcamento.getValor() > 1000) return orcamento.getValor() * 0.07; //taxa maxima
//		else return orcamento.getValor() * 0.05; //taxa minima
//	}
//
//}

public class IOF extends TemplateDeImpostoCondicionado {
	@Override
	double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
	@Override
	double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
	@Override
	boolean excedeLimitesNo(Orcamento orcamento) {
		return orcamento.getValor() > 1000;
	}
}
