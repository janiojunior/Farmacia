package br.unitins.topicos1.farmacia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos1.farmacia.application.Session;
import br.unitins.topicos1.farmacia.model.Compra;
import br.unitins.topicos1.farmacia.model.ItemCompra;

@ViewScoped
@Named
public class CarrinhoController implements Serializable{

	private static final long serialVersionUID = -5026285540821281897L;
	
	private Compra carrinho;
	
	public List<ItemCompra> getItensCarrinho() {
		Session session = Session.getInstance();
		
		carrinho = (Compra) session.get("carrinho");
		
		if (carrinho == null)
			return new ArrayList<ItemCompra>();
		
		return carrinho.getListaItemCompra();
	}

}
