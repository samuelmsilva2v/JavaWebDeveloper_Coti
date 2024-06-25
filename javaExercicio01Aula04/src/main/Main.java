package main;

import javax.swing.JOptionPane;

import controllers.FuncionarioController;
import repositories.FuncionarioRepositoryCsv;
import repositories.FuncionarioRepositoryTXT;

public class Main {

	public static void main(String[] args) {

		try {

			FuncionarioController funcionarioController = new FuncionarioController();

			String opcao = JOptionPane.showInputDialog("Informe TXT ou CSV:");

			if (opcao.equalsIgnoreCase("TXT")) {
				
				funcionarioController.cadastrarFuncionario(new FuncionarioRepositoryTXT());
				System.out.println("Dados exportados para TXT!");
				
			} else if (opcao.equalsIgnoreCase("CSV")) {
				
				funcionarioController.cadastrarFuncionario(new FuncionarioRepositoryCsv());
				System.out.println("Dados exportados para CSV!");
				
			}
			
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

}
