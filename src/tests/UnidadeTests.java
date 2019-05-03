package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Escola;
import models.TipoUnidade;
import models.Unidade;

class UnidadeTests {

	@Test
	void cadastrarUnidade() {
		Escola escola = new Escola("Fisk");
		Unidade unidade = new Unidade("sao jose dos campos", "rua sao joao", "1239393939", "sao.jose@fisk.com", TipoUnidade.Online);
		
		escola.cadastrarUnidade(unidade);
		
		assertEquals(escola.getUnidades().size(), 1);
		assertEquals(escola.getUnidades().get(0).getNome(), unidade.getNome());
		assertEquals(escola.getUnidades().get(0).getEmail(), unidade.getEmail());
	}
	
	@Test
	void editarUnidade() {
		final String email = "teste@teste.com";
		final String endereco = "rua dos testes";
		
		Escola escola = new Escola("Fisk");
		Unidade unidade = new Unidade("sao jose dos campos", "rua sao joao", "1239393939", "sao.jose@fisk.com", TipoUnidade.Presencial);	
		
		escola.cadastrarUnidade(unidade);
		escola.getUnidades().get(0).setEmail(email);
		escola.getUnidades().get(0).setEndreco(endereco);
		
		assertEquals(escola.getUnidades().get(0).getEmail(), email);
		assertEquals(escola.getUnidades().get(0).getEndreco(), endereco);
	}
	
	@Test
	void excluirUnidade() {
		Escola escola = new Escola("Fisk");
		Unidade unidade = new Unidade("sao jose dos campos", "rua sao joao", "1239393939", "sao.jose@fisk.com", TipoUnidade.Presencial);
				
		escola.cadastrarUnidade(unidade);
		assertEquals(escola.getUnidades().size(), 1);
		
		escola.removerUnidade(unidade);
		assertEquals(escola.getUnidades().size(), 0);		
	}	

}
