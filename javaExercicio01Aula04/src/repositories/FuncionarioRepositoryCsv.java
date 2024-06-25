package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryCsv implements FuncionarioRepository {

	@Override
	public void exportarDados(Funcionario funcionario) throws Exception {

		PrintWriter printWriter = new PrintWriter("funcionario_" + funcionario.getId() + ".csv");

		printWriter.write("ID,Nome,Cpf,Matricula,Salario,Setor,Funcao");
		printWriter.write("\n" + funcionario.getId() + ",");
		printWriter.write(funcionario.getNome() + ",");
		printWriter.write(funcionario.getMatricula() + ",");
		printWriter.write(funcionario.getCpf() + ",");
		printWriter.write(funcionario.getSalario() + ",");
		printWriter.write(funcionario.getSetor() + ",");
		printWriter.write(funcionario.getFuncao() +" ");

		printWriter.close();
	}

}
