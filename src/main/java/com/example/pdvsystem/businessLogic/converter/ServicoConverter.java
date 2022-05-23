package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.ServicoRequest;
import com.example.pdvsystem.api.dto.ServicoResponse;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.businessLogic.model.Servico;

public class ServicoConverter {

	public static ServicoResponse toServicoResponse(Servico servico) {
		
		ServicoResponse servicoResponse = new ServicoResponse();
		
		servicoResponse.setIdServico(servico.getId());
		servicoResponse.setNome(servico.getNome());
		servicoResponse.setPreco(servico.getPreco());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(servico.getIdEmpresa().getId());
		
		servicoResponse.setEmpresa(empresaRequest);
		
		return servicoResponse;
	}
	
	public static ServicoRequest toServicoRequest(Servico servico) {
		
		ServicoRequest servicoRequest = new ServicoRequest();
		
		servicoRequest.setIdServico(servico.getId());
		servicoRequest.setNome(servico.getNome());
		servicoRequest.setPreco(servico.getPreco());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(servico.getIdEmpresa().getId());
		
		servicoRequest.setEmpresa(empresaRequest);
		
		return servicoRequest;
	}
	
	public static Servico toServico(ServicoRequest servicoRequest) {
		
		Servico servico = new Servico();
		
		servico.setId(servicoRequest.getIdServico());
		servico.setNome(servicoRequest.getNome());
		servico.setPreco(servicoRequest.getPreco());
		
		Empresa empresa = new Empresa();
		empresa.setId(servicoRequest.getEmpresa().getIdEmpresa());
		servico.setIdEmpresa(empresa);
		
		return servico;
	}
	
}
