package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Bolsa;
import models.Curso;

class CursoTests {

	@Test
	void cadastrarCurso() {
		double valor = 120.0, desconto = 10.0;
		
		Curso curso = new Curso("Kids", 3, 12, 12);
		Bolsa bolsa = new Bolsa(valor, desconto);
		
		curso.adicionaBolsa(bolsa);
		
		assertEquals(curso.getBolsas().size(), 1);
		assertEquals(curso.getBolsas().get(0).getValor(), valor);
		assertEquals(curso.getBolsas().get(0).getDesconto(), desconto);
	}
	
	@Test
	void editarCurso() {
		double valor = 120.0, desconto = 10.0;
		double novoValor = 150.0, novoDesconto = 5.0;
		
		Curso curso = new Curso("Kids", 3, 12, 12);
		Bolsa bolsa = new Bolsa(valor, desconto);
		
		curso.adicionaBolsa(bolsa);
		
		curso.getBolsas().get(0).setValor(novoValor);
		curso.getBolsas().get(0).setDesconto(novoDesconto);
		
		assertEquals(curso.getBolsas().get(0).getValor(), novoValor);
		assertEquals(curso.getBolsas().get(0).getDesconto(), novoDesconto);
	}
	
	@Test
	void excluirUnidade() {
		double valor = 120.0, desconto = 10.0;
		
		Curso curso = new Curso("Kids", 3, 12, 12);
		Bolsa bolsa = new Bolsa(valor, desconto);
		
		curso.adicionaBolsa(bolsa);
		assertEquals(curso.getBolsas().size(), 1);
		
		curso.removerBolsa(bolsa);
		assertEquals(curso.getBolsas().size(), 0);
	}

}
