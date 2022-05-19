package com.example.pdvsystem.businessLogic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@SequenceGenerator(name = "CLIENTE_ID_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_ID_SEQUENCE")
	@Column(name = "ID", nullable = false, unique = true)
	private int id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "DOCUMENTO", nullable = false, unique = true)
	private String documento;
	
	public Cliente(int id, String nome, String email, String documento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.documento = documento;
	}
	
	public Cliente(String nome, String email, String documento) {
		super();
		this.nome = nome;
		this.email = email;
		this.documento = documento;
	}

	public Cliente() {
		
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
