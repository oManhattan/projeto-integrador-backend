package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"venda", "produto", "quantidade"})
public class CarrinhoVendaResponse extends CarrinhoVendaRequest {

}
