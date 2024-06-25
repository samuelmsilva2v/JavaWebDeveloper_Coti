package repositories;

import java.io.PrintWriter;

import entities.Medico;

public class MedicoRepository {

	public void exportarDados(Medico medico) throws Exception {

		PrintWriter printWriter = new PrintWriter("medico_" + medico.getId() + ".txt");

		printWriter.write("ID: " + medico.getId());
		printWriter.write("\nNome: " + medico.getNome());
		printWriter.write("\nEspecialidade: " + medico.getEspecialidade());
		printWriter.write("\nCRM: " + medico.getEspecialidade());

		printWriter.close();

	}
}
