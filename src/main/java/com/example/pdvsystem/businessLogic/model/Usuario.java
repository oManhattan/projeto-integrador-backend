package com.example.pdvsystem.businessLogic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO", nullable = false)
	private Integer id;
	
	@ManyToOne(targetEntity = Empresa.class, cascade = CascadeType.PERSIST)
	private Empresa idEmpresa;
	
	@ManyToOne(targetEntity = InfoCadastro.class, cascade = CascadeType.PERSIST)
	private InfoCadastro idInfoCadastro;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "DOCUMENTO", unique = true)
	private String documento;
	
	@Column(name = "IS_MASTER", nullable = false)
	private Boolean isMaster;

	@OneToMany(mappedBy = "idUsuario")
	private List<Venda> venda;
	
	@OneToMany(mappedBy = "idUsuario")
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

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
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
