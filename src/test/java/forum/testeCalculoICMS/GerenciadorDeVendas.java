package forum.testeCalculoICMS;

import java.math.BigDecimal;

public class GerenciadorVendas {
	private GerenciadorParametros gerenciadorParametros;
	
	public GerenciadorVendas(GerenciadorParametros gerenciador) {
		this.gerenciadorParametros = gerenciador;
	}
	public Venda efetuarVenda(UnidadeFederativa uf, BigDecimal valor) {
		return new Venda(valor, gerenciadorParametros.getPercentualICMS(uf), uf);
		
	}

}
