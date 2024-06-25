package repositories;

import java.io.PrintWriter;

import entities.Curso;
import interfaces.CursoRepository;

public class CursoRepositoryXml implements CursoRepository {

	@Override
	public void exportarDados(Curso curso) throws Exception {

		PrintWriter printWriter = new PrintWriter("curso.xml");

		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
		printWriter.write("<Turma>");
			printWriter.write("<IdTurma>" + curso.getTurma().getId() + "</IdTurma>");
			printWriter.write("<Nome>" + curso.getTurma().getNome() + "</Nome>");
			
			printWriter.write("<Professor>");
				printWriter.write("<IdProfessor>" + curso.getTurma().getProfessor().getId() + "</IdProfessor>");
				printWriter.write("<Nome>" + curso.getTurma().getProfessor().getNome() + "</Nome>");
				printWriter.write("<Telefone>" + curso.getTurma().getProfessor().getTelefone() + "</Telefone>");
				printWriter.write("<Email>" + curso.getTurma().getProfessor().getEmail() + "</Email>");
			printWriter.write("</Professor>");
			
			printWriter.write("<Curso>");
				printWriter.write("<IdCurso>" + curso.getId() + "</IdCurso>");
				printWriter.write("<Titulo>" + curso.getTitulo() + "</Titulo>");
				printWriter.write("<CargaHoraria>" + curso.getCargaHoraria() + "</CargaHoraria>");
			printWriter.write("</Curso>");
			
			printWriter.write("<Alunos>");
				printWriter.write("<Aluno>");
					printWriter.write("<IdAluno>" + curso.getTurma().getAluno().getId() + "</IdAluno>");
					printWriter.write("<Nome>" + curso.getTurma().getAluno().getNome() + "</Nome>");
					printWriter.write("<Email>" + curso.getTurma().getAluno().getEmail() + "</Email>");
				printWriter.write("</Aluno>");
				
				printWriter.write("<Aluno>");
					printWriter.write("<IdAluno>" + curso.getTurma().getAluno().getId() + "</IdAluno>");
					printWriter.write("<Nome>" + curso.getTurma().getAluno().getNome() + "</Nome>");
					printWriter.write("<Email>" + curso.getTurma().getAluno().getEmail() + "</Email>");
				printWriter.write("</Aluno>");
				
				printWriter.write("<Aluno>");
					printWriter.write("<IdAluno>" + curso.getTurma().getAluno().getId() + "</IdAluno>");
					printWriter.write("<Nome>" + curso.getTurma().getAluno().getNome() + "</Nome>");
					printWriter.write("<Email>" + curso.getTurma().getAluno().getEmail() + "</Email>");
				printWriter.write("</Aluno>");
			printWriter.write("</Alunos>");
			
			
		printWriter.write("</Turma>");
		
		printWriter.close();

		printWriter.close();

	}

}
