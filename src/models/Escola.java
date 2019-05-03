package models;

import java.util.LinkedList;
import java.util.List;

public class Escola {
	private String nome;
	private List<Unidade> unidades = new LinkedList<Unidade>();
	
	public Escola(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}
	
	public void cadastrarUnidade(Unidade unidade)
	{
		unidades.add(unidade);
	}
	
	public void removerUnidade(Unidade unidade)
	{
		for (Unidade _unidade : unidades)
		{
			if (_unidade.compararUnidade(unidade)) {
				unidades.remove(_unidade);
				break;
			}
		}
	}
}
