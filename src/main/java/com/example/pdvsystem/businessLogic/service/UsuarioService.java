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
	
	public Boolean usuarioExiste(Integer id) {
		
		if (usuarioRepository.getById(id) == null) {
			return false;
		}
		
		return true;
	}
	
	public Boolean loginValidation(UsuarioRequest usuarioRequest) {
		
		if (!emailExiste(usuarioRequest)) {
			return false;
		}
		
		Usuario usuario = usuarioRepository.findByEmail(usuarioRequest.getEmail());
		
		if (usuario.getSenha().equals(usuarioRequest.getSenha())) {
			return true;
		}
		
		return false;
	}
	
	public Boolean documentoExiste(UsuarioRequest usuarioRequest) {
		
		Usuario usuario = usuarioRepository.findByDocumento(usuarioRequest.getDocumento());
		
		if (usuario == null) {
			return false;
		}
		
		return true;
	}
	
	public Boolean emailExiste(UsuarioRequest usuarioRequest) {
		
		Usuario usuario = usuarioRepository.findByEmail(usuarioRequest.getEmail());
		
		if (usuario == null) {
			return false;
		}
		
		return true;
	}
	
	public UsuarioResponse getUsuarioByEmail(UsuarioRequest usuarioRequest) {
		
		if (!emailExiste(usuarioRequest)) {
			return null;
		}
		
		return UsuarioConverter.toUsuarioResponse(usuarioRepository.findByEmail(usuarioRequest.getEmail()));
		
	}
	
	public UsuarioResponse atualizarUsuario(UsuarioRequest usuarioRequest) {
		
		if (usuarioRepository.findById(usuarioRequest.getIdUsuario()).isEmpty()) {
			throw new RuntimeException("Usuário não encontrado");
		}
		
		Usuario usuario = UsuarioConverter.toUsuario(usuarioRequest);
		return UsuarioConverter.toUsuarioResponse(usuarioRepository.save(usuario));
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
