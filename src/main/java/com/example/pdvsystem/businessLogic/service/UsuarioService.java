package com.example.pdvsystem.businessLogic.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public UsuarioResponse atualizarUsuario(UsuarioRequest usuarioRequest) {
		
		if (usuarioRepository.findById(usuarioRequest.getIdUsuario()).isEmpty()) {
			throw new RuntimeException("Usuário não encontrado");
		}
		
		Usuario usuario = UsuarioConverter.toUsuario(usuarioRequest);
		return UsuarioConverter.toUsuarioResponse(usuario);
	}
	
	public UsuarioResponse getUsuariobyId(Integer id) {
		
		UsuarioResponse usuarioResponse = UsuarioConverter.toUsuarioResponse(usuarioRepository.getById(id));
		return usuarioResponse;
	}
	
	public List<UsuarioResponse> getAllUsuarios() {
		List<Usuario> listaUsuario = usuarioRepository.findAll();
		List<UsuarioResponse> convertedList = new ArrayList<UsuarioResponse>();
		
		for (int i = 0; i < listaUsuario.size(); i++) {
			convertedList.add(UsuarioConverter.toUsuarioResponse(listaUsuario.get(i)));
		}
		
		return convertedList;
	}
	
}
