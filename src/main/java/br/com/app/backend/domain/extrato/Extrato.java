package br.com.app.backend.domain.extrato;

import java.util.List;

public class Extrato {
	private List <ContaCorrente> contas;
	private ResumoCondominio resumoCondominio;
	
	public Extrato() {
		
	}
	
	public Extrato(List<ContaCorrente> contas, ResumoCondominio resumoCondominio) {
		super();
		this.contas = contas;
		this.resumoCondominio = resumoCondominio;
	}
	public List<ContaCorrente> getContas() {
		return contas;
	}
	public void setContas(List<ContaCorrente> contas) {
		this.contas = contas;
	}
	public ResumoCondominio getResumoCondominio() {
		return resumoCondominio;
	}
	public void setResumoCondominio(ResumoCondominio resumoCondominio) {
		this.resumoCondominio = resumoCondominio;
	}
	
	
}
