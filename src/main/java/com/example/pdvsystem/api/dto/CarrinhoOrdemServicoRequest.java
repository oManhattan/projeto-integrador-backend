package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ordemServico", "servico"})
public class CarrinhoOrdemServicoRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_ordem_servico")
	private OrdemServicoRequest ordemServico;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_servico")
	private ServicoRequest servico;

	public OrdemServicoRequest getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServicoRequest ordemServico) {
		this.ordemServico = ordemServico;
	}

	public ServicoRequest getServico() {
		return servico;
	}

	public void setServico(ServicoRequest servico) {
		this.servico = servico;
	}
}
