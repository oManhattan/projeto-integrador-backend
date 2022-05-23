package com.example.pdvsystem.businessLogic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRINHO_VENDA")
public class CarrinhoVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DATA_LANCAMENTO")
	private Date dataLancamento;
	
	@ManyToOne(targetEntity = Venda.class)
//	@JoinColumn(name = "ID_VENDA")
	private Venda idVenda;
	
	@ManyToOne(targetEntity = Produto.class)
//	@JoinColumn(name = "ID_PRODUTO")
	private Produto idProduto;
	
	@Column(name = "QUANTIDADE_VENDIDA")
	private Integer quantidadeVendida;

	public Venda getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Venda idVenda) {
		this.idVenda = idVenda;
	}

	public Produto getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(Integer quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
}
