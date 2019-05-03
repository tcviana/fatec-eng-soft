package models;

import java.util.LinkedList;
import java.util.List;

public class Unidade {
	private String nome, endereco, telefone, email;
	private TipoUnidade tipoUnidade;
	private List<Curso> cursos = new LinkedList<Curso>();

	public Unidade(String nome, String endereco, String telefone, String email, TipoUnidade tipoUnidade) {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public boolean compararUnidade(Unidade unidade) {
		if (unidade.getNome().equals(this.nome) && unidade.getEndereco().equals(this.endereco))
			return true;

		return false;
	}

	public List<Curso> buscaCursosPorNome(String nome) {

		List<Curso> cursosRetorno = new LinkedList<Curso>();

		for (Curso curso : cursos) {
			if (curso.getNome().equals(nome)) {
				cursosRetorno.add(curso);
			}
		}

		return cursosRetorno;
	}

	public List<Curso> buscaCursosRangeIdade(int idadeMinima, int idadeMaxima) {

		List<Curso> cursosRetorno = new LinkedList<Curso>();

		for (Curso curso : cursos) {
			if (curso.getIdadeMinima() >= idadeMinima && curso.getIdadeMaxima() <= idadeMaxima) {
				cursosRetorno.add(curso);
			}
		}

		return cursosRetorno;
	}
}