package repositories;

import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import entities.Pedido;
import interfaces.PedidoRepository;

/*
 * Repositório para manipular dados de pedidos em arquivos JSON
 */
public class PedidoRepositoryJson implements PedidoRepository {

	@Override
	public void cadastrar(Pedido pedido) throws Exception {

		// criando um arquivo no formato JSON
		PrintWriter printWriter = new PrintWriter("pedido_" + pedido.getId() + ".json");

		// montar os dados do pedido em formato JSON
		HashMap<String, Object> mapa = new HashMap<>();

		mapa.put("id", pedido.getId());
		mapa.put("dataHora", pedido.getDataHoraPedido());
		mapa.put("valor", pedido.getValor());
		mapa.put("descricao", pedido.getDescricao());
		mapa.put("status", pedido.getStatusPedido());

		// escrevendo o conteúdo JSON no arquivo
		JSONObject json = new JSONObject(mapa);
		printWriter.write(json.toJSONString());

		// fechando o arquivo
		printWriter.close();

	}

}
