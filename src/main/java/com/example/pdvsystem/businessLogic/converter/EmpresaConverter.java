package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.EmpresaResponse;
import com.example.pdvsystem.businessLogic.model.Empresa;

public class EmpresaConverter {

	public static EmpresaResponse toEmpresaResponse(Empresa empresa) {
		
		EmpresaResponse empresaResponse = new EmpresaResponse();
		
		empresaResponse.setIdEmpresa(empresa.getId());
		empresaResponse.setNomeEmpresa(empresa.getNomeEmpresa());
		empresaResponse.setDocumento(empresa.getDocumento());
		
		return empresaResponse;
	}
	
	public static EmpresaRequest toEmpresaRequest(Empresa empresa) {
		EmpresaRequest empresaRequest = new EmpresaRequest();
		
		empresaRequest.setIdEmpresa(empresa.getId());
		empresaRequest.setNomeEmpresa(empresa.getNomeEmpresa());
		empresaRequest.setDocumento(empresa.getDocumento());
		
		return empresaRequest;
	}
	
	public static Empresa toEmpresa(EmpresaRequest empresaRequest) {
		
		Empresa empresa = new Empresa();
		
		empresa.setId(empresaRequest.getIdEmpresa());
		empresa.setNomeEmpresa(empresaRequest.getNomeEmpresa());
		empresa.setDocumento(empresaRequest.getDocumento());
		
		return empresa;
	}
}
