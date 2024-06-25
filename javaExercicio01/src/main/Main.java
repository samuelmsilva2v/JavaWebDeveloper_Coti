package main;

import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("*** CADASTRO DE FUNCIONÁRIO ***");
		
		System.out.print("\nInforme o nome do funcionário: ");
		funcionario.setNome(scanner.nextLine());
		
		System.out.print("\nInforme o CPF do funcionário: ");
		funcionario.setCpf(scanner.nextLine());
		
		System.out.print("\nInforme a matrícula do funcionário: ");
		funcionario.setMatricula(scanner.nextLine());
		
		System.out.print("\nInforme o salário do funcionário: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

		System.out.println(funcionario.toString());
		
		scanner.close();
	}

}
