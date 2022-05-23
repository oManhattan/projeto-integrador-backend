package com.example.pdvsystem.businessLogic.converter;

import com.example.pdvsystem.api.dto.EmpresaRequest;
import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.api.dto.UsuarioRequest;
import com.example.pdvsystem.api.dto.UsuarioResponse;
import com.example.pdvsystem.businessLogic.model.Empresa;
import com.example.pdvsystem.businessLogic.model.InfoCadastro;
import com.example.pdvsystem.businessLogic.model.Usuario;

public class UsuarioConverter {

	public static UsuarioResponse toUsuarioResponse(Usuario usuario) {

		UsuarioResponse usuarioResponse = new UsuarioResponse();

		usuarioResponse.setIdUsuario(usuario.getId());
		usuarioResponse.setNome(usuario.getNome());
		usuarioResponse.setEmail(usuario.getEmail());
		usuarioResponse.setSenha(usuario.getSenha());
		usuarioResponse.setDocumento(usuario.getDocumento());

		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(usuario.getIdEmpresa().getId());

		usuarioResponse.setEmpresa(empresaRequest);

		InfoCadastroRequest cadastroRequest = new InfoCadastroRequest();
		cadastroRequest.setIdInfoCadastro(usuario.getIdInfoCadastro().getId());

		usuarioResponse.setInfoCadastro(cadastroRequest);

		return usuarioResponse;
	}

	public static UsuarioRequest toUsuarioRequest(Usuario usuario) {

		UsuarioRequest usuarioRequest = new UsuarioRequest();
		
		usuarioRequest.setIdUsuario(usuario.getId());
		usuarioRequest.setNome(usuario.getNome());
		usuarioRequest.setEmail(usuario.getEmail());
		usuarioRequest.setSenha(usuario.getSenha());
		usuarioRequest.setDocumento(usuario.getDocumento());

		EmpresaRequest empresaRequest = new EmpresaRequest();
		empresaRequest.setIdEmpresa(usuario.getIdEmpresa().getId());

		usuarioRequest.setEmpresa(empresaRequest);

		InfoCadastroRequest cadastroRequest = new InfoCadastroRequest();
		cadastroRequest.setIdInfoCadastro(usuario.getIdInfoCadastro().getId());

		usuarioRequest.setInfoCadastro(cadastroRequest);
		
		return usuarioRequest;
	}
	
	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioRequest.getIdUsuario());
		usuario.setNome(usuarioRequest.getNome());
		usuario.setEmail(usuarioRequest.getEmail());
		usuario.setSenha(usuarioRequest.getSenha());
		usuario.setDocumento(usuarioRequest.getDocumento());
		
		Empresa empresa = new Empresa();
		empresa.setId(usuarioRequest.getEmpresa().getIdEmpresa());
		usuario.setIdEmpresa(empresa);
		
		InfoCadastro infoCadastro = new InfoCadastro();
		infoCadastro.setId(usuarioRequest.getInfoCadastro().getIdInfoCadastro());
		usuario.setIdInfoCadastro(infoCadastro);
		
		return usuario;
	}
}
