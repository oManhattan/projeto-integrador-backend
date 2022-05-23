package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.ClienteRequest;
import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.VendaRequest;
import com.example.pdvsystem.api.dto.VendaResponse;
import com.example.pdvsystem.businessLogic.model.Cliente;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.businessLogic.model.Usuario;
import com.example.pdvsystem.businessLogic.model.Venda;

public class VendaConverter {

	public static VendaResponse toVendaResponse(Venda venda) {
		
		VendaResponse vendaResponse = new VendaResponse();

		vendaResponse.setIdVenda(venda.getId());
		vendaResponse.setPrecoTotal(venda.getPrecoTotal());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(venda.getIdEmpresa().getId());
		
		vendaResponse.setEmpresa(empresaRequest);
		
		UsuarioRequest usuarioRequest = new UsuarioRequest();
		usuarioRequest.setIdUsuario(venda.getIdUsuario().getId());
		
		vendaResponse.setUsuario(usuarioRequest);
		
		ClienteRequest clienteRequest = new ClienteRequest();
		clienteRequest.setIdCliente(venda.getIdCliente().getId());
		
		vendaResponse.setCliente(clienteRequest);
		
		return vendaResponse;
	}
	
	public static VendaRequest toVendaRequest(Venda venda) {
		
		VendaRequest vendaRequest = new VendaRequest();
		
		vendaRequest.setIdVenda(venda.getId());
		vendaRequest.setPrecoTotal(venda.getPrecoTotal());
		
		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(venda.getIdEmpresa().getId());
		
		vendaRequest.setEmpresa(empresaRequest);
		
		UsuarioRequest usuarioRequest = new UsuarioRequest();
		usuarioRequest.setIdUsuario(venda.getIdUsuario().getId());
		
		vendaRequest.setUsuario(usuarioRequest);
		
		ClienteRequest clienteRequest = new ClienteRequest();
		clienteRequest.setIdCliente(venda.getIdCliente().getId());
		
		vendaRequest.setCliente(clienteRequest);
		
		return vendaRequest;
	}
	
	public static Venda toVenda(VendaRequest vendaRequest) {
		
		Venda venda = new Venda();
		
		venda.setId(vendaRequest.getIdVenda());
		
		Empresa empresa = new Empresa();
		empresa.setId(vendaRequest.getEmpresa().getIdEmpresa());
		venda.setIdEmpresa(empresa);
		
		Usuario usuario = new Usuario();
		usuario.setId(vendaRequest.getUsuario().getIdUsuario());
		venda.setIdUsuario(usuario);
		
		Cliente cliente = new Cliente();
		cliente.setId(vendaRequest.getCliente().getIdCliente());
		venda.setIdCliente(cliente);
		
		return venda;
	}
	
}
