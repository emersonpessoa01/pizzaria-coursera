package org.coursera.precoPizza;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CarrinhoDeComprasTest {
	// Gera um objeto da classe CarrinhoDeCompras
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	@Before
	public void before() {
		// Limpa o HasMap de ingredientes a cada @Test
		CarrinhoDeCompras.zeraCarrinho();
	}

	// Verifica a Soma dos Valores das pizzas acrescentadas no carrinho
	@Test
	public void testSomaValorPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Queijo");
		// Acrescenta a 1a pizza no CarrinhoCompras
		carrinho.adicionaCarrinho(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Cebola");
		// Acrescenta a 2a pizza no CarrinhoCompras
		carrinho.adicionaCarrinho(p2);

		assertEquals(85, carrinho.getSomaValorPizzas(), 0);
	}

	// Verifica a soma de pizzas acrescentadas no carrinho
	@Test
	public void testSomaPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Mussarela");
		// Acrescenta 1a pizza no carrinhoCompras
		carrinho.adicionaCarrinho(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Queijo");
		// Acrescenta 2a pizza no carrinhoCompras
		carrinho.adicionaCarrinho(p2);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Mussarela");
		// Acrescenta 3a pizza no carrinhoCompras
		carrinho.adicionaCarrinho(p3);

		// 4a pizza não acrescentada, não possui ingredientes
		Pizza p4 = new Pizza();
		carrinho.adicionaCarrinho(p4);

		assertEquals(3, carrinho.getSomaPizzas(), 0);

	}
	// Verifica a adição de pizza sem ingredientes no carrinho
	@Test
	public void testAdicionaPizzaCarrinhoSemIngredientes() {
		Pizza p3 = new Pizza();
		
		assertEquals(false, carrinho.adicionaCarrinho(p3));
	}
}
