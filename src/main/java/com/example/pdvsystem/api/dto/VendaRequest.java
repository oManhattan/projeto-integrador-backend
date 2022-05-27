package com.example.pdvsystem.api.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idVenda", "idEmpresa", "idUsuario", "idCliente", "listaProduto", "precoTotal"})
public class VendaRequest {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_venda")
	private Integer idVenda;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_venda")
	private EmpresaRequest empresa;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_usuario")
	private UsuarioRequest usuario;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_cliente")
	private ClienteRequest cliente;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("id_produto_quantidade")
	private Map<ProdutoRequest, Integer> listaProduto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("preco_total")
	private Double precoTotal;

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public EmpresaRequest getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaRequest empresa) {
		this.empresa = empresa;
	}

	public UsuarioRequest getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioRequest usuario) {
		this.usuario = usuario;
	}

	public ClienteRequest getCliente() {
		return cliente;
	}

	public void setCliente(ClienteRequest cliente) {
		this.cliente = cliente;
	}
	
	public Map<ProdutoRequest, Integer> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(Map<ProdutoRequest, Integer> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	
}
