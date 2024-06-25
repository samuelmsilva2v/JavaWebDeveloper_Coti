package main;

import controllers.CursoController;

public class Main {

	public static void main(String[] args) {
		
		try {
			CursoController cursoController = new CursoController();
			cursoController.cadastrarCurso();
		}
		catch(Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
