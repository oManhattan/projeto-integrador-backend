package com.example.pdvsystem.businessLogic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPRESA", nullable = false)
	private Integer id;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = Usuario.class)
//	@JoinColumn(name = "ID_USUARIO")
	private List<Usuario> usuario;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = Cliente.class)
//	@JoinColumn(name = "ID_CLIENTE")
	private List<Cliente> cliente;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = Produto.class)
//	@JoinColumn(name = "ID_PRODUTO")
	private List<Produto> produto;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = Servico.class)
//	@JoinColumn(name = "ID_SERVICO")
	private List<Servico> servico;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = Venda.class)
	private List<Venda> venda;
	
	@OneToMany(mappedBy = "idEmpresa", targetEntity = OrdemServico.class)
	private List<OrdemServico> ordemServico;
	
	@Column(name = "NOME_EMPRESA", nullable = false)
	private String nomeEmpresa;
	
	@Column(name = "DOCUMENTO", nullable = false, unique = true)
	private String documento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
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

	public List<Venda> getVenda() {
		return venda;
	}

	public void setVenda(List<Venda> venda) {
		this.venda = venda;
	}

	public List<OrdemServico> getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(List<OrdemServico> ordemServico) {
		this.ordemServico = ordemServico;
	}
}
