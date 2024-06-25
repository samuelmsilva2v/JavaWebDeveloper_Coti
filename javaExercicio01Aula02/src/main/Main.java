package main;

import controllers.ProdutoController;

public class Main {

	public static void main(String[] args) {

		try {
			ProdutoController produtoController = new ProdutoController();
			produtoController.cadastrarProduto();
		} 
		catch (Exception e) {
			System.out.println("\nERRO :"+ e.getMessage());
		}

	}

}
