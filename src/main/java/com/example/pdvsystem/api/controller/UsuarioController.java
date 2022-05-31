package com.example.pdvsystem.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.EmpresaResponse;
import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.service.EmpresaService;
import com.example.pdvsystem.businessLogic.service.UsuarioService;

@RestController
@RequestMapping(value = "/pdv/")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping(value = "/get/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> getUsuarioById(@RequestParam(value = "id") Integer id) {
		
		UsuarioResponse response = usuarioService.getUsuarioByIdResponse(id);
		
		if (response == null) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.FOUND);
	}
	
	@GetMapping(value = "/get/usuario/all/empresa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UsuarioResponse>> getAllUsuarioFromEmpresa(@RequestParam(value = "id") Integer id) {
		
		List<UsuarioResponse> response = usuarioService.getAllUsuarioFromEmpresa(id);
		
		if (response == null) {
			return new ResponseEntity<List<UsuarioResponse>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<UsuarioResponse>>(response, HttpStatus.FOUND);
	}
	
	@PostMapping(value = "/post/usuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> createUsuario(@RequestBody UsuarioRequest request) {
		
		EmpresaResponse empresa = empresaService.createEmpresa(request.getEmpresa());
		
		request.setEmpresa(empresa);
		
		UsuarioResponse response = usuarioService.createUsuario(request);
		
		if (response == null) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/post/usuario/cadastro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> createUsuarioCadastro(@RequestBody UsuarioRequest request) {
		
		request.setEmpresa(new EmpresaRequest());
		request.setCadastro(new InfoCadastroRequest());
		
		UsuarioResponse response = new UsuarioResponse();
		
		response = usuarioService.createUsuario(request);
		
		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "post/usuario/empresa", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> createUsuarioWithEmpresa(@RequestParam(value = "id") Integer id, @RequestBody UsuarioRequest request) {
		
		EmpresaRequest empresa = empresaService.getEmpresaByIdRequest(id);
		
		if (empresa == null) {
			System.out.println("Não encontrou empresa");
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_FOUND);
		}
		
		request.setEmpresa(empresa);
		
		UsuarioResponse response = usuarioService.createUsuario(request);
		
		if (response == null) {
			System.out.println("Usuario null");
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.CREATED);
	}
}
