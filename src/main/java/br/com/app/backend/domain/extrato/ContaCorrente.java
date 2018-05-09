package br.com.app.backend.domain.extrato;

import java.util.List;

public class ContaCorrente {
	
	private Cabecalho cabecalho;
	private List<Detalhe> detalhes;
	private List<Resumo> resumos;
	
	public ContaCorrente() {}
	
	public ContaCorrente(Cabecalho cabecalho, List<Detalhe> detalhes, List<Resumo> resumos) {
		super();
		this.cabecalho = cabecalho;
		this.detalhes = detalhes;
		this.resumos = resumos;
	}
	public Cabecalho getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}
	public List<Detalhe> getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(List<Detalhe> detalhes) {
		this.detalhes = detalhes;
	}
	public List<Resumo> getResumos() {
		return resumos;
	}
	public void setResumos(List<Resumo> resumos) {
		this.resumos = resumos;
	}
}
