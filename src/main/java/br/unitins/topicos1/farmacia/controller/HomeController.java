package br.unitins.topicos1.farmacia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

import br.unitins.topicos1.farmacia.model.Remedio;
import br.unitins.topicos1.farmacia.repository.RemedioRepository;

@RequestScoped
@Named
public class HomeController {
	
	@Inject
	private RemedioRepository repository;
	private List<Remedio> listaRemedio;
	
	@PostConstruct
	public void init() {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		Object resultado = flash.get("pesquisaRemedio");
		// verificando se teve consulta de remedio pela pesquisa no template
		if (resultado != null)
			setListaRemedio((ArrayList<Remedio>)resultado);
		else
			setListaRemedio(repository.buscarTodos());
	}
	
	public void adicionarCarrinho(Remedio remedio) {
		
	}


	public List<Remedio> getListaRemedio() {
		return listaRemedio;
	}

	public void setListaRemedio(List<Remedio> listaRemedio) {
		this.listaRemedio = listaRemedio;
	}

}
