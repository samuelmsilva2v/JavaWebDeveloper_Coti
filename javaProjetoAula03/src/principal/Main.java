package principal;

import java.util.Scanner;
import controllers.ProdutoController;

public class Main {
	public static void main(String[] args) {

		ProdutoController produtoController = new ProdutoController();
		Scanner scanner = new Scanner(System.in);

		System.out.println("(1) CADASTRAR PRODUTO");
		System.out.println("(2) ATUALIZAR PRODUTO");
		System.out.println("(3) EXCLUIR PRODUTO");
		System.out.println("(4) CONSULTAR PRODUTOS");

		System.out.print("\nESCOLHA UMA OPÇÃO: ");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		switch (opcao) {
		case 1:
			produtoController.cadastrarProduto();
			break;
		case 2:
			produtoController.atualizarProduto();
			break;
		case 3:
			produtoController.excluirProduto();
			break;
		case 4:
			produtoController.consultarProduto();
			break;
		default:
			System.out.println("\nOPÇÃO INVALIDA!");
		}

		scanner.close();
	}
}
