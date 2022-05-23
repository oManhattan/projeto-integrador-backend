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
@Table(name = "SERVICO")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SERVICO")
	private Integer id;
	
	@ManyToOne(targetEntity = Empresa.class)
//	@JoinColumn(name = "ID_EMPRESA", nullable = false)
	private Empresa idEmpresa;
	
	@OneToMany(mappedBy = "idServico", targetEntity = CarrinhoOrdemServico.class)
	private List<CarrinhoOrdemServico> carrinhoOrdemServico;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "PRECO")
	private Double preco;

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

	public List<CarrinhoOrdemServico> getCarrinhoOrdemServico() {
		return carrinhoOrdemServico;
	}

	public void setCarrinhoOrdemServico(List<CarrinhoOrdemServico> carrinhoOrdemServico) {
		this.carrinhoOrdemServico = carrinhoOrdemServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
