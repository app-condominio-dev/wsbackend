package br.com.app.backend.domain.extrato;

public class ResumoCondominio {
	private String descricao;
	private String saldoAnterior;
	private String recebimentos; 
	private String pagamentos;
	private String saldoAtual;
	
	public ResumoCondominio() {}
	
	public ResumoCondominio(String descricao, String saldoAnterior, String recebimentos, String pagamentos,
			String saldoAtual) {
		super();
		this.descricao = descricao;
		this.saldoAnterior = saldoAnterior;
		this.recebimentos = recebimentos;
		this.pagamentos = pagamentos;
		this.saldoAtual = saldoAtual;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(String saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}
	public String getRecebimentos() {
		return recebimentos;
	}
	public void setRecebimentos(String recebimentos) {
		this.recebimentos = recebimentos;
	}
	public String getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(String pagamentos) {
		this.pagamentos = pagamentos;
	}
	public String getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(String saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
}
