package interfaces;

import entities.Pedido;

/*
 * Interface para repositório de pedidos
 */
public interface PedidoRepository {

	/*
	 * Método abstrato para realizar cadastro de pedido
	 */
	void cadastrar(Pedido pedido) throws Exception;
}
