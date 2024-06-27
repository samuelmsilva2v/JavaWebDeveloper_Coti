package principal;

import controllers.UsuarioController;

public class Main {

	public static void main(String[] args) {

		UsuarioController usuarioController = new UsuarioController();
		usuarioController.cadastrarUsuario();

	}

}
