package com.example.pdvsystem.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdvsystem.api.dto.ClienteRequest;
import com.example.pdvsystem.api.dto.ClienteResponse;
import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.businessLogic.service.ClienteService;
import com.example.pdvsystem.businessLogic.service.EmpresaService;

@RestController
@RequestMapping(value = "/pdv/")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@Autowired
	EmpresaService empresaService;
	
	@CrossOrigin
	@PostMapping(value = "/post/cliente/empresa")
	public ResponseEntity<ClienteResponse> createCliente(@RequestParam(value = "id") Integer id, @RequestBody ClienteRequest request) {
		
		EmpresaRequest empresa = empresaService.getEmpresaByIdRequest(id);
		
		if (empresa == null) {
			return new ResponseEntity<ClienteResponse>(HttpStatus.NOT_FOUND);
		}
		
		if (clienteService.documentoExisteNaEmpresa(id, request.getDocumento())) {
			return new ResponseEntity<ClienteResponse>(HttpStatus.CONFLICT);
		}
		
		request.setEmpresa(empresa);
		
		ClienteResponse response = clienteService.createCliente(request);
		
		return new ResponseEntity<ClienteResponse>(response, HttpStatus.CREATED);
	}
	
}
