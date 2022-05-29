package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idUsuario", "empresa", "nome", "isMaster", "email", "senha", "documento", "infoCadastro"})
public class UsuarioRequest {

	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("id_usuario")
	private Integer idUsuario; 
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("id_empresa")
	private EmpresaRequest empresa;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("nome")
	private String nome;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("is_master")
	private Boolean isMaster;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("email")
	private String email;
	
	@JsonIgnore
	@JsonProperty("senha")
	private String senha;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("documento")
	private String documento;

	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty("id_info_cadastro")
	private InfoCadastroRequest infoCadastro;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	@JsonProperty
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}	
	
	
}
