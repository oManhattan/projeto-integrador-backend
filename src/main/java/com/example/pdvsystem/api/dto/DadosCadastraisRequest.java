package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"usuario", "empresa", "info_cadastro"})
public class DadosCadastraisRequest {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("usuario")
	private UsuarioRequest usuario;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("info_cadastro")
	private InfoCadastroRequest infoCadastro;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("empresa")
	private EmpresaRequest empresa;

	public UsuarioRequest getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioRequest usuario) {
		this.usuario = usuario;
	}

	public InfoCadastroRequest getInfoCadastro() {
		return infoCadastro;
	}

	public void setInfoCadastro(InfoCadastroRequest infoCadastro) {
		this.infoCadastro = infoCadastro;
	}

	public EmpresaRequest getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaRequest empresa) {
		this.empresa = empresa;
	}
}
