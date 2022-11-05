package br.unitins.topicos1.farmacia.model;

import javax.persistence.Entity;

@Entity
public class Pagamento extends DefaultEntity {

	private Integer quantidadeParcela;
	private TipoPagamento tipoPagamento;

	public Integer getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(Integer quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
