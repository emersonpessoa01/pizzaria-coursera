package org.coursera.precoPizza;

public class Principal {

	public static void main(String[] args) {
		// Instacia o carinho de compra
		CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Tomate");

		// Acrescenta 1a pizza no CarrinhoCompras
		carrinhoCompras.adicionaCarrinho(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Presunto");

		// Acrescenta 2a pizza no CarrinhoCompras
		carrinhoCompras.adicionaCarrinho(p2);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Tomate");
		p3.adicionaIngrediente("Presunto");
		p3.adicionaIngrediente("Cebola");
		p3.adicionaIngrediente("Azeitona");
		p3.adicionaIngrediente("Ovo");

		// Acrescenta 3a pizza no CarrinhoCompras
		carrinhoCompras.adicionaCarrinho(p3);

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=- Carrinho de Compras -=-=-=-=-=-=-=-=-=-=-=- ");
		if (carrinhoCompras.getSomaPizzas() > 0) {
			System.out.println("A soma de pizzas acrescentadas no carrinho: " + carrinhoCompras.getSomaPizzas());
			System.out.println("-=-=-=-=-=-=-=- Quantidade de ingredientes usados -=-=-=-=-=-=-=-=-");
			Pizza.getIngredientes();

		} else {
			System.out.println("Carrinho está vazio");
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}

}
