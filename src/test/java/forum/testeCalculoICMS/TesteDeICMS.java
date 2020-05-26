package forum.testeCalculoICMS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TesteDeICMS {

	@Test
	void testar_venda_ICMS_de_acordo_com_UF() {
		UnidadeFederativa pr = new UnidadeFederativa("PR");
		UnidadeFederativa sc = new UnidadeFederativa("SC");
		UnidadeFederativa sp = new UnidadeFederativa("SP");
		
		GerenciadorDeParametros gerenciadorDeParametros = new GerenciadorDeParametrosDefault();
		GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas(gerenciadorDeParametros);
		
		
		BigDecimal aPR = gerenciadorDeParametros.getPercentualICMS(pr);
		BigDecimal aSP = gerenciadorDeParametros.getPercentualICMS(sp);
		BigDecimal aSC = gerenciadorDeParametros.getPercentualICMS(sc);
		
		Venda vendaPR = gerenciadorDeVendas.efetuarVenda(pr, new BigDecimal("100.00"));
		Venda vendaSP = gerenciadorDeVendas.efetuarVenda(sp, new BigDecimal("200.00"));
		Venda vendaSC = gerenciadorDeVendas.efetuarVenda(sc, new BigDecimal("300.00"));
		
		
		assertEquals(aPR, vendaPR.getAliquotaCMS());
		assertEquals(aSP, vendaSP.getAliquotaCMS());
		assertEquals(aSC, vendaSC.getAliquotaCMS());
	}

	
}
