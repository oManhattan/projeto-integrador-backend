package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idCliente", "empresa", "nome", "email", "documento", "infoCadastro"})
public class ClienteResponse extends ClienteRequest{

}
