package models;

import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	private int idadeMinima, idadeMaxima, tempoDuracao;
	private List<Bolsa> bolsas = new LinkedList<Bolsa>();
	
	public Curso(String nome, int min, int max, int duracao) {
		this.nome = nome;
		this.idadeMinima = min;
		this.idadeMaxima = max;
		this.tempoDuracao = duracao;
	}

	public List<Bolsa> getBolsas() {
		return bolsas;
	}

	public void setBolsas(List<Bolsa> bolsas) {
		this.bolsas = bolsas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public int getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(int idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public void adicionaBolsa(Bolsa bolsa) {
		this.bolsas.add(bolsa);
	}
	
	public void removerBolsa(Bolsa bolsa) {
		this.bolsas.remove(bolsa);
	}
}
