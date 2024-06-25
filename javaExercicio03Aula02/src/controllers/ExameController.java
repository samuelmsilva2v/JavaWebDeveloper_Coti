package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.UUID;

import entities.Exame;
import entities.Medico;
import entities.Paciente;
import repositories.ExameRepository;

public class ExameController {

	public void cadastrarExame(Medico medico, Paciente paciente) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		Exame exame = new Exame();
		exame.setMedico(medico);
		exame.setPaciente(paciente);
		
		System.out.println("*** CADASTRO DE EXAME ***");
		
		exame.setId(UUID.randomUUID());
		
		System.out.print("\nTipo do exame: ");
		exame.setTipo(scanner.nextLine());
		
		System.out.print("Data em que foi realizado (dd/MM/yyyy): ");
		exame.setData(new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine()));
		
		System.out.print("Resultado: ");
		exame.setResultado(scanner.nextLine());
		
		ExameRepository exameRepository = new ExameRepository();
		exameRepository.exportarDados(exame);
		
		System.out.println("\nDados gravados com sucesso!\n");
		
		scanner.close();
	}

}
