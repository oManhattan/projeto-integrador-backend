package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.ClienteRequest;
import com.example.pdvsystem.api.dto.ClienteResponse;
import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.businessLogic.model.Cliente;

public class ClienteConverter {

	public static ClienteResponse toClienteResponse(Cliente cliente) {
		
		ClienteResponse clienteResponse = new ClienteResponse();
		
		clienteResponse.setIdCliente(cliente.getId());
		clienteResponse.setNome(cliente.getNome());
		clienteResponse.setEmail(cliente.getEmail());
		clienteResponse.setDocumento(cliente.getDocumento());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(cliente.getIdEmpresa().getId());
		
		clienteResponse.setEmpresa(empresaRequest);

		InfoCadastroRequest infoCadastroRequest = new InfoCadastroRequest();
		infoCadastroRequest.setIdInfoCadastro(cliente.getIdInfoCadastro().getId());
		
		clienteResponse.setInfoCadastro(infoCadastroRequest);
		
		return clienteResponse;
	}
	
	public static ClienteRequest toClienteRequest(Cliente cliente) {
		
		ClienteRequest clienteRequest = new ClienteRequest();
		
		clienteRequest.setIdCliente(cliente.getId());
		clienteRequest.setNome(cliente.getNome());
		clienteRequest.setEmail(cliente.getEmail());
		clienteRequest.setDocumento(cliente.getDocumento());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(cliente.getIdEmpresa().getId());
		
		clienteRequest.setEmpresa(empresaRequest);
		
		InfoCadastroRequest infoCadastroRequest = new InfoCadastroRequest();
		infoCadastroRequest.setIdInfoCadastro(cliente.getIdInfoCadastro().getId());
		
		clienteRequest.setInfoCadastro(infoCadastroRequest);
		
		return clienteRequest;
	}
	
	public static Cliente toCliente(ClienteRequest clienteRequest) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(clienteRequest.getIdCliente());
		cliente.setNome(clienteRequest.getNome());
		cliente.setEmail(clienteRequest.getEmail());
		cliente.setDocumento(clienteRequest.getDocumento());
		cliente.setIdEmpresa(EmpresaConverter.toEmpresa(clienteRequest.getEmpresa()));
		cliente.setIdInfoCadastro(InfoCadastroConverter.toInfoCadastro(clienteRequest.getInfoCadastro()));
		
		return cliente;
	}
}
