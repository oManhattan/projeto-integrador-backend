package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.Venda;

public interface VendaRepository  extends JpaRepository<Venda, Integer>{

}
