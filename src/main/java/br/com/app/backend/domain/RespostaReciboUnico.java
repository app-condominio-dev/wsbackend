package br.com.app.backend.domain;

public class RespostaReciboUnico implements RespostaRecibo {

	private String tipo;
	private Recibo recibo;
	
	public RespostaReciboUnico () {};

	
	public RespostaReciboUnico(String tipo, Recibo recibo) {
		super();
		this.tipo = tipo;
		this.recibo = recibo;
	}


	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}

}
