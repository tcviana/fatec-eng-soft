package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import models.Escola;

class EscolaTests {

	@Test
	void cadastrarEscola() {
		List<Escola> escolas = new ArrayList<Escola>();
		
		Escola escola = new Escola("Fisk");
		Escola escola2 = new Escola("Microlins");
		Escola escola3 = new Escola("Microcamp");
		
		escolas.add(escola);
		escolas.add(escola2);
		escolas.add(escola3);
		
		assertEquals(escolas.size(), 3);
	}
	
	@Test
	void editarEscola() {
		final String novaEscola = "New English";
		List<Escola> escolas = new ArrayList<Escola>();
		
		escolas.add(new Escola("Fisk"));
		
		escolas.get(0).setNome(novaEscola);
		
		assertEquals(escolas.get(0).getNome(), novaEscola);
	}	
	
	@Test
	void excluirEscola() {
		List<Escola> escolas = new ArrayList<Escola>();
		
		Escola escola = new Escola("Fisk");
		Escola escola2 = new Escola("Microlins");
		
		escolas.add(escola);
		escolas.add(escola2);
		
		assertEquals(escolas.size(), 2);
		
		escolas.remove(escola);
		
		assertEquals(escolas.size(), 1);
	}	

}
