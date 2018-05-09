package br.com.app.backend.domain;

import java.io.Serializable;

public class Complemento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7703769365601973083L;
	
	private String codigoCondominio;
	private String nomeCondominio;
	private String nomeUsuario;
	private String bloco;
	private String unidade;
	private String perfil;
	
	public Complemento() {};
	
	public Complemento(String codigoCondominio, String nomeCondominio, String nomeUsuario, String bloco, String unidade,
			String perfil) {
		super();
		this.codigoCondominio = codigoCondominio;
		this.nomeCondominio = nomeCondominio;
		this.nomeUsuario = nomeUsuario;
		this.bloco = bloco;
		this.unidade = unidade;
		this.perfil = perfil;
	}

	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getNomeCondominio() {
		return nomeCondominio;
	}
	public void setNomeCondominio(String nomeCondominio) {
		this.nomeCondominio = nomeCondominio;
	}
	public String getCodigoCondominio() {
		return codigoCondominio;
	}
	public void setCodigoCondominio(String codigoCondominio) {
		this.codigoCondominio = codigoCondominio;
	}




}
