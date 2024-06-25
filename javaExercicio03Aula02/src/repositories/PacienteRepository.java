package repositories;

import java.io.PrintWriter;

import entities.Paciente;

public class PacienteRepository {

	public void exportarDados(Paciente paciente) throws Exception {

		PrintWriter printWriter = new PrintWriter("paciente_" + paciente.getId() + ".txt");

		printWriter.write("ID: " + paciente.getId());
		printWriter.write("\nNome: " + paciente.getNome());
		printWriter.write("\nIdade: " + paciente.getIdade());
		printWriter.write("\nSexo: " + paciente.getSexo());
		printWriter.write("\nEndereço: " + paciente.getEndereco());

		printWriter.close();

	}
}
