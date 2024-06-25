package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import interfaces.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario(FuncionarioRepository funcionarioRepository) throws Exception {

		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		funcionario.setSetor(new Setor());
		funcionario.setFuncao(new Funcao());

		funcionario.setId(UUID.randomUUID());
		funcionario.getSetor().setId(UUID.randomUUID());
		funcionario.getFuncao().setId(UUID.randomUUID());

		System.out.println("--- CADASTRO DE FUNCIONÁRIO ---\n");

		System.out.print("Nome do funcionário...: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("CPF...................: ");
		funcionario.setCpf(scanner.nextLine());

		System.out.print("Matrícula.............: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("Salário...............: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

		System.out.print("Setor.................: ");
		funcionario.getSetor().setDescricao(scanner.nextLine());

		System.out.print("Funcão................: ");
		funcionario.getFuncao().setNome(scanner.nextLine());

		System.out.println("\nDados cadastrados com sucesso!");

		funcionarioRepository.exportarDados(funcionario);

		scanner.close();

	}
}
