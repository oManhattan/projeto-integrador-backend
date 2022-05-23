package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
