package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idVenda", "idEmpresa", "idUsuario", "idCliente", "listaProduto", "precoTotal"})
public class VendaResponse extends VendaRequest {

}
