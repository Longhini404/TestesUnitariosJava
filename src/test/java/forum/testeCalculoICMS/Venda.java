package forum.testeCalculoICMS;

import java.math.BigDecimal;

public class Venda {

	private BigDecimal valor;
	private UnidadeFederativa uf;
	private BigDecimal aliquotaCMS;
	
	
	public Venda(BigDecimal valor, UnidadeFederativa uf, BigDecimal aliquotaCMS) {
		this.aliquotaCMS = aliquotaCMS;
		this.valor = valor;
		this.uf = uf;
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public BigDecimal getAliquotaCMS() {
		return aliquotaCMS;
	}
	
	public UnidadeFederativa getUf() {
		return uf;
	}

}
