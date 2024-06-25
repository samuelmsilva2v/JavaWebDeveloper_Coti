package entities;

import java.util.UUID;

public class Professor extends Aluno {

	public Professor(UUID id, String nome, String email) {
		super(id, nome, email);
		// TODO Auto-generated constructor stub
	}

	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
