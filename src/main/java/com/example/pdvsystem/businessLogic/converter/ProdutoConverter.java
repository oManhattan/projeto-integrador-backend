package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.ProdutoRequest;
import com.example.pdvsystem.api.dto.ProdutoResponse;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.businessLogic.model.Produto;

public class ProdutoConverter {

	public static ProdutoResponse toProdutoResponse(Produto produto) {
		
		ProdutoResponse produtoResponse = new ProdutoResponse();
		
		produtoResponse.setIdProduto(produto.getId());
		produtoResponse.setNome(produto.getNome());
		produtoResponse.setPreco(produto.getPreco());
		produtoResponse.setQuantidade(produto.getQuantidade());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(produto.getIdEmpresa().getId());
		
		produtoResponse.setEmpresa(empresaRequest);
		
		return produtoResponse;
	}
	
	public static ProdutoRequest toProdutoRequest(Produto produto) {
		
		ProdutoRequest produtoRequest = new ProdutoRequest();
		
		produtoRequest.setIdProduto(produto.getId());
		produtoRequest.setNome(produto.getNome());
		produtoRequest.setPreco(produto.getPreco());
		produtoRequest.setQuantidade(produto.getQuantidade());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(produto.getIdEmpresa().getId());
		
		produtoRequest.setEmpresa(empresaRequest);
		
		return produtoRequest;
	}
	
	public static Produto toProduto(ProdutoRequest produtoRequest) {
		
		Produto produto = new Produto();
		
		produto.setId(produtoRequest.getIdProduto());
		produto.setNome(produtoRequest.getNome());
		produto.setPreco(produtoRequest.getPreco());
		produto.setQuantidade(produtoRequest.getQuantidade());
		
		Empresa empresa = new Empresa();
		empresa.setId(produtoRequest.getEmpresa().getIdEmpresa());
		produto.setIdEmpresa(empresa);
		
		return produto;
	}
}
