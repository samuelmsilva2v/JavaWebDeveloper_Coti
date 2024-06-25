package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Categoria;
import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

	public void cadastrarProduto() throws Exception{

		Scanner scanner = new Scanner(System.in);
		Produto produto = new Produto();
		produto.setCategoria(new Categoria());

		System.out.println("*** CADASTRO DE PRODUTO ***");

		produto.setId(UUID.randomUUID());
		produto.getCategoria().setId(UUID.randomUUID());

		System.out.print("NOME......: ");
		produto.setNome(scanner.nextLine());

		System.out.print("DESCRICAO.: ");
		produto.setDescricao(scanner.nextLine());

		System.out.print("PRECO.....: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));

		System.out.print("QUANTIDADE: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

		System.out.print("CODIGO....: ");
		produto.getCategoria().setCodigo(scanner.nextLine());

		System.out.print("DESCRICAO.: ");
		produto.getCategoria().setDescricao(scanner.nextLine());
	
		ProdutoRepository produtoRepository = new ProdutoRepository();
		produtoRepository.exportarDados(produto);
		
		System.out.println("Dados gravados com sucesso!");
		
		scanner.close();

	}
}
