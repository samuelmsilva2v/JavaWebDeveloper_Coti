package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
		
		//criando um objeto da classe FuncionarioController
		FuncionarioController funcionarioController = new FuncionarioController();
		funcionarioController.cadastrarFuncionario();
	}

}
