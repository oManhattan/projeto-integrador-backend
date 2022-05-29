package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idInfoCadastro", "logradouro", "numero", "complemento", "bairro", "cidade", "cep"})
public class InfoCadastroResponse extends InfoCadastroRequest {
	
}
