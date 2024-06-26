package org.coursera.PrecoPizza;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Pizza> pizzas;

	public CarrinhoDeCompras() {
		this.pizzas = new ArrayList<>();
	}

	public void adicionaPizza(Pizza pizza) {
		if (pizza.getQuantidadeIngredientes() > 0) {
			pizzas.add(pizza);
		} else {
			System.out.println("Pizza sem ingredientes não pode ser adicionada ao carrinho.");
		}
	}

	public double getTotal() {
		double total = 0;
		for (Pizza pizza : pizzas) {
			total += pizza.getPreco();
		}
		return total;
	}

}
