package principal;

import java.util.Date;
import java.util.UUID;

import entities.Cliente;
import repositories.ClienteRepository;

/*
 * Classe principal do projeto
 * utilizada para executar a aplicação 
 */
public class Main {

	/*
	 * Método/função para executar a classe Main
	 */
	public static void main(String[] args) {

		System.out.println("*** CADASTRO DE CLIENTES ***");

		Cliente cliente = new Cliente();

		// preenchendo dados do cliente
		cliente.setId(UUID.randomUUID());

		cliente.setNome("Samuel Maciel");

		cliente.setEmail("samuelmsilva@outlook.com.br");

		cliente.setCpf("190-617-417.26");

		cliente.setDataHoraCadastro(new Date());

		// imprimindo os dados do cliente
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("ID.............: " + cliente.getId());
		System.out.println("NOME...........: " + cliente.getNome());
		System.out.println("EMAIL..........: " + cliente.getEmail());
		System.out.println("CPF............: " + cliente.getCpf());
		System.out.println("CADASTRADO EM..: " + cliente.getDataHoraCadastro());
		
		// criando um objeto (variável de instância) para a classe ClienteRepository
		ClienteRepository clienteRepository = new ClienteRepository();
		
		//exportando os dados do cliente para arquivo
		clienteRepository.exportarDados(cliente);

	}

}
