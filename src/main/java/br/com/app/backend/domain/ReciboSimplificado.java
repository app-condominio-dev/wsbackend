package br.com.app.backend.domain;

public class ReciboSimplificado {
	private String codCondominio;
	private String unidade;
	private String bloco;
	private String numero;
	private String vencimento;

	public ReciboSimplificado(String codCondominio, String unidade, String bloco, String numero, String vencimento) {
		super();
		this.codCondominio = codCondominio;
		this.unidade = unidade;
		this.bloco = bloco;
		this.numero = numero;
		this.vencimento = vencimento;
	}

	public String getCodCondominio() {
		return codCondominio;
	}

	public void setCodCondominio(String codCondominio) {
		this.codCondominio = codCondominio;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
