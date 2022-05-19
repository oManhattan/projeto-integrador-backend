package com.example.pdvsystem.businessLogic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@SequenceGenerator(name = "USUARIO_ID_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_ID_SEQUENCE")
	@Column(name = "USUARIO_ID", nullable = false, unique = true)
	private int id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "ISMASTER", nullable = false)
	private boolean isMaster;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@Column(name = "SENHA", nullable = false)
	private String senha;
	
	@Column(name = "DOCUMENTO", nullable = false, unique = true)
	private String documento;
	
	@ManyToOne
	@JoinColumn(name = "EMPRESA_ID", referencedColumnName = "EMPRESA_ID", nullable = false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "INFO_CADASTRO_ID", referencedColumnName = "INFO_CADASTRO_ID", nullable = false)
	private InfoCadastro infoCadastro;
	
	
	public Usuario(int id, String nome, String email, String senha, String documento, boolean isMaster) {
		super();
		this.id = id;
		this.nome = nome;
		this.isMaster = isMaster;
		this.email = email;
		this.senha = senha;
		this.documento = documento;
	}
	
	public Usuario(String nome, String email, String senha, String documento, boolean isMaster) {
		super();
		this.nome = nome;
		this.isMaster = isMaster;
		this.email = email;
		this.senha = senha;
		this.documento = documento;
	}

	public Usuario() {
		
	}
	
	public boolean isMaster() {
		return isMaster;
	}

	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public InfoCadastro getInfoCadastro() {
		return infoCadastro;
	}

	public void setInfoCadastro(InfoCadastro infoCadastro) {
		this.infoCadastro = infoCadastro;
	}
}
