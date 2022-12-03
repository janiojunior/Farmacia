package br.unitins.topicos1.farmacia.model;

import java.util.List;

public enum Perfil {
	CLIENTE(3, "Cliente", List.of()), 
	ADMINISTRADOR(1, "Administrador", List.of("/Farmacia/faces/admin/usuarios.xhtml","/Farmacia/faces/admin/formusuario.xhtml")), 
	CAIXA(2, "Caixa", List.of("/Farmacia/faces/admin/usuarios.xhtml")), 
	VENDEDOR(4, "Vendedor", List.of("/Farmacia/faces/admin/usuarios.xhtml"));

	private int id;
	private String label;
	private List<String> paginas;
	
	Perfil(int id, String label, List<String> paginas) {
		this.id = id;
		this.label = label;
		this.paginas = paginas;
	}
	
	public List<String> getPaginas() {
		return paginas;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
		
	}
	
	public static Perfil valueOf(Integer id) {
		if (id == null)
			return null;
		for (Perfil perfil : Perfil.values()) 
			if (perfil.getId() == id) 
				return perfil;
		return null;
	}
	

}
