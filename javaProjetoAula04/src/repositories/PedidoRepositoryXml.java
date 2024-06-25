package repositories;

import java.io.PrintWriter;

import entities.Pedido;
import interfaces.PedidoRepository;

/*
 * Repositório para manipular dados de pedidos em arquivos XML
 */
public class PedidoRepositoryXml implements PedidoRepository {

	@Override
	public void cadastrar(Pedido pedido) throws Exception {

		// criando o arquivo XML
		PrintWriter printWriter = new PrintWriter("pedido_" + pedido.getId() + ".xml");

		// escrevendo o conteúdo do arquivo XML
		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
		printWriter.write("<pedido>");
			printWriter.write("<id>" + pedido.getId() + "</id>");
			printWriter.write("<dataHora>" + pedido.getDataHoraPedido() + "</dataHora>");
			printWriter.write("<valor>" + pedido.getValor() + "</valor>");
			printWriter.write("<descricao>" + pedido.getDescricao() + "</descricao>");
			printWriter.write("<status>" + pedido.getStatusPedido() + "</status>");
		printWriter.write("</pedido>");
		
		//fechando o arquivo
		printWriter.close();
	}

}
