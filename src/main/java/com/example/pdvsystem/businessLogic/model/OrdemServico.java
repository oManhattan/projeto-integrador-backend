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
@Table(name = "ORDEM_SERVICO")
public class OrdemServico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ORDEM_SERVICO")
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
	
	@OneToMany(mappedBy = "idOrdemServico", targetEntity = CarrinhoOrdemServico.class)
	private List<CarrinhoOrdemServico> carrinhoOrdemServico;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "VALOR_TOTAL", nullable = false)
	private Double valorTotal;
	
	@Column(name = "METODO_PAGAMENTO", nullable = false)
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

	public List<CarrinhoOrdemServico> getCarrinhoOrdemServico() {
		return carrinhoOrdemServico;
	}

	public void setCarrinhoOrdemServico(List<CarrinhoOrdemServico> carrinhoOrdemServico) {
		this.carrinhoOrdemServico = carrinhoOrdemServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
}
