package principal;

import javax.swing.JOptionPane;

import controllers.PedidoController;
import repositories.PedidoRepositoryJson;
import repositories.PedidoRepositoryXml;

public class Main {

	public static void main(String[] args) {

		try {

			// instanciando a classe de controle de pedidos
			PedidoController pedidoController = new PedidoController();

			// solicitando ao usuário o tipo de arquivo
			String opcao = JOptionPane.showInputDialog("Informe JSON ou XML: ");

			if (opcao.equalsIgnoreCase("JSON")) {

				//POLIMORFISMO
				pedidoController.realizarPedido(new PedidoRepositoryJson());
				System.out.println("\nARQUIVO JSON GERADO COM SUCESSO!");
				
			} else if (opcao.equalsIgnoreCase("XML")) {
				
				//POLIMORFISMO
				pedidoController.realizarPedido(new PedidoRepositoryXml());
				System.out.println("\nARQUIVO XML GERADO COM SUCESSO!");
				
			}

		} 
		catch (Exception e) {
			System.out.println("\nERRO:" + e.getMessage());
		}

	}

}
