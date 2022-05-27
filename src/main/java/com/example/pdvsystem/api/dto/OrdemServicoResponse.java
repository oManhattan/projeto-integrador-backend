package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idOrdemServico", "idEmpresa", "idUsuario", "idCliente", "listaServico", "descricao", "precoTotal"})
public class OrdemServicoResponse extends OrdemServicoRequest {

}
