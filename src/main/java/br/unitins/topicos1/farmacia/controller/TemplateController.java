package br.unitins.topicos1.farmacia.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.unitins.topicos1.farmacia.application.RepositoryException;
import br.unitins.topicos1.farmacia.application.Util;
import br.unitins.topicos1.farmacia.model.Usuario;
import br.unitins.topicos1.farmacia.repository.UsuarioRepository;

@Named
@ViewScoped
public class TemplateController implements Serializable {

	private static final long serialVersionUID = -747823450126578199L;
	
	public Usuario getUsuarioLogado() {
		Map session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		return (Usuario) session.get("usuarioLogado");
	}
	
	public void encerrarSessao() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return;
	}

}
