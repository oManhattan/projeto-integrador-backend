package com.example.pdvsystem.businessLogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.EmpresaResponse;
import com.example.pdvsystem.businessLogic.converter.EmpresaConverter;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.dataAccess.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public EmpresaResponse criarEmpresa(EmpresaRequest empresaRequest) {
		
		Empresa novaEmpresa = EmpresaConverter.toEmpresa(empresaRequest);
		return EmpresaConverter.toEmpresaResponse(empresaRepository.save(novaEmpresa));
	}
	
	public EmpresaResponse atualizarEmpresa(EmpresaRequest empresaRequest) {
		
		if (empresaRepository.findById(empresaRequest.getIdEmpresa()).isEmpty()) {
			throw new RuntimeException("Empresa não encontrada");
		}
		
		Empresa novaEmpresa = EmpresaConverter.toEmpresa(empresaRequest);
		return EmpresaConverter.toEmpresaResponse(empresaRepository.save(novaEmpresa));
	}
	
	public EmpresaResponse buscarEmpresaPorId(Integer id) {
		
		EmpresaResponse empresaResponse = new EmpresaResponse();
		
		empresaResponse = EmpresaConverter.toEmpresaResponse(empresaRepository.getById(id));
		
		return empresaResponse;
	}
	
	public EmpresaResponse excluirEmpresa(Integer id) {
		
		if (empresaRepository.findById(id).isEmpty()) {
			throw new RuntimeException("Empresa não encontrada");
		}
		
		EmpresaResponse empresaResponse = new EmpresaResponse();
		empresaResponse.setIdEmpresa(id);
		
		empresaRepository.deleteById(id);
		return empresaResponse;
	}
}