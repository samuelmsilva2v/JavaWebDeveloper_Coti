package main;

import java.util.Scanner;

import controllers.AlunoController;

public class Main {

	public static void main(String[] args) throws Exception {

		AlunoController alunoController = new AlunoController();
		Scanner scanner = new Scanner(System.in);

		System.out.println("(1) CADASTRAR ALUNOS");
		System.out.println("(2) ATUALIZAR ALUNOS");
		System.out.println("(3) EXCLUIR ALUNOS");
		System.out.println("(4) CONSULTAR ALUNOS");

		System.out.print("\nESCOLHA UMA OPÇÃO: ");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		switch (opcao) {
		case 1:
			alunoController.cadastrarAluno();
			break;
		case 2:
			alunoController.atualizarAluno();
			break;
		case 3:
			alunoController.excluirAluno();
			break;
		case 4:
			alunoController.consultar();
			break;
		default:
			System.out.println("\nOPÇÃO INVALIDA!");
		}

		scanner.close();
	}

}
