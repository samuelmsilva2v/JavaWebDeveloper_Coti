package controllers;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import entities.Pedido;
import enums.StatusPedido;
import interfaces.PedidoRepository;

/*
 * Classe de controle para executar o cadastro de um pedido
 */
public class PedidoController {

	/*
	 * Método para executar o fluxo de cadastro
	 */
	public void realizarPedido(PedidoRepository pedidoRepository) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nCADASTRO DE PEDIDO:\n");

		Pedido pedido = new Pedido(); // instanciando a classe Pedido
		pedido.setId(UUID.randomUUID()); // gerando id do pedido
		pedido.setDataHoraPedido(new Date()); // gerando a data e a hora do pedido
		
		System.out.print("VALOR DO PEDIDO.......: ");
		pedido.setValor(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("DESCRIÇÃO DO PEDIDO...: ");
		pedido.setDescricao(scanner.nextLine());
		
		System.out.println("\nSTATUS DO PEDIDO..:\n");
		System.out.println("[1] PENDENTE");
		System.out.println("[2] PROCESSANDO");
		System.out.println("[3] ENVIADO");
		System.out.println("[4] ENTREGUE");
		System.out.println("[5] CANCELADO\n");
		
		System.out.print("INFORME O STATUS..: ");
		Integer opcao = Integer.parseInt(scanner.nextLine());
		
		switch(opcao) {
		case 1: pedido.setStatusPedido(StatusPedido.PENDENTE); break;
		case 2: pedido.setStatusPedido(StatusPedido.PROCESSANDO); break;
		case 3: pedido.setStatusPedido(StatusPedido.ENVIADO); break;
		case 4: pedido.setStatusPedido(StatusPedido.ENTREGUE); break;
		case 5: pedido.setStatusPedido(StatusPedido.CANCELADO); break;
		default: pedido.setStatusPedido(StatusPedido.PENDENTE); break;
		}
		
		pedidoRepository.cadastrar(pedido);
		

		scanner.close();

	}
}
