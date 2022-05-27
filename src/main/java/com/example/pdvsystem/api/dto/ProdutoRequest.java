package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idProduto", "empresa", "nome", "preco", "quantidade"})
public class ProdutoRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_produto")
	private Integer idProduto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_empresa")
	private EmpresaRequest empresa;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("nome")
	private String nome;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("preco")
	private Double preco;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("quantidade")
	private Integer quantidade;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	
	public EmpresaRequest getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaRequest empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
