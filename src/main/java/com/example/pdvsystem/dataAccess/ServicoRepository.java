package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
