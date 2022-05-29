package com.example.pdvsystem.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping(value = "/get/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> buscarUsuarioPorId(@RequestParam(value = "id") Integer id) {
		
		if (!usuarioService.usuarioExiste(id)) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<UsuarioResponse>(usuarioService.getUsuariobyId(id), HttpStatus.ACCEPTED);
	}

	/**
	 * Função para criar o primeiro cadastro do usuário.
	 * 
	 * Parâmetros: email, senha, is_master
	 * 
	 * @param usuario
	 * @return
	 */
	@PostMapping(value = "/cadastro", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> criarUsuario(@RequestBody UsuarioRequest usuario) {

		if (usuarioService.emailExiste(usuario)) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.CONFLICT);
		}

		return new ResponseEntity<UsuarioResponse>(usuarioService.criarUsuario(usuario), HttpStatus.CREATED);
	}

	/**
	 * Função para verificar o login do usuário
	 * 
	 * Parâmetros: email, senha
	 * 
	 * @param usuario
	 * @return
	 */
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> verificaLogin(@RequestBody UsuarioRequest usuario) {

		if (!usuarioService.loginValidation(usuario)) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_ACCEPTABLE);
		}

		UsuarioResponse response = usuarioService.getUsuarioByEmail(usuario);

		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.ACCEPTED);
	}	
	
	@PutMapping(value = "/put/cadastro")
	public ResponseEntity<UsuarioResponse> atualizarUsuario(@RequestParam(value = "id") Integer id, @RequestBody UsuarioRequest usuario) {
		
		if (!usuarioService.usuarioExiste(id)) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.NOT_FOUND);
		}
		
		if (usuarioService.documentoExiste(usuario) && !usuario.getDocumento().equals(usuarioService.getUsuariobyId(id).getDocumento())) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.CONFLICT);
		}
		
		if (usuarioService.emailExiste(usuario) && !usuario.getEmail().equals(usuarioService.getUsuariobyId(id).getEmail())) {
			return new ResponseEntity<UsuarioResponse>(HttpStatus.CONFLICT);
		}
		
		usuario.setSenha(usuarioService.getUsuariobyId(id).getSenha());
		
		UsuarioResponse response = usuarioService.atualizarUsuario(usuario);
		
		return new ResponseEntity<UsuarioResponse>(response, HttpStatus.CREATED);
	}
}
