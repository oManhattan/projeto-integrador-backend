package com.example.pdvsystem.api.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idOrdemServico", "idEmpresa", "idUsuario", "idCliente", "listaServico", "descricao", "precoTotal"})
public class OrdemServicoRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_ordem_servico")
	private Integer idOrdemServico;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_empresa")
	private Integer idEmpresa;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_usuario")
	private Integer idUsuario;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_cliente")
	private Integer idCliente;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("lista_servicos")
	private List<Integer> listaServico;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("descricao")
	private String descricao;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("preco_total")
	private String precoTotal;

	public Integer getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(Integer idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public List<Integer> getListaServico() {
		return listaServico;
	}

	public void setListaServico(List<Integer> listaServico) {
		this.listaServico = listaServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(String precoTotal) {
		this.precoTotal = precoTotal;
	}


}
