package br.com.app.backend.domain;

import java.util.List;

public class RespostaListaUnidades implements RespostaRecibo {

	private String tipo;
	private List<Unidade> listaUnidades;
	
	public RespostaListaUnidades() {};
	
	public RespostaListaUnidades(String tipo, List<Unidade> listaUnidades) {
		super();
		this.tipo = tipo;
		this.listaUnidades = listaUnidades;
	}


	@Override
	public String getTipo() {
		return this.tipo;
	}


	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<Unidade> getListaUnidades() {
		return listaUnidades;
	}


	public void setListaUnidades(List<Unidade> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}



}
