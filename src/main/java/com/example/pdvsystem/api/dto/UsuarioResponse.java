package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idUsuario", "empresa", "nome", "email", "senha", "documento", "infoCadastro"})
public class UsuarioResponse extends UsuarioRequest{

}
