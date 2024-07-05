package org.coursera.precoPizza;

import java.util.HashMap;

public class Pizza {
	// String ingrediente, Integer quantidade
	static HashMap<String, Integer> ingredientes = new HashMap<>();
	Integer quantidadeIngredientes = 0;

	public Pizza() {
	}

	public void adicionaIngrediente(String ingrediente) {
		// Adiciona ingrediente dentro da lista
		contabilizaIngredientes(ingrediente);
		quantidadeIngredientes++;
	}

	public static void contabilizaIngredientes(String ingrediente) {
		// Irá somar +1, caso exista uma chave do mesmo nome de ingrediente cadastrado
		// caso contrário salvará um novo registro
		if (ingredientes.get(ingrediente) != null) {
			ingredientes.put(ingrediente, ingredientes.get(ingrediente) + 1);
		} else {
			ingredientes.put(ingrediente, 1);
		}
	}

	public Integer getQuantidadeIngredientes() {
		return quantidadeIngredientes;
	}

	public Double getPreco(Integer somaIngredientes) {
		Double preco = 0.0;
		if (somaIngredientes <= 2) {
			preco = 15.0;
		} else if (somaIngredientes >= 3 && somaIngredientes <= 5) {
			preco = 20.0;
		} else if (somaIngredientes > 5) {
			preco = 23.0;
		}
		return preco;
	}
	// Mostrar todos os ingredientes e quantidades

	public static void getIngredientes() {
		Pizza.ingredientes.forEach((a, b) -> {
			System.out.println("- " + a + ": " + b);
		});
	}
	//Realiza a limpeza de todos os elementos do HashMap
	public static void zerarIngredientes() {
		Pizza.ingredientes.clear();
	}

}
