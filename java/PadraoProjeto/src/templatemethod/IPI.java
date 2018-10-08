package templatemethod;

import chainofresponsibility.Item;
import strategy.Orcamento;


//public class IPI implements Imposto {
//	@Override
//	public double calcular(Orcamento orcamento) {
//		if(orcamento.getValor() > 1000 && temItemComValorSignificativoNo(orcamento))
//			return orcamento.getValor() * 0.1; // taxa maxima
//		else return orcamento.getValor() * 0.08; // taxa minima
//	}
//	private boolean temItemComValorSignificativoNo(Orcamento orcamento) {
//		for (Item item : orcamento.getItens()) {
//			if(item.getValor() >= 500) return true;
//		}
//		return false;
//	}
//}	
public class IPI extends TemplateDeImpostoCondicionado {
	@Override
	double taxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
	@Override
	double taxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.08;
	}
	
	@Override
	boolean excedeLimitesNo(Orcamento orcamento) {
		return orcamento.getValor() > 1000 && temItemComValorSignificativoNo(orcamento);
	}
	private boolean temItemComValorSignificativoNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() >= 500) return true;
		}
		return false;
	}
}
