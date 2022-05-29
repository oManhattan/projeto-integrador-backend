package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.model.Usuario;

public class UsuarioConverter {

	public static UsuarioResponse toUsuarioResponse(Usuario usuario) {

		UsuarioResponse usuarioResponse = new UsuarioResponse();

		usuarioResponse.setIdUsuario(usuario.getId());
		usuarioResponse.setNome(usuario.getNome());
		usuarioResponse.setEmail(usuario.getEmail());
		usuarioResponse.setSenha(usuario.getSenha());
		usuarioResponse.setDocumento(usuario.getDocumento());
		usuarioResponse.setIsMaster(usuario.getIsMaster());

		if (usuario.getIdEmpresa() != null) {
			usuarioResponse.setEmpresa(EmpresaConverter.toEmpresaRequest(usuario.getIdEmpresa()));
		}
		
		if (usuario.getIdInfoCadastro() != null) {
			usuarioResponse.setInfoCadastro(InfoCadastroConverter.toInfoCadastroRequest(usuario.getIdInfoCadastro()));
		}

		return usuarioResponse;
	}

	public static UsuarioRequest toUsuarioRequest(Usuario usuario) {

		UsuarioRequest usuarioRequest = new UsuarioRequest();
		
		usuarioRequest.setIdUsuario(usuario.getId());
		usuarioRequest.setNome(usuario.getNome());
		usuarioRequest.setEmail(usuario.getEmail());
		usuarioRequest.setSenha(usuario.getSenha());
		usuarioRequest.setDocumento(usuario.getDocumento());
		usuarioRequest.setIsMaster(usuario.getIsMaster());
		
		if (usuario.getIdEmpresa() != null) {
			usuarioRequest.setEmpresa(EmpresaConverter.toEmpresaRequest(usuario.getIdEmpresa()));
		}
		
		if (usuario.getIdInfoCadastro() != null) {
			usuarioRequest.setInfoCadastro(InfoCadastroConverter.toInfoCadastroRequest(usuario.getIdInfoCadastro()));

		}
		
		return usuarioRequest;
	}
	
	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioRequest.getIdUsuario());
		usuario.setNome(usuarioRequest.getNome());
		usuario.setEmail(usuarioRequest.getEmail());
		usuario.setSenha(usuarioRequest.getSenha());
		usuario.setDocumento(usuarioRequest.getDocumento());
		usuario.setIsMaster(usuarioRequest.getIsMaster());
		
		System.out.println(usuarioRequest.getEmpresa() != null);
		
		if (usuarioRequest.getEmpresa() != null) { 
			usuario.setIdEmpresa(EmpresaConverter.toEmpresa(usuarioRequest.getEmpresa()));
		}
		
		if (usuarioRequest.getInfoCadastro() != null) {
			usuario.setIdInfoCadastro(InfoCadastroConverter.toInfoCadastro(usuarioRequest.getInfoCadastro()));
		}
		
		return usuario;
	}
}
