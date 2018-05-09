package br.com.app.backend.domain;

public class Recibo extends ReciboSimplificado {
	
	private String destinatario;
	private String nomeCondominio;
	private String codigoBarras;
	private String valor;
	
	public Recibo(String codCondominio, String unidade, String bloco, String numero, String vencimento,
			String destinatario, String nomeCondominio, String codigoBarras, String valor) {
		super(codCondominio, unidade, bloco, numero, vencimento);
		this.destinatario = destinatario;
		this.nomeCondominio = nomeCondominio;
		this.codigoBarras = codigoBarras;
		this.valor = valor;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getNomeCondominio() {
		return nomeCondominio;
	}

	public void setNomeCondominio(String nomeCondominio) {
		this.nomeCondominio = nomeCondominio;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}





	
}
