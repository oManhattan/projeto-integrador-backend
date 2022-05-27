package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idServico", "empresa", "nome", "preco"})
public class ServicoResponse extends ServicoRequest {

}
