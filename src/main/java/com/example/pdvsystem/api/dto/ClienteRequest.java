package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idCliente", "empresa", "nome", "email", "documento", "infoCadastro"})
public class ClienteRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_cliente")
	private Integer idCliente;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_empresa")
	private EmpresaRequest empresa;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("nome")
	private String nome;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("email")
	private String email;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("documento")
	private String documento;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_info_cadastro")
	private InfoCadastroRequest infoCadastro;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public EmpresaRequest getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaRequest empresa) {
		this.empresa = empresa;
	}

	public InfoCadastroRequest getInfoCadastro() {
		return infoCadastro;
	}

	public void setInfoCadastro(InfoCadastroRequest infoCadastro) {
		this.infoCadastro = infoCadastro;
	}	
}
