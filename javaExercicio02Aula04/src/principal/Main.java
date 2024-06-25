package principal;

import controllers.CursoController;
import repositories.CursoRepositoryXml;

public class Main {

	public static void main(String[] args) {
		
		CursoController cursoController = new CursoController();
		
		try {
			cursoController.cadastrarCurso(new CursoRepositoryXml());
		}
		catch(Exception e) {
			
		}
	}
}
