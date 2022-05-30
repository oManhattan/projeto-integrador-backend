package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id_usuario", "nome", "documento", "email", "senha", "is_master", "empresa", "info_cadastro"})
public class UsuarioResponse extends UsuarioRequest {

}
