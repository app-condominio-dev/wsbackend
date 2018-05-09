package br.com.app.backend.domain.extrato;

public class Detalhe {
	private String coluna1;
	private String coluna2;
	private String coluna3;
	private String coluna4;
	private String coluna5;
	private String tipo;

	

	public Detalhe() {
		
	}
	
	public Detalhe(String coluna1, String coluna2, String coluna3, String coluna4, String coluna5, String tipo) {
		super();
		this.coluna1 = coluna1;
		this.coluna2 = coluna2;
		this.coluna3 = coluna3;
		this.coluna4 = coluna4;
		this.coluna5 = coluna5;
		this.tipo = tipo;
		
	}

	public String getColuna1() {
		return coluna1;
	}

	public void setColuna1(String coluna1) {
		this.coluna1 = coluna1;
	}

	public String getColuna2() {
		return coluna2;
	}

	public void setColuna2(String coluna2) {
		this.coluna2 = coluna2;
	}

	public String getColuna3() {
		return coluna3;
	}

	public void setColuna3(String coluna3) {
		this.coluna3 = coluna3;
	}

	public String getColuna4() {
		return coluna4;
	}

	public void setColuna4(String coluna4) {
		this.coluna4 = coluna4;
	}

	public String getColuna5() {
		return coluna5;
	}

	public void setColuna5(String coluna5) {
		this.coluna5 = coluna5;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	
}
