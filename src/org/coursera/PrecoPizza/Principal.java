package org.coursera.PrecoPizza;

import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// Criação das pizzas
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Tomate");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Presunto");

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Presunto");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Azeitona");
		pizza3.adicionaIngrediente("Ovo");

		// Adicionando as pizzas no carrinho
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);

		// Imprimindo o total do carrinho
		System.out.println("Total do Carrinho de Compras: R$ " + carrinho.getTotal());
		System.out.println("Quantidade utilizada de cada ingrediente: ");
		for (Map.Entry<String, Integer> entry : Pizza.getIngredientesUsados().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}

	}

}
