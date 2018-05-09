package br.com.app.backend.domain.extrato;

public class Cabecalho {
	
	private String nomeCondominio;
	private String codigoCondominio;
	private String contaCorrente;
	private String referencia;
	
	public Cabecalho() {}
	
	public Cabecalho(String nomeCondominio, String codigoCondominio, String contaCorrente, String referencia) {
		super();
		this.nomeCondominio = nomeCondominio;
		this.codigoCondominio = codigoCondominio;
		this.contaCorrente = contaCorrente;
		this.referencia = referencia;
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
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
}
