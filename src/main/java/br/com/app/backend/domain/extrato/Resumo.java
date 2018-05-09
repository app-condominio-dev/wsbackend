package br.com.app.backend.domain.extrato;

public class Resumo {
	private String descricao;
	private String valor;
	
	public Resumo() {}
	
	public Resumo(String descricao, String valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}


}
