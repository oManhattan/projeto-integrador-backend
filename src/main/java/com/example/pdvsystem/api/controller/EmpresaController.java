package com.example.pdvsystem.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.EmpresaResponse;
import com.example.pdvsystem.businessLogic.service.EmpresaService;

@RestController
@RequestMapping("/pdv/")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping(value = "/empresa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmpresaResponse> fetchEmpresas(@RequestParam(value = "id") Integer id) {
		
		return ResponseEntity.ok(empresaService.buscarEmpresaPorId(id));
	}
	
	@PostMapping(value = "/empresa", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmpresaResponse> criarEmpresa(@RequestBody EmpresaRequest empresaRequest) {
		return ResponseEntity.ok(empresaService.criarEmpresa(empresaRequest));
	}
}
