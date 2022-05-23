package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idServico", "empresa", "nome", "preco"})
public class ServicoRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_servico")
	private Integer idServico;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_empresa")
	private EmpresaRequest empresa;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("nome")
	private String nome;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("preco")
	private Double preco;

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
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
}
