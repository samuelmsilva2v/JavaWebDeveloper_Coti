package entities;

import java.util.Date;
import java.util.UUID;

import enums.StatusPedido;

public class Pedido {

	private UUID id;
	private Date dataHoraPedido;
	private Double valor;
	private String descricao;
	private StatusPedido statusPedido;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getDataHoraPedido() {
		return dataHoraPedido;
	}

	public void setDataHoraPedido(Date dataHoraPedido) {
		this.dataHoraPedido = dataHoraPedido;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

}
