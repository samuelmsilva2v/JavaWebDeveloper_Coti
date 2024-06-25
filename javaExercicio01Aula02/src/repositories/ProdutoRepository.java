package repositories;

import java.io.PrintWriter;

import entities.Produto;

public class ProdutoRepository {

	public void exportarDados(Produto produto) throws Exception {

		PrintWriter printWriter = new PrintWriter("produto" + produto.getId() + ".txt");

		printWriter.write("DADOS DO PRODUTO:");
		printWriter.write("\nID........: " + produto.getId());
		printWriter.write("\nNOME......: " + produto.getNome());
		printWriter.write("\nDESCRIÇÃO.: " + produto.getDescricao());
		printWriter.write("\nPREÇO.....: " + produto.getPreco());
		printWriter.write("\nQUANTIDADE: " + produto.getQuantidade());
		printWriter.write("\nCÓDIGO....: " + produto.getCategoria().getCodigo());
		printWriter.write("\nDESCRIÇÃO.: " + produto.getCategoria().getDescricao());
		printWriter.write("\n...");

		printWriter.close();

	}
}
