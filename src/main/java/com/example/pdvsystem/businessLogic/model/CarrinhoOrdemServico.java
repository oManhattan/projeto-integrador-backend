package com.example.pdvsystem.businessLogic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRINHO_ORDERM_SERVICO")
public class CarrinhoOrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DATA_LANCAMENTO")
	private Date dataLancamento;
	
	@ManyToOne(targetEntity = OrdemServico.class)
//	@JoinColumn(name = "ID_ORDEM_SERVICO")
	private OrdemServico idOrdemServico;
	
	@ManyToOne(targetEntity = Servico.class)
//	@JoinColumn(name = "ID_SERVICO")
	private Servico idServico;

	public OrdemServico getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(OrdemServico idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public Servico getIdServico() {
		return idServico;
	}

	public void setIdServico(Servico idServico) {
		this.idServico = idServico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
