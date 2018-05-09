package br.com.app.backend.dto;

import br.com.app.backend.domain.Complemento;

public class UsuarioFixo{
	private String perfil;
	private String senha;
	private Complemento complento;
	
	public UsuarioFixo(String perfil, String senha, Complemento complento) {
		super();
		this.setPerfil(perfil);
		this.setSenha(senha);
		this.setComplento(complento);
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Complemento getComplento() {
		return complento;
	}

	public void setComplento(Complemento complento) {
		this.complento = complento;
	}
	
	
}
