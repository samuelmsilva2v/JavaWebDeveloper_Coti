package controllers;

import java.util.Scanner;

import entities.Perfil;
import entities.Usuario;
import repositories.PerfilRepository;
import repositories.UsuarioRepository;

public class UsuarioController {

	/*
	 * Método para executar passo a passo de criação de um usuário no sistemas
	 */
	public void cadastrarUsuario() {

		Scanner scanner = new Scanner(System.in);

		try {

			Usuario usuario = new Usuario();
			usuario.setPerfil(new Perfil());

			System.out.println("\nCADASTRO DE USUÁRIOS:\n");

			System.out.print("INFORME O SEU NOME...: ");
			usuario.setNome(scanner.nextLine());

			System.out.print("INFORME O SEU E-MAIL.: ");
			usuario.setEmail(scanner.nextLine());

			System.out.print("INFORME SUA SENHA....: ");
			usuario.setSenha(scanner.nextLine());

			PerfilRepository perfilRepository = new PerfilRepository();
			
			// exibir os perfis cadastrados no banco de dados
			for (Perfil perfil : perfilRepository.findAll()) { // foreach
				System.out.println("\n" + perfil.getId() + " - " + perfil.getNome());
			}

			System.out.print("\nINFORME O PERFIL.....: ");
			usuario.getPerfil().setId(Integer.parseInt(scanner.nextLine()));
			
			// gravar usuario no banco de dados
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			usuarioRepository.insert(usuario);
			
			System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!"); 
			
		} 
		catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR USUÁRIO: ");
			System.out.println(e.getMessage());
		} 
		finally {
			scanner.close();
		}
	}
}
