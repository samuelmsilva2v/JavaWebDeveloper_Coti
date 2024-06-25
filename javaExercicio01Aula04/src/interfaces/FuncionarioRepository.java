package interfaces;

import entities.Funcionario;

public interface FuncionarioRepository {

	void exportarDados(Funcionario funcionario) throws Exception;
}
