package controllers;

import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;

public class AlunoController {
	
	Scanner scanner = new Scanner(System.in);
	AlunoRepository alunoRepository = new AlunoRepository();

	public void cadastrarAluno() throws Exception {
		
		Aluno aluno = new Aluno();
		
		System.out.print("\n--- CADASTRO DE ALUNO ---\n");
		
		System.out.print("Nome do aluno: ");
		aluno.setNome(scanner.nextLine());
		
		System.out.print("Matrícula: ");
		aluno.setMatricula(scanner.nextLine());
		
		System.out.print("CPF: ");
		aluno.setCpf(scanner.nextLine());
	
		alunoRepository.inserir(aluno);

	}
	
	public void atualizarAluno() throws Exception {
		
		Aluno aluno = new Aluno();
		
		System.out.print("\n--- ATUALIZAÇÃO DE ALUNO ---\n");
		
		System.out.print("\nID do aluno: ");
		aluno.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Nome: ");
		aluno.setNome(scanner.nextLine());
		
		System.out.print("Matrícula: ");
		aluno.setMatricula(scanner.nextLine());
		
		System.out.print("CPF: ");
		aluno.setCpf(scanner.nextLine());
		
		alunoRepository.atualizar(aluno);
	}
	
	public void excluirAluno() throws Exception {
		
		System.out.print("\n--- EXCLUSÃO DE ALUNO ---\n");
		
		System.out.print("\nID do aluno: ");
		Integer id = Integer.parseInt(scanner.nextLine());
		
		alunoRepository.excluir(id);
	}
	
	public void consultar() throws Exception {
		
		System.out.print("\n--- CONSULTA DE ALUNOS ---\n");
		
		alunoRepository.consultar();
	}
}
