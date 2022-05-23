package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.OrdemServico;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {

}
