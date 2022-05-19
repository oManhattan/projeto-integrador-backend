package com.example.pdvsystem.businessLogic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class Empresa {

	@Id
	@SequenceGenerator(name = "EMPRESA_ID_SEQUENCE", allocationSize = 1, sequenceName = "EMPRESA_ID_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPRESA_ID_SEQUENCE")
	@Column(name = "EMPRESA_ID", nullable = false, unique = true)
	private int id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "DOCUMENTO", nullable = false, unique = true)
	private String documento;

	@OneToMany(mappedBy = "empresa")
	private List<Usuario> usuarios;

	// Constructors
	
	public Empresa(int id, String nome, String documento) {
		super();
		this.id = id;
		this.nome = nome;
		this.documento = documento;
	}

	public Empresa(String nome, String documento) {
		super();
		this.nome = nome;
		this.documento = documento;
	}

	public Empresa() {

	}

	// Getters & Setters

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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
