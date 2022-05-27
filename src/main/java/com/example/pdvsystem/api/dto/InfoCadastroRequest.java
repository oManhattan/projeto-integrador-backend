package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idInfoCadastro", "idUsuario", "idCliente", "logradouro", "numero", "complemento", "bairro", "cidade", "cep"})
public class InfoCadastroRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_info_cadastro")
	private Integer idInfoCadastro;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_usuario")
	private Integer idUsuario;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_cliente")
	private Integer idCliente;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("logradouro")
	private String logradouro;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("numero")
	private String numero;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("complemento")
	private String complemento;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("cep")
	private String cep;

	public Integer getIdInfoCadastro() {
		return idInfoCadastro;
	}

	public void setIdInfoCadastro(Integer idInfoCadastro) {
		this.idInfoCadastro = idInfoCadastro;
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
