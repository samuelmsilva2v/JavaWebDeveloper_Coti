package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Paciente;
import repositories.PacienteRepository;

public class PacienteController {

	public Paciente cadastrarPaciente() throws Exception {

		Scanner scanner = new Scanner(System.in);
		Paciente paciente = new Paciente();

		System.out.println("*** CADASTRO DE PACIENTE ***");

		paciente.setId(UUID.randomUUID());

		System.out.print("Nome do paciente: ");
		paciente.setNome(scanner.nextLine());

		System.out.print("Idade: ");
		paciente.setIdade(Integer.parseInt(scanner.nextLine()));

		System.out.print("Sexo: ");
		String input = scanner.nextLine();
		char sexo = input.charAt(0);
		paciente.setSexo(sexo);

		System.out.print("Endereço: ");
		paciente.setEndereco(scanner.nextLine());

		PacienteRepository pacienteRepository = new PacienteRepository();
		pacienteRepository.exportarDados(paciente);

		System.out.println("\nDados gravados com sucesso!\n");
		
		return paciente;
	}
}
