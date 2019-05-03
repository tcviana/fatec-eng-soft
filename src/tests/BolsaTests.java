package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Bolsa;
import models.Curso;

class BolsaTests {

	@Test
	void cadastrarBolsa() {
		Curso curso = new Curso("Kids", 3, 12, 12);
		
		curso.adicionaBolsa(new Bolsa(100.0, 10.0));
		curso.adicionaBolsa(new Bolsa(150.0, 15.0));

		assertEquals(curso.getBolsas().size(), 2);
		assertEquals(curso.getBolsas().get(0).getValor(), 100.0);
		assertEquals(curso.getBolsas().get(1).getDesconto(), 15.0);
	}
	
	@Test
	void editarBolsa() {
		Curso curso = new Curso("Kids", 3, 12, 12);
		
		curso.adicionaBolsa(new Bolsa(100.0, 10.0));

		assertEquals(curso.getBolsas().size(), 1);
		assertEquals(curso.getBolsas().get(0).getValor(), 100.0);
		assertEquals(curso.getBolsas().get(0).getDesconto(), 10.0);
		
		curso.getBolsas().get(0).setValor(150.0);
		
		assertEquals(curso.getBolsas().get(0).getValor(), 150.0);
	}	
	
	@Test
	void excluirBolsa() {
		Curso curso = new Curso("Kids", 3, 12, 12);
		Bolsa bolsa = new Bolsa(100.0, 10.0);
		
		curso.adicionaBolsa(bolsa);

		assertEquals(curso.getBolsas().size(), 1);

		curso.removerBolsa(bolsa);
		
		assertEquals(curso.getBolsas().size(), 0);
	}	


}
