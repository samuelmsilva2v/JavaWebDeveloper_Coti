package repositories;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import entities.Exame;

public class ExameRepository {

	public void exportarDados(Exame exame) throws Exception {

		PrintWriter printWriter = new PrintWriter("exame_" + exame.getId() + ".txt");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		printWriter.write("ID: " + exame.getId());
		printWriter.write("\nTipo: " + exame.getTipo());

		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		String dataFormatada = simpleDateFormat.format(exame.getData());
		printWriter.write("\nData: " + dataFormatada);

		printWriter.write("\nResultado: " + exame.getResultado());
		printWriter.write("\nMédico: " + exame.getMedico().getNome());
		printWriter.write("\nPaciente: " + exame.getPaciente().getNome());

		printWriter.close();

	}
}
