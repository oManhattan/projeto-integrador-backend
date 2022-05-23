package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idEmpresa", "nomeEmpresa", "documento"})
public class EmpresaResponse extends EmpresaRequest{

}
