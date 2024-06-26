package org.coursera.PrecoPizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Pizza {
    private List<String> ingredientes;
    private static Map<String, Integer> ingredientesUsados = new HashMap<>();

    public Pizza() {
        this.ingredientes = new ArrayList<>();
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsados.put(ingrediente, ingredientesUsados.getOrDefault(ingrediente, 0) + 1);
    }

    public double getPreco() {
        int quantidadeIngredientes = ingredientes.size();
        if (quantidadeIngredientes <= 2) {
            return 15.0;
        } else if (quantidadeIngredientes <= 5) {
            return 20.0;
        } else {
            return 23.0;
        }
    }

    public static Map<String, Integer> getIngredientesUsados() {
        return ingredientesUsados;
    }

    public int getQuantidadeIngredientes() {
        return ingredientes.size();
    }
}
