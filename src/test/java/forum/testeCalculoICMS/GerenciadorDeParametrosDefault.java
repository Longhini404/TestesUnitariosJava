package forum.testeCalculoICMS;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeParametros implements GerenciadorDeParametros{

	private Map<UnidadeFederativa, BigDecimal> aliquotasICMS = new HashMap<>();

	public GerenciadorDeParametrosDefault() {
		aliquotasICMS.put(new UnidadeFederativa("PR"), new BigDecimal("17.00"));
		alíquotasICMS.put(new UnidadeFederativa("SP"), new BigDecimal("12.00"));
		aliquotasICMS.put(new UnidadeFederativa("SC"), new BigDecimal("7.00"));
	}
	
	@Override
	public BigDecimal getPercentualICMS(UnidadeFederativa uf) {
		return this.aliquotasICMS.get(uf);
	}

	
	

}
