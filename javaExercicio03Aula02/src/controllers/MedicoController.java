package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Medico;
import repositories.MedicoRepository;

public class MedicoController {

	public Medico cadastrarMedico() throws Exception {

		Scanner scanner = new Scanner(System.in);
		Medico medico = new Medico();

		System.out.println("*** CADASTRO DE MÉDICO ***");

		medico.setId(UUID.randomUUID());

		System.out.print("\nNome do médico: ");
		medico.setNome(scanner.nextLine());

		System.out.print("Especialidade: ");
		medico.setEspecialidade(scanner.nextLine());

		System.out.print("CRM: ");
		medico.setCrm(scanner.nextLine());

		MedicoRepository medicoRepository = new MedicoRepository();
		medicoRepository.exportarDados(medico);

		System.out.println("\nDados gravados com sucesso!\n");

		return medico;
	}
}
