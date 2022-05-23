package com.example.pdvsystem.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idProduto", "idEmpresa", "nome", "preco", "quantidade"})
public class ProdutoResponse extends ProdutoRequest {

}
