package controllers;

import java.util.Scanner;

import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

	// atributos
	private ProdutoRepository produtoRepository = new ProdutoRepository();
	private Scanner scanner = new Scanner(System.in);

	/*
	 * Método para realizar o passo a passo para cadastro de um produto.
	 */
	public void cadastrarProduto() {
		try {

			Produto produto = new Produto();

			System.out.println("\nCADASTRO DE PRODUTO:\n");
			System.out.print("Nome do produto: ");
			produto.setName(scanner.nextLine());

			System.out.print("Preço: ");
			produto.setPreco(Double.parseDouble(scanner.nextLine()));

			System.out.print("Quantidade: ");
			produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

			produtoRepository.inserir(produto);
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

	/*
	 * Método para realizar o passo a passo para atualização de um produto
	 */
	public void atualizarProduto() {
		try {

			Produto produto = new Produto();

			System.out.println("\nATUALIZAÇÃO DE PRODUTO:\n");
			System.out.print("ID do produto: ");
			produto.setId(Integer.parseInt(scanner.nextLine()));

			System.out.print("Nome do produto: ");
			produto.setName(scanner.nextLine());

			System.out.print("Preço: ");
			produto.setPreco(Double.parseDouble(scanner.nextLine()));

			System.out.print("Quantidade: ");
			produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

			produtoRepository.atualizar(produto);
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

	/*
	 * Método para realizar o passo a passo para exclusão de um produto
	 */
	public void excluirProduto() {
		try {

			System.out.println("\nEXCLUSÃO DE PRODUTO:\n");

			System.out.print("ID do produto: ");
			Integer id = Integer.parseInt(scanner.nextLine());

			produtoRepository.excluir(id);
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

	/*
	 * Método para realizar o passo a passo para consulta de produtos
	 */
	public void consultarProduto() {
		try {

			System.out.println("\nCONSULTA DE PRODUTOS:\n");

			produtoRepository.consultar();
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
}
