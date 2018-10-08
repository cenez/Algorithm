package chainofresponsibility;

import strategy.Orcamento;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		//falha1
//		//Regra 1: Orcamento com mais de 3 itens, merece desconto.
//		if(orcamento.getItens().size()>3)
//			return orcamento.getValor() * 0.05;
//		//Regra 2: Orcamento com valor maior que 1000, merece desconto.
//		else if(orcamento.getValor() > 1000)
//			return orcamento.getValor() * 0.1;
//		
		//falha2
//		double desconto = new DescontoPorItens().desconto(orcamento);
//		if(desconto==0) desconto = new DescontoPorValor().desconto(orcamento);
		
		Desconto desconto1 = new DescontoPorItens();
		Desconto desconto2 = new DescontoPorValor();
		Desconto desconto3 = new SemDesconto();
		
		desconto1.setPoximo(desconto2); // é preciso de um "sem desconto" padrao
		desconto2.setPoximo(desconto3);

		return desconto1.desconto(orcamento);//Se desconto1 falhar, chama-se desconto2 encadeando descontos
	}
}
