package controllers;

import java.text.SimpleDateFormat;
import java.util.UUID;

import entities.Aluno;
import entities.Curso;
import entities.Professor;
import entities.Turma;
import interfaces.CursoRepository;

public class CursoController {

	public void cadastrarCurso(CursoRepository cursoRepository) throws Exception {

		Curso curso = new Curso();

		// curso
		curso.setId(UUID.randomUUID());
		curso.setTitulo("C# WebDeveloper");
		curso.setCargaHoraria(96);

		// turma
		curso.setTurma(new Turma());
		curso.getTurma().setId(UUID.randomUUID());
		curso.getTurma().setNome("Treinamento em C# WebDeveloper");
		curso.getTurma().setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse("20/06/2024"));

		// professor
		curso.getTurma().setProfessor(new Professor(UUID.randomUUID(), "Sergio Mendes", "(21) 96957-5900"));
		curso.getTurma().getProfessor().setEmail("sergio.coti@gmail.com");

		// alunos
		curso.getTurma().setAluno(new Aluno(UUID.randomUUID(), "Maria", "maria@example.com"));
		
		curso.getTurma().setAluno(new Aluno(UUID.randomUUID(), "João", "joao@example.com"));
		
		curso.getTurma().setAluno(new Aluno(UUID.randomUUID(), "Carlos", "carlos@example.com"));

		System.out.println("Dados cadastrados com sucesso!");
		
		cursoRepository.exportarDados(curso);
		System.out.println("Dados exportados com sucesso!");
		

	}
}
