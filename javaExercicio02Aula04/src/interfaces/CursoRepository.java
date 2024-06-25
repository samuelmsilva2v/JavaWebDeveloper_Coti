package interfaces;

import entities.Curso;

public interface CursoRepository {

	void exportarDados(Curso curso) throws Exception;
}
