package com.example.pdvsystem.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdvsystem.api.dto.DadosCadastraisRequest;
import com.example.pdvsystem.api.dto.DadosCadastraisResponse;
import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.businessLogic.service.EmpresaService;
import com.example.pdvsystem.businessLogic.service.InfoCadastroService;
import com.example.pdvsystem.businessLogic.service.UsuarioService;

@RestController
@RequestMapping(path = "/pdv/")
public class DadosCadastraisController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	InfoCadastroService infoCadastroService;
	
	@Autowired
	EmpresaService empresaService;
	
	@PostMapping(value = "dados-cadastrais", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DadosCadastraisResponse> concluirCadastro(@RequestParam(value = "usuario-id") Integer id, @RequestBody DadosCadastraisRequest dadosCadastrais) {
		
		if (!usuarioService.usuarioExiste(id)) {
			return new ResponseEntity<DadosCadastraisResponse>(HttpStatus.NOT_FOUND);
		}
		
		if (empresaService.documentoExiste(dadosCadastrais.getEmpresa())) {
			return new ResponseEntity<DadosCadastraisResponse>(HttpStatus.CONFLICT);
		}
		
		if (usuarioService.documentoExiste(dadosCadastrais.getUsuario())) {
			return new ResponseEntity<DadosCadastraisResponse>(HttpStatus.CONFLICT);
		}
		
		UsuarioRequest usuario = dadosCadastrais.getUsuario();
		EmpresaRequest empresa = empresaService.criarEmpresa(dadosCadastrais.getEmpresa());
		InfoCadastroRequest infoCadastro = infoCadastroService.criarInfoCadastro(dadosCadastrais.getInfoCadastro());
		
		usuario.setSenha(usuarioService.getUsuariobyId(id).getSenha());
		usuario.setEmpresa(empresa);
		usuario.setInfoCadastro(infoCadastro);
		usuarioService.atualizarUsuario(usuario);
		
		DadosCadastraisResponse response = new DadosCadastraisResponse();
		
		response.setEmpresa(empresa);
		response.setInfoCadastro(infoCadastro);
		response.setUsuario(usuario);
		
		return new ResponseEntity<DadosCadastraisResponse>(response, HttpStatus.CREATED);
	}
}
