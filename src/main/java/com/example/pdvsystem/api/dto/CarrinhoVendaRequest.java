package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"venda", "produto", "quantidade"})
public class CarrinhoVendaRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_venda")
	private VendaRequest venda;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_produto")
	private ProdutoRequest produto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("quantidade")
	private Integer quantidade;

	public VendaRequest getVenda() {
		return venda;
	}

	public void setVenda(VendaRequest venda) {
		this.venda = venda;
	}

	public ProdutoRequest getProduto() {
		return produto;
	}

	public void setProduto(ProdutoRequest produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
