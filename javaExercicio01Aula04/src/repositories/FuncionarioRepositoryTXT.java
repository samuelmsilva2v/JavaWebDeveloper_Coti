package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryTXT implements FuncionarioRepository {

	@Override
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("funcionario_"+ funcionario.getId() +".txt");
		
		printWriter.write("\nFUNCIONÁRIO ID: "+ funcionario.getId());
		printWriter.write("\nNOME: "+ funcionario.getNome());
		printWriter.write("\nCPF: "+ funcionario.getCpf());
		printWriter.write("\nMATRÍCULA: "+ funcionario.getMatricula());
		printWriter.write("\nSALÁRIO: "+ funcionario.getSalario());
		printWriter.write("\nSETOR: "+ funcionario.getSetor());
		printWriter.write("\nFUNÇÃO: "+ funcionario.getFuncao());
		
		printWriter.close();
	}

	
}
