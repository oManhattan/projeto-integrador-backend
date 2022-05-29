package com.example.pdvsystem.businessLogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pdvsystem.api.dto.InfoCadastroRequest;
import com.example.pdvsystem.api.dto.InfoCadastroResponse;
import com.example.pdvsystem.businessLogic.converter.InfoCadastroConverter;
import com.example.pdvsystem.businessLogic.model.InfoCadastro;
import com.example.pdvsystem.dataAccess.InfoCadastroRepository;

@Service
public class InfoCadastroService {

	@Autowired
	InfoCadastroRepository infoCadastroRepository;
	
	public InfoCadastroResponse criarInfoCadastro(InfoCadastroRequest infoCadastroRequest) {
		
		InfoCadastro cadastro = InfoCadastroConverter.toInfoCadastro(infoCadastroRequest);
		
		return InfoCadastroConverter.toInfoCadastroResponse(infoCadastroRepository.save(cadastro));
	}
	
	public InfoCadastroResponse getCadastroById(Integer id) {
		
		InfoCadastro cadastro = infoCadastroRepository.getById(id);
		
		return InfoCadastroConverter.toInfoCadastroResponse(cadastro);
	}
}
