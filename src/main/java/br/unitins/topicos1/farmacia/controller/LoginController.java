package br.unitins.topicos1.farmacia.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.topicos1.farmacia.model.Usuario;

@Named
@RequestScoped
public class LoginController {
	
	private Usuario usuario;
	
	public String logar() {
		System.out.println(getUsuario().getLogin());
		return "usuarios.xhtml?faces-redirect=true";
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}
