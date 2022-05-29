package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"usuario", "empresa", "info_cadastro"})
public class DadosCadastraisResponse extends DadosCadastraisRequest {

}
