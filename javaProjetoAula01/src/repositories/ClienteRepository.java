package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Cliente;

/*
 * Classe para exportar os dados do cliente
 * para um arquivo de extensão TXT
 */
public class ClienteRepository {

	/*
	 * Método para realziar a exportação dos dados
	 */
	public void exportarDados(Cliente cliente) {

		try {
			// Definindo o nome do arquivo que será criado
			FileWriter fileWriter = new FileWriter("clientes.txt", true);

			// Abrindo e acessando o arquivo
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// escrevendo dentro do arquivo
			printWriter.write("\nID.........: " + cliente.getId());
			printWriter.write("\nNOME.......: " + cliente.getNome());
			printWriter.write("\nEMAIL......: " + cliente.getEmail());
			printWriter.write("\nCPF........: " + cliente.getCpf());
			printWriter.write("\nDATA/HORA..: " + cliente.getDataHoraCadastro());
			printWriter.write("\n...");
			
			//fechando o arquivo
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!");

		} catch (Exception e) {
			System.out.println("\nFalha ao gravar o arquivo!");
		}
	}
}
