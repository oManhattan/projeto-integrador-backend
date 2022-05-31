package com.example.pdvsystem.businessLogic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.converter.UsuarioConverter;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.businessLogic.model.InfoCadastro;
import com.example.pdvsystem.businessLogic.model.Usuario;
import com.example.pdvsystem.dataAccess.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioResponse getUsuarioByIdResponse(Integer id) {
		
		UsuarioResponse response = new UsuarioResponse();
		
//		try {
			Usuario model = usuarioRepository.getById(id);
			response = UsuarioConverter.toUsuarioResponse(model);
//		} catch (Exception e) {
//			return null;
//		}
		
		return response;
	}
	
	public List<UsuarioResponse> getAllUsuarioFromEmpresa(Integer id) {
		
		List<UsuarioResponse> listaUsuario = new ArrayList<UsuarioResponse>();
		
//		try {
			listaUsuario = UsuarioConverter.toListUsuarioResponse(usuarioRepository.findUsuarioByEmpresaId(id));
//		} catch (Exception e) {
//			return null;
//		}
		
		return listaUsuario;
	}
	
	public UsuarioRequest getUsuarioByIdRequest(Integer id) {
		
		UsuarioRequest request = new UsuarioRequest();
		
//		try {
			Usuario model = usuarioRepository.getById(id);
			request = UsuarioConverter.toUsuarioRequest(model);
//		} catch (Exception e) {
//			return null;
//		}
		
		return request;
	}
	
	public UsuarioResponse createUsuario(UsuarioRequest request) {
		
		Usuario model = UsuarioConverter.toUsuario(request);
		
//		try {
			return UsuarioConverter.toUsuarioResponse(usuarioRepository.save(model));
//		} catch (Exception e) {
//			return null;
//		}
	}
	
	
	
}
