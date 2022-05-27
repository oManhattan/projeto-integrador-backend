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
@Table(name = "PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO", nullable = false)
	private Integer id;
	
	@ManyToOne(targetEntity = Empresa.class)
//	@JoinColumn(name = "ID_EMPRESA", nullable = false)
	private Empresa idEmpresa;
	
	@OneToMany(mappedBy = "idProduto", targetEntity = CarrinhoVenda.class)
	private List<CarrinhoVenda> carrinhoVenda;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "PRECO", nullable = false)
	private Double preco;

	@Column(name = "QUANTIDADE")
	private Integer quantidade;

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

	public List<CarrinhoVenda> getCarrinhoVenda() {
		return carrinhoVenda;
	}

	public void setCarrinhoVenda(List<CarrinhoVenda> carrinhoVenda) {
		this.carrinhoVenda = carrinhoVenda;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
