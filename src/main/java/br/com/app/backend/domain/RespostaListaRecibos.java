package br.com.app.backend.domain;

import java.util.ArrayList;
import java.util.List;

public class RespostaListaRecibos implements RespostaRecibo{

	private String tipo;
	private List<ReciboSimplificado> listaRecibos = new ArrayList<>();
	
	public RespostaListaRecibos() {};

	@Override
	public String getTipo() {
		return this.tipo;
	}


	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public RespostaListaRecibos(String tipo, List<ReciboSimplificado> listaRecibos) {
		super();
		this.tipo = tipo;
		this.listaRecibos = listaRecibos;
	}


	public List<ReciboSimplificado> getListaRecibos() {
		return listaRecibos;
	}


	public void setListaRecibos(List<ReciboSimplificado> listaRecibos) {
		this.listaRecibos = listaRecibos;
	}

	
	

}
