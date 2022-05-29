package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idEmpresa", "nomeEmpresa", "documento"})
public class EmpresaRequest {

	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("id_empresa")
	private Integer idEmpresa;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("nome_empresa")
	private String nomeEmpresa;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("documento")
	private String documento;

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
