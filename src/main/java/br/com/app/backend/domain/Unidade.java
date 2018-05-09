package br.com.app.backend.domain;

public class Unidade {
	
	private String codigoCondominio;
	private String nomeCondominio;
	private String codigo;
	private String bloco;
	private String nomeCondomino;
	

	public Unidade() {}


	public Unidade(String codigoCondominio, String nomeCondominio, String codigo, String bloco, String nomeCondomino) {
		super();
		this.codigoCondominio = codigoCondominio;
		this.nomeCondominio = nomeCondominio;
		this.codigo = codigo;
		this.bloco = bloco;
		this.nomeCondomino = nomeCondomino;
	}


	public String getCodigoCondominio() {
		return codigoCondominio;
	}


	public void setCodigoCondominio(String codigoCondominio) {
		this.codigoCondominio = codigoCondominio;
	}


	public String getNomeCondominio() {
		return nomeCondominio;
	}


	public void setNomeCondominio(String nomeCondominio) {
		this.nomeCondominio = nomeCondominio;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getBloco() {
		return bloco;
	}


	public void setBloco(String bloco) {
		this.bloco = bloco;
	}


	public String getNomeCondomino() {
		return nomeCondomino;
	}


	public void setNomeCondomino(String nomeCondomino) {
		this.nomeCondomino = nomeCondomino;
	};
	

	



}
