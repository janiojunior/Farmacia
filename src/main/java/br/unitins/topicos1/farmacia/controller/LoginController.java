package br.unitins.topicos1.farmacia.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {
	private String usuario;
	private String senha;
	
	public String logar() {
		return "usuarios.xhtml?faces-redirect=true";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
