package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.api.dto.InfoCadastroResponse;
import com.example.pdvsystem.businessLogic.model.InfoCadastro;

public class InfoCadastroConverter {

	public static InfoCadastroResponse toInfoCadastroResponse(InfoCadastro infoCadastro) {
		
		InfoCadastroResponse infoCadastroResponse = new InfoCadastroResponse();
		
		infoCadastroResponse.setIdInfoCadastro(infoCadastro.getId());
		infoCadastroResponse.setLogradouro(infoCadastro.getLogradouro());
		infoCadastroResponse.setNumero(infoCadastro.getNumero());
		infoCadastroResponse.setComplemento(infoCadastro.getComplemento());
		infoCadastroResponse.setBairro(infoCadastro.getBairro());
		infoCadastroResponse.setCidade(infoCadastro.getCidade());
		infoCadastroResponse.setCep(infoCadastro.getCep());
		
		return infoCadastroResponse;
	}
	
	public static InfoCadastroRequest toInfoCadastroRequest(InfoCadastro infoCadastro) {
		
		InfoCadastroRequest infoCadastroRequest = new InfoCadastroRequest();
		
		infoCadastroRequest.setIdInfoCadastro(infoCadastro.getId());
		infoCadastroRequest.setLogradouro(infoCadastro.getLogradouro());
		infoCadastroRequest.setNumero(infoCadastro.getNumero());
		infoCadastroRequest.setComplemento(infoCadastro.getComplemento());
		infoCadastroRequest.setBairro(infoCadastro.getBairro());
		infoCadastroRequest.setCidade(infoCadastro.getCidade());
		infoCadastroRequest.setCep(infoCadastro.getCep());
		
		return infoCadastroRequest;
	}
	
	public static InfoCadastro toInfoCadastro(InfoCadastroRequest infoCadastroRequest) {
		
		InfoCadastro infoCadastro = new InfoCadastro();
		
		infoCadastro.setId(infoCadastroRequest.getIdInfoCadastro());
		infoCadastro.setLogradouro(infoCadastroRequest.getLogradouro());
		infoCadastro.setNumero(infoCadastroRequest.getNumero());
		infoCadastro.setComplemento(infoCadastroRequest.getComplemento());
		infoCadastro.setBairro(infoCadastroRequest.getBairro());
		infoCadastro.setCidade(infoCadastroRequest.getCidade());
		infoCadastro.setCep(infoCadastroRequest.getCep());
		
		return infoCadastro;
	}
}
