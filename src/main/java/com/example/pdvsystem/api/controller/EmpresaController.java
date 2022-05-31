package com.example.pdvsystem.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.EmpresaResponse;
import com.example.pdvsystem.businessLogic.service.EmpresaService;

@RestController
@RequestMapping(value = "/pdv/")
public class EmpresaController {

	@Autowired
	EmpresaService empresaService;
	
	@GetMapping(value = "/empresa")
	public ResponseEntity<EmpresaResponse> getEmpresaById(@RequestParam(value = "id") Integer id) {
		
		EmpresaResponse response = empresaService.getEmpresaByIdResponse(id);
		
		if (response == null) {
			return new ResponseEntity<EmpresaResponse>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<EmpresaResponse>(response, HttpStatus.FOUND);
	}
	
	@PostMapping(value = "/empresa/criar")
	public ResponseEntity<EmpresaResponse> createEmpresa(@RequestBody EmpresaRequest request) {
		
		EmpresaResponse response = empresaService.createEmpresa(request);
		
		if (response == null) {
			return new ResponseEntity<EmpresaResponse>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<EmpresaResponse>(response, HttpStatus.CREATED);
	}
	
}
