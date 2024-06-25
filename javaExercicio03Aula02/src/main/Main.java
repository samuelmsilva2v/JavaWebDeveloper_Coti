package main;

import controllers.ExameController;
import controllers.MedicoController;
import controllers.PacienteController;
import entities.Medico;
import entities.Paciente;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			MedicoController medicoController = new MedicoController();
			Medico medico = medicoController.cadastrarMedico();
			
			PacienteController pacienteController = new PacienteController();
			Paciente paciente = pacienteController.cadastrarPaciente();
			
			ExameController exameController = new ExameController();
			exameController.cadastrarExame(medico, paciente);
			
		}
		catch(Exception e){
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
