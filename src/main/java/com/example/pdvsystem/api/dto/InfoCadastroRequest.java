package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idInfoCadastro", "logradouro", "numero", "complemento", "bairro", "cidade", "cep"})
public class InfoCadastroRequest {

	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("id_info_cadastro")
	private Integer idInfoCadastro;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("logradouro")
	private String logradouro;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("numero")
	private String numero;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("complemento")
	private String complemento;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("cep")
	private String cep;

	public Integer getIdInfoCadastro() {
		return idInfoCadastro;
	}

	public void setIdInfoCadastro(Integer idInfoCadastro) {
		this.idInfoCadastro = idInfoCadastro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
