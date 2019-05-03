package models;

import java.util.LinkedList;
import java.util.List;

public class Unidade {
	private String nome, endereco, telefone, email;
	private TipoUnidade tipoUnidade;
	private List<Curso> cursos = new LinkedList<Curso>();
	
	public Unidade(String nome, String endereco, String telefone, String email, TipoUnidade tipoUnidade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.tipoUnidade = tipoUnidade;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public void adicionaCurso(Curso curso) {
		this.cursos.add(curso);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndreco() {
		return endereco;
	}

	public void setEndreco(String endreco) {
		this.endereco = endreco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public boolean compararUnidade(Unidade unidade)
	{
		if (unidade.getNome().equals(this.nome) && unidade.getEndreco().equals(this.endereco))
			return true;
		
		return false;
	}
}