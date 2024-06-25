package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.UUID;

import entities.Curso;
import entities.Professor;
import entities.Turma;
import repositories.CursoRepository;

public class CursoController {

	public void cadastrarCurso() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		Curso curso = new Curso();
		curso.setTurma(new Turma());
		curso.getTurma().setProfessor(new Professor());
		
		/*
		 * Criação das IDs do curso, da turma e do professor	
		 */
		curso.setId(UUID.randomUUID());
		curso.getTurma().setId(UUID.randomUUID());
		curso.getTurma().getProfessor().setId(UUID.randomUUID());
		
		/*
		 * Cadastro do curso
		 */
		System.out.println("*** CADASTRO DE CURSO ***");
		
		System.out.print("Título do curso: ");
		curso.setTitulo(scanner.nextLine());
		
		System.out.print("Carga horária: ");
		curso.setCargaHoraria(Integer.parseInt(scanner.nextLine()));
		
		/*
		 * Cadastro da turma
		 */
		System.out.println("\n*** CADASTRO DE TURMA ***");
		
		System.out.print("Nome da turma: ");
		curso.getTurma().setNome(scanner.nextLine());
		
		System.out.print("Data de início (dd/MM/yyyy): ");
		curso.getTurma().setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine()));
		
		/*
		 * Cadastro do professor
		 */
		System.out.println("\n*** CADASTRO DE PROFESSOR ***");
		
		System.out.print("Nome do professor: ");
		curso.getTurma().getProfessor().setNome(scanner.nextLine());
		
		System.out.print("Telefone :");
		curso.getTurma().getProfessor().setTelefone(scanner.nextLine());
		
		System.out.print("E-mail: ");
		curso.getTurma().getProfessor().setEmail(scanner.nextLine());
		
		/*
		 * Instanciando o repositório e exportando os dados
		 */
		CursoRepository cursoRepository = new CursoRepository();
		cursoRepository.exportarDados(curso);
		
		System.out.println("Dados gravados com sucesso!");
		
		scanner.close();
	}
}
