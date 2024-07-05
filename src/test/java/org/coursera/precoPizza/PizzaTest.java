package org.coursera.precoPizza;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PizzaTest {

	// Instancia um objeto da classe Pizza
	Pizza pizza = new Pizza();

	@Before
	public void before() {
		// Zera o hasMap de ingredientes a cada
		// @Test
		Pizza.zerarIngredientes();
	}

	@Test
	public void testAdicionaIngredientes() {
		// Acrescenta 4 ingredientes
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Palmito");

		// Verifica a quantidade de ingredientes acrescentado está certo
		assertEquals(4, pizza.getQuantidadeIngredientes(), 0);
	}

	@Test
	public void testValor15() {
		// Acrescenta 2 ingredientes
		pizza.adicionaIngrediente("Calabreza");
		pizza.adicionaIngrediente("Queijo");

		// Verifica a quantidade de ingredientes acrescentado está certo
		assertEquals(15, pizza.getPreco(pizza.getQuantidadeIngredientes()), 0);

	}

	@Test
	public void testValor20() {
		// Acrescenta 4 ingredientes
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Tomate");

		// Verifica a quantidade de ingredientes acrescentado está certo
		assertEquals(20, pizza.getPreco(pizza.getQuantidadeIngredientes()), 0);
	}
	@Test
	public void testValor23() {
		// Acrescenta 5 ingredientes
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Palmito");
		pizza.adicionaIngrediente("Orégano");
		
		// Verifica a quantidade de ingredientes acrescentado está certo
		assertEquals(23, pizza.getPreco(pizza.getQuantidadeIngredientes()), 0);
	}
}