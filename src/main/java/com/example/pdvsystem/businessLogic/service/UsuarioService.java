package com.example.pdvsystem.businessLogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.converter.UsuarioConverter;
import com.example.pdvsystem.businessLogic.model.Usuario;
import com.example.pdvsystem.dataAccess.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioResponse criarUsuario(UsuarioRequest usuarioRequest) { 
		
		Usuario novoUsuario = UsuarioConverter.toUsuario(usuarioRequest);
		return UsuarioConverter.toUsuarioResponse(usuarioRepository.save(novoUsuario));
	}
}
