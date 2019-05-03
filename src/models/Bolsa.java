package models;

public class Bolsa {
	private double valor, desconto;

	public Bolsa(double valor, double desconto) {
		this.valor = valor;
		this.desconto = desconto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
