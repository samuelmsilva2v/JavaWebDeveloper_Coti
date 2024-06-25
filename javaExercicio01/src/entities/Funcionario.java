package entities;

import java.util.UUID;

public class Funcionario {

	private UUID id = UUID.randomUUID();
	private String nome;
	private String cpf;
	private String matricula;
	private Double salario;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nDADOS DO FUNCIONÁRIO:"+
				"\nID...........:"+ id
				+"\nNOME.........: "+ nome
				+"\nCPF..........: "+ cpf
				+"\nMATRICULA....: "+ matricula
				+"\nSALARIO......: "+ salario;
	}
}
