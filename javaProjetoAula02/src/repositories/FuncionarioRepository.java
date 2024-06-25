package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

/*
 * Classe de repositório de dados para gravação
 * em arquivos das informações do funcionário.
 */

public class FuncionarioRepository {

	/*
	 * Método para gravva os dados do funcionário
	 * em um arquivo TXT
	 */
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		//abrindo um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter("funcionario_"+ funcionario.getId() +".txt");
		
		//escrever os dados dentro do arquivo
		printWriter.write("\n"+ funcionario.getId());
		printWriter.write("\n"+ funcionario.getNome());
		printWriter.write("\n"+ funcionario.getCpf());
		printWriter.write("\n"+ funcionario.getMatricula());
		printWriter.write("\n"+ funcionario.getDataAdmissao());
		printWriter.write("\n"+ funcionario.getEndereco().getId());
		printWriter.write("\n"+ funcionario.getEndereco().getLogradouro());
		printWriter.write("\n"+ funcionario.getEndereco().getComplemento());
		printWriter.write("\n"+ funcionario.getEndereco().getBairro());
		printWriter.write("\n"+ funcionario.getEndereco().getCidade());
		printWriter.write("\n"+ funcionario.getEndereco().getEstado());
		printWriter.write("\n"+ funcionario.getEndereco().getCep());
		
		//fechando arquivo
		printWriter.close();
	}
	
}
