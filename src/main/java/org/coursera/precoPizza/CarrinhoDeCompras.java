package org.coursera.precoPizza;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	public CarrinhoDeCompras() {

	}

	public boolean adicionaCarrinho(Pizza pizza) {
		// Realiza a verificação se a pizza tem ingredientes
		// Caso seja igual a zero, não adiciona a pizza ao ArrayList e retorna false
		if (pizza.getQuantidadeIngredientes() == 0) {
			return false;
		}
		pizzas.add(pizza);
		return true;
	}

	public Integer getSomaPizzas() {
		return pizzas.size();
	}

	public Double getSomaValorPizzas() {
		// Gera uma variável para a soma;
		Double somaValorPizzas = 0.0;
		// Percorre a lista e itera a variável
		for (Pizza pizza : pizzas) {
			somaValorPizzas += pizza.getPreco(pizza.getQuantidadeIngredientes());

		}
		return somaValorPizzas;
	}

	// Realiza a limpeza de todos os so ArrayList
	public static void zeraCarrinho() {
		CarrinhoDeCompras.pizzas.clear();
	}

}
