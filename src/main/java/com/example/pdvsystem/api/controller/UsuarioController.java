package com.example.pdvsystem.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.service.UsuarioService;

@RestController
@RequestMapping("/pdv/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> buscarUsuarioPorId(@RequestParam(value = "id") Integer id) {
		return ResponseEntity.ok(usuarioService.getUsuariobyId(id));
	}
	
	@GetMapping(value = "/usuario/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UsuarioResponse>> getAllUsuarios() {
		return ResponseEntity.ok(usuarioService.getAllUsuarios());
	}
	
	@PostMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> criarUsuario(@RequestBody UsuarioRequest usuario) {
		return ResponseEntity.ok(usuarioService.criarUsuario(usuario));
	}
}
