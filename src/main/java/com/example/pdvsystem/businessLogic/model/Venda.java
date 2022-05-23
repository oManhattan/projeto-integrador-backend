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
@Table(name = "VENDA")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VENDA", nullable = false)
	private Integer id;
	
	@ManyToOne(targetEntity = Empresa.class)
//	@JoinColumn(name = "ID_EMPRESA")
	private Empresa idEmpresa;
	
	@ManyToOne(targetEntity = Usuario.class)
//	@JoinColumn(name = "ID_USUARIO")
	private Usuario idUsuario;
	
	@ManyToOne(targetEntity = Cliente.class)
//	@JoinColumn(name = "ID_CLIENTE")
	private Cliente idCliente;
	
	@OneToMany(mappedBy = "idVenda", targetEntity = CarrinhoVenda.class)
	private List<CarrinhoVenda> carrinhoVenda;
	
	@Column(name = "PRECO_TOTAL")
	private Double precoTotal;
	
	@Column(name = "METODO_PAGAMENTO")
	private String metodoPagamento;

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

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public List<CarrinhoVenda> getCarrinhoVenda() {
		return carrinhoVenda;
	}

	public void setCarrinhoVenda(List<CarrinhoVenda> carrinhoVenda) {
		this.carrinhoVenda = carrinhoVenda;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
}
