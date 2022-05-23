package com.example.pdvsystem.businessLogic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE", nullable = false)
	private Integer id;
	
	@ManyToOne(targetEntity = Empresa.class)
//	@JoinColumn(name = "ID_EMPRESA", nullable = false)
	private Empresa idEmpresa;
	
	@ManyToOne(targetEntity = InfoCadastro.class)
//	@JoinColumn(name = "ID_INFO_CADASTRO", nullable = false)
	private InfoCadastro idInfoCadastro;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DOCUMENTO")
	private String documento;

	@OneToMany(mappedBy = "idCliente")
	private List<Venda> venda;
	
	@OneToMany(mappedBy = "idCliente")
	private List<OrdemServico> ordemServico;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public InfoCadastro getIdInfoCadastro() {
		return idInfoCadastro;
	}

	public void setIdInfoCadastro(InfoCadastro idInfoCadastro) {
		this.idInfoCadastro = idInfoCadastro;
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
