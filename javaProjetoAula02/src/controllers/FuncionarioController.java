package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.UUID;

import entities.Endereco;
import entities.Funcionario;
import repositories.FuncionarioRepository;

/*
 * Classe de controle para realização
 * dos fluxos de funcionário (cadastro, consulta etc...) 
 */

public class FuncionarioController {

	/*
	 * Método / função para executar o cadastro de um funcionário
	 */
	public void cadastrarFuncionario() {

		Scanner scanner = new Scanner(System.in);

		try {

			Funcionario funcionario = new Funcionario();
			funcionario.setEndereco(new Endereco());

			// gerando o id do funcionário
			funcionario.setId(UUID.randomUUID());
			// gerando o id do endereço contido no funcionário
			funcionario.getEndereco().setId(UUID.randomUUID());

			// preenchimento dos campos do funcionário
			System.out.print("NOME DO FUNCIONÁRIO: ");
			funcionario.setNome(scanner.nextLine());

			System.out.print("CPF: ");
			funcionario.setCpf(scanner.nextLine());

			System.out.print("MATRÍCULA: ");
			funcionario.setMatricula(scanner.nextLine());

			System.out.print("DATA DE ADMISSÃO (dd/MM/yyyy): ");
			funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine()));

			// preenchimento dos campos do endereço
			System.out.print("LOGRADOURO: ");
			funcionario.getEndereco().setLogradouro(scanner.nextLine());

			System.out.print("COMPLEMENTO: ");
			funcionario.getEndereco().setComplemento(scanner.nextLine());

			System.out.print("BAIRRO: ");
			funcionario.getEndereco().setBairro(scanner.nextLine());

			System.out.print("CIDADE: ");
			funcionario.getEndereco().setCidade(scanner.nextLine());

			System.out.print("ESTADO: ");
			funcionario.getEndereco().setEstado(scanner.nextLine());

			System.out.print("CEP: ");
			funcionario.getEndereco().setCep(scanner.nextLine());

			//criando um objeto da classe de repositório
			
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO!");
		} catch (Exception e) {

			// imprimindo mensagem de erro simples
			System.out.println("\nERRO: " + e.getMessage());
		} finally {
			System.out.println("\nFIM DO PROGRAMA!");
			scanner.close();
		}
	}
}
