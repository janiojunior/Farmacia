package br.unitins.topicos1.farmacia.converter.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.unitins.topicos1.farmacia.model.TipoPagamento;

@Converter(autoApply = true)
public class TipoPagamentoConverter implements AttributeConverter<TipoPagamento, Integer> {

	@Override
	public Integer convertToDatabaseColumn(TipoPagamento tipo) {
		return tipo.getId();
	}

	@Override
	public TipoPagamento convertToEntityAttribute(Integer id) {
		return TipoPagamento.valueOf(id);
	}

}
