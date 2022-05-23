package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.InfoCadastro;

public interface InfoCadastroRepository extends JpaRepository<InfoCadastro, Integer> {
	
}
